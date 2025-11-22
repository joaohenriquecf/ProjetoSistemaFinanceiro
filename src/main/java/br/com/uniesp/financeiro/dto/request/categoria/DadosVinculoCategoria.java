package br.com.uniesp.financeiro.dto.request.categoria;

import jakarta.validation.constraints.NotBlank;

public record DadosVinculoCategoria(
        @NotBlank
        Long id
) {

}
