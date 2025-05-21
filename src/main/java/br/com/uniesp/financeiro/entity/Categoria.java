package br.com.uniesp.financeiro.entity;

import br.com.uniesp.financeiro.domain.Categoria.DadosAtualizacaoCategoria;
import br.com.uniesp.financeiro.domain.Categoria.DadosCadastroCategoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "Tb_categorias")
@Entity(name = "Categoria")
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Lancamento lancamento;

    public Categoria(DadosCadastroCategoria dados){
        this.nome = dados.nome();
    }
    
    public void atualizarInformacoes(DadosAtualizacaoCategoria dados){
        if (dados.nome() != null){
            this.nome =  dados.nome();
        }
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }
}
