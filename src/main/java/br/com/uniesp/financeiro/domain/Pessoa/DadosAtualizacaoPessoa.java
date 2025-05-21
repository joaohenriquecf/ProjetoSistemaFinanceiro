package br.com.uniesp.financeiro.domain.Pessoa;

import br.com.uniesp.financeiro.domain.Endereco.DadosEndereco;
import br.com.uniesp.financeiro.entity.Lancamento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPessoa(
        @NotNull
        Long id,
        @NotBlank
        String nome,
        @NotNull
        Boolean ativo,
        DadosEndereco endereco,
        Lancamento lancamento
) {
}
