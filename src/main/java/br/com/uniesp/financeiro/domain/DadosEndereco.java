package br.com.uniesp.financeiro.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        String numero,
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String CEP,
        @NotBlank
        String cidade,
        @NotBlank
        String estado) {

}
