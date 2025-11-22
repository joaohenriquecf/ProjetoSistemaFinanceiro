package br.com.uniesp.financeiro.dto.response.pessoa;

import br.com.uniesp.financeiro.entity.Endereco;
import br.com.uniesp.financeiro.entity.Pessoa;

public record DadosDetalhamentoPessoa(Long id, String nome, Boolean ativo, Endereco endereco) {

    public DadosDetalhamentoPessoa(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getAtivo(), pessoa.getEndereco());
    }
}
