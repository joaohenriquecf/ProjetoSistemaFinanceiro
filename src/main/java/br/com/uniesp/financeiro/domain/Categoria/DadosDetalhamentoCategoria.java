package br.com.uniesp.financeiro.domain.Categoria;


import br.com.uniesp.financeiro.entity.Categoria;

public record DadosDetalhamentoCategoria(Long id, String nome) {

    public DadosDetalhamentoCategoria(Categoria categoria){
        this(categoria.getId(), categoria.getNome());
    }
}
