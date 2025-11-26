package br.com.uniesp.financeiro.dto.request.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosAuthentication (
        String login,
        String senha)
{
}
