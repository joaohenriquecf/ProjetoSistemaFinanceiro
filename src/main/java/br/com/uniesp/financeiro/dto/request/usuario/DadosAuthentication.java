package br.com.uniesp.financeiro.dto.request.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosAuthentication (
        @NotBlank(message = "Login é Obrigatório!!!")
        String login,
        @NotBlank(message = "Senha é Obrigatório!!!")
        String senha)
{
}
