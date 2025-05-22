package br.com.uniesp.financeiro.domain.Lancamento;

import br.com.uniesp.financeiro.entity.Categoria;
import br.com.uniesp.financeiro.entity.Pessoa;
import br.com.uniesp.financeiro.enums.TipoLancamento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;
 
public record DadosCadastroLancamento(
        @NotBlank
        String descricao,
        @NotNull
        Date dataVencimento,
        Date dataPagamento,
        @NotNull
        BigDecimal valor,
        @NotNull
        Boolean ativo,
        String observacao,
        TipoLancamento tipoLancamento,
        @NotNull
        Categoria IDcategoria,
        @NotNull
        Pessoa IDpessoa) {
}
