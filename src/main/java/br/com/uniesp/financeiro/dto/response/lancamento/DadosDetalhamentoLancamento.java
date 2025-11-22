package br.com.uniesp.financeiro.dto.response.lancamento;

import br.com.uniesp.financeiro.entity.Lancamento;
import br.com.uniesp.financeiro.enums.TipoLancamento;

import java.math.BigDecimal;
import java.util.Date;

public record DadosDetalhamentoLancamento(Long id, String descricao, Date dataVencimento, Date dataPagamento, BigDecimal valor, String observacao, TipoLancamento tipoLancamento) {

    public DadosDetalhamentoLancamento(Lancamento lancamento){
        this(lancamento.getId(), lancamento.getDescricao(), lancamento.getDataVencimento(), lancamento.getDataPagamento(), lancamento.getValor(), lancamento.getObservacao(), lancamento.getTipoLancamento());
    }
}
