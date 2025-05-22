package br.com.uniesp.financeiro.domain.Pessoa;

import br.com.uniesp.financeiro.domain.Endereco.DadosCadastroEndereco;
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
