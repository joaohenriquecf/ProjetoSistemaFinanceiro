package br.com.uniesp.financeiro.domain.Categoria;

import br.com.uniesp.financeiro.entity.Categoria;

public record DadosAtualizacaoCategoria(Long id, String nome) {

    public DadosAtualizacaoCategoria(Categoria categoria){
        this(categoria.getNome());
    }
}
