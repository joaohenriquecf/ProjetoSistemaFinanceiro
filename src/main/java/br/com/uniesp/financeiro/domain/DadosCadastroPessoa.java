package br.com.uniesp.financeiro.domain;

import br.com.uniesp.financeiro.entity.Endereco;
import br.com.uniesp.financeiro.entity.Lancamento;
import br.com.uniesp.financeiro.entity.Pessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPessoa(
        @NotBlank
        String nome,
        @NotBlank
        Boolean ativo,
        Endereco endereco,
        @NotNull
        Lancamento lancamento) {

        public DadosCadastroPessoa(Pessoa pessoa){
                 pessoa.getNome()
        }



}
