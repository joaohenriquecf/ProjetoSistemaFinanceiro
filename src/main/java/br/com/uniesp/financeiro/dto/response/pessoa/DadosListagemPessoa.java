package br.com.uniesp.financeiro.dto.response.pessoa;

import br.com.uniesp.financeiro.entity.Pessoa;

public record DadosListagemPessoa(Long id, String nome, Boolean ativo) {

    public DadosListagemPessoa(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getAtivo());
    }
}
