package br.com.uniesp.financeiro.domain.Categoria;

import br.com.uniesp.financeiro.entity.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCategoria(
        @NotBlank
        String nome,
        @NotNull
        Boolean ativo) {


}
