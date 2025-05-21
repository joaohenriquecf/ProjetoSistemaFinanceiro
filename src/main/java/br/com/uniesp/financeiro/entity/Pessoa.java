package br.com.uniesp.financeiro.entity;

import br.com.uniesp.financeiro.domain.Endereco.DadosEndereco;
import br.com.uniesp.financeiro.domain.Pessoa.DadosAtualizacaoPessoa;
import br.com.uniesp.financeiro.domain.Pessoa.DadosCadastroPessoa;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "Tb_pessoas")
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

    public Pessoa(@Valid DadosCadastroPessoa dados) {
         this.nome = dados.nome();
         this.ativo = true;
         this.endereco = new Endereco(dados.endereco());
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

    public void atualizarInformacoes(DadosAtualizacaoPessoa dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.ativo() != null){
            this.ativo = dados.ativo();
        }
        if (dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }

    public void deletar() {
        this.ativo = false;
    }
}
