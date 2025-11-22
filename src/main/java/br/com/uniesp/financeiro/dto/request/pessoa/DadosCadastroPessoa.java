package br.com.uniesp.financeiro.dto.request.pessoa;

import br.com.uniesp.financeiro.dto.request.endereco.DadosCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPessoa(
        @NotBlank
        String nome,
        @NotNull
        Boolean ativo,
        @NotNull @Valid
        DadosCadastroEndereco endereco
) {





}
