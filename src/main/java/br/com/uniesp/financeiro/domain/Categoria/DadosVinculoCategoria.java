package br.com.uniesp.financeiro.domain.Categoria;

import jakarta.validation.constraints.NotBlank;

public record DadosVinculoCategoria(
        @NotBlank
        Long id
) {

}
