package br.com.uniesp.financeiro.domain.Pessoa;

import br.com.uniesp.financeiro.domain.Endereco.DadosAtualizacaoEndereco;

public record DadosAtualizacaoPessoa(
        String nome,
        Boolean ativo,
        DadosAtualizacaoEndereco endereco
) {
}
