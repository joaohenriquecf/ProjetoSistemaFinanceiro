package br.com.uniesp.financeiro.dto.request.pessoa;

import jakarta.validation.constraints.NotBlank;

public record DadosVinculoPessoa(
        @NotBlank
        Long id
) {
}
