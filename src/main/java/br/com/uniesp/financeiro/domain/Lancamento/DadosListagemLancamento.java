package br.com.uniesp.financeiro.domain.Lancamento;

import br.com.uniesp.financeiro.entity.Lancamento;

import java.math.BigDecimal;
import java.util.Date;

public record DadosListagemLancamento(String descricao, Date dataVencimento, Date dataPagamento, BigDecimal valor, String observacao) {

    public DadosListagemLancamento(Lancamento lancamento){
        this(lancamento.getDescricao(), lancamento.getDataVencimento(), lancamento.getDataPagamento(), lancamento.getValor(), lancamento.getObservacao());
    }
}
