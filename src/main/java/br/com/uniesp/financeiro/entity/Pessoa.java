package br.com.uniesp.financeiro.entity;

import br.com.uniesp.financeiro.dto.request.pessoa.DadosAtualizacaoPessoa;
import br.com.uniesp.financeiro.dto.request.pessoa.DadosCadastroPessoa;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "pessoas")
@Entity(name = "Pessoa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Boolean ativo;
    @Embedded
    private Endereco endereco;

    public Pessoa(@Valid DadosCadastroPessoa dados) {
         this.nome = dados.nome();
         this.ativo = true;
         this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoPessoa dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }

    public void deletar() {
        this.ativo = false;
    }
}
