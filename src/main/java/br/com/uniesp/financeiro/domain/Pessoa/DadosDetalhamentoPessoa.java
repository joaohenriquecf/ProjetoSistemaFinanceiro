package br.com.uniesp.financeiro.domain.Pessoa;

import br.com.uniesp.financeiro.entity.Endereco;
import br.com.uniesp.financeiro.entity.Lancamento;
import br.com.uniesp.financeiro.entity.Pessoa;

public record DadosDetalhamentoPessoa(Long id, String nome, Boolean ativo, Endereco endereco, Lancamento lancamento) {

    public DadosDetalhamentoPessoa(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getAtivo(), pessoa.getEndereco(), pessoa.getLancamento());
    }
}
