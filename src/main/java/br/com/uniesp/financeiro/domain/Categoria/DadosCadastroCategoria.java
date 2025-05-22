package br.com.uniesp.financeiro.domain.Categoria;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCategoria(
        @NotBlank
        String nome,
        @NotNull
        Boolean ativo) {
}
