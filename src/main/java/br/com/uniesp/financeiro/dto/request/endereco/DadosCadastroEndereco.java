package br.com.uniesp.financeiro.dto.request.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String numero,
        String complemento,
        @NotBlank
        String bairro,
        @NotNull
        @Pattern(regexp = "\\d{8}")
        String CEP,
        @NotBlank
        String cidade,
        @NotBlank
        String estado) {

}
