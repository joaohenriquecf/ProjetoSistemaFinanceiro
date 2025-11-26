package br.com.uniesp.financeiro.dto.request.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
        @NotBlank(message = "Login é obrigatório!")
        String login,
        @NotBlank(message = "Login é obrigatório!")
        String senha) {
}
