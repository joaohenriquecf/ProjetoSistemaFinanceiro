package br.com.uniesp.financeiro.dto.request.lancamento;

import br.com.uniesp.financeiro.dto.request.categoria.DadosVinculoCategoria;
import br.com.uniesp.financeiro.dto.request.pessoa.DadosVinculoPessoa;
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
        Boolean ativo,
        String observacao,
        @NotNull
        TipoLancamento tipoLancamento,
        @NotNull
        DadosVinculoCategoria categoria,
        @NotNull
        DadosVinculoPessoa pessoa) {
}
