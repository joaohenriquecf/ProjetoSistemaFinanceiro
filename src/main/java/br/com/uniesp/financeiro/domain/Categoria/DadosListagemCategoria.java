package br.com.uniesp.financeiro.domain.Categoria;


import br.com.uniesp.financeiro.entity.Categoria;

public record DadosListagemCategoria(Long id, String nome) {

    public DadosListagemCategoria(Categoria categoria){
        this(categoria.getId(), categoria.getNome());
    }
}
