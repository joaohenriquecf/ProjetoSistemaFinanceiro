package br.com.uniesp.financeiro.entity;

import br.com.uniesp.financeiro.domain.DadosCadastroPessoa;
import br.com.uniesp.financeiro.domain.DadosEndereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "pessoas")
@Entity(name = "Pessoa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Boolean ativo;
    @Embedded
    private Endereco endereco;
    private Lancamento lancamento;

    public Pessoa(DadosCadastroPessoa dados){
        this.ativo = true;
        this.nome = nome;
        this.endereco = new Endereco();
        this.lancamento = lancamento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Lancamento getLancamento() {
        return lancamento;
    }
}
