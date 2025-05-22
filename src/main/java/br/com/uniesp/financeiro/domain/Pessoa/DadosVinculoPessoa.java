package br.com.uniesp.financeiro.domain.Pessoa;

import jakarta.validation.constraints.NotBlank;

public record DadosVinculoPessoa(
        @NotBlank
        Long id
) {
}
