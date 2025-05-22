package br.com.uniesp.financeiro.entity;

import br.com.uniesp.financeiro.domain.Categoria.DadosAtualizacaoCategoria;
import br.com.uniesp.financeiro.domain.Categoria.DadosCadastroCategoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "categorias")
@Entity(name = "Categoria")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private boolean ativo;

    public Categoria(DadosCadastroCategoria dados){
        this.nome = dados.nome();
        this.ativo = dados.ativo();
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }


    public boolean isAtivo() {
        return ativo;
    }
    
    public void atualizarInformacoes(DadosAtualizacaoCategoria dados){
        if (dados.nome() != null){
            this.nome =  dados.nome();
        }
        if (dados.ativo() != null){
            this.ativo = dados.ativo();
        }
    }



    public void deletar(){
        this.ativo = false;
    }
}
