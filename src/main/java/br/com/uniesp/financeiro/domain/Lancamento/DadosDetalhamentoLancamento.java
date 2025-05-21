package br.com.uniesp.financeiro.domain.Lancamento;

import br.com.uniesp.financeiro.domain.Pessoa.DadosDetalhamentoPessoa;
import br.com.uniesp.financeiro.entity.Lancamento;
import br.com.uniesp.financeiro.entity.Pessoa;
import br.com.uniesp.financeiro.enums.TipoLancamento;

import java.math.BigDecimal;
import java.util.Date;

public record DadosDetalhamentoLancamento(String descricao, Date dataVencimento, Date dataPagamento, BigDecimal valor, String observacao, TipoLancamento tipoLancamento) {

    public DadosDetalhamentoPessoa(Lancamento lancamento){
        this(lancamento.getDescricao(), lancamento.getDataVencimento(), lancamento.getDataPagamento(), lancamento.getValor(), lancamento.getObservacao(), lancamento.getTipoLancamento());
    }
}
