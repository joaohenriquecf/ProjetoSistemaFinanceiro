package br.com.uniesp.financeiro.dto.request.pessoa;

import br.com.uniesp.financeiro.dto.request.endereco.DadosAtualizacaoEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPessoa(
        @NotNull
        Long id,
        String nome,
        DadosAtualizacaoEndereco endereco
) {
}
