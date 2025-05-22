package br.com.uniesp.financeiro.domain.Pessoa;

import br.com.uniesp.financeiro.domain.Endereco.DadosEndereco;
import br.com.uniesp.financeiro.entity.Lancamento;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPessoa(
        String nome,
        Boolean ativo,
        @Valid DadosEndereco endereco
) {
}
