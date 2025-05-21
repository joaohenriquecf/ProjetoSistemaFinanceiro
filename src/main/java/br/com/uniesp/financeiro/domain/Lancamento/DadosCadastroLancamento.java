package br.com.uniesp.financeiro.domain.Lancamento;

import br.com.uniesp.financeiro.enums.TipoLancamento;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.util.Date;
 
public record DadosCadastroLancamento(
        @NotBlank
        String descricao,
        @NotBlank
        Date dataVencimento,
        @NotBlank
        Date dataPagamento,
        @NotBlank
        BigDecimal valor,
        String observacao,
        @NotBlank
        TipoLancamento tipoLancamento) {
}
