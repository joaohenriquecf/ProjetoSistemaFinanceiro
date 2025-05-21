package br.com.uniesp.financeiro.domain.Lancamento;

import java.util.Date;

public record DadosAtualizacaoLancamento(String descricao, Date dataVencimento, Date dataPagamento, ) {
}
