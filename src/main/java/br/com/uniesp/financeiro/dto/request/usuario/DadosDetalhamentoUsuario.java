package br.com.uniesp.financeiro.dto.request.usuario;

import br.com.uniesp.financeiro.entity.Usuario;

public record DadosDetalhamentoUsuario(Long id, String login) {
    public DadosDetalhamentoUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getLogin());
    }
}
