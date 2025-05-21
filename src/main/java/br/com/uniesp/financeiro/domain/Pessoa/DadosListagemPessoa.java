package br.com.uniesp.financeiro.domain.Pessoa;

import br.com.uniesp.financeiro.entity.Pessoa;

public record DadosListagemPessoa(Long id, String nome, Boolean ativo) {

    public DadosListagemPessoa(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getAtivo());
    }
}
