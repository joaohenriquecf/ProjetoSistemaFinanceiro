package br.com.uniesp.financeiro.dto.request.endereco;

import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoEndereco(
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        @Pattern(regexp = "\\d{8}")
        String CEP,
        String cidade,
        String estado) {


}
