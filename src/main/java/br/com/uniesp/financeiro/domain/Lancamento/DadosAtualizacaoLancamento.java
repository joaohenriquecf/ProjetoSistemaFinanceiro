package br.com.uniesp.financeiro.domain.Lancamento;

import br.com.uniesp.financeiro.enums.TipoLancamento;

import java.math.BigDecimal;
import java.util.Date;

public record DadosAtualizacaoLancamento(
        String descricao,
        Date dataVencimento,
        Date dataPagamento,
        BigDecimal valor,
        String observacao,
        TipoLancamento tipoLancamento
        ) {
}
