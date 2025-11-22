package br.com.uniesp.financeiro.dto.request.pessoa;

import br.com.uniesp.financeiro.dto.request.endereco.DadosAtualizacaoEndereco;

public record DadosAtualizacaoPessoa(
        String nome,
        Boolean ativo,
        DadosAtualizacaoEndereco endereco
) {
}
