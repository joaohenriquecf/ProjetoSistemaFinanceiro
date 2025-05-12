package br.com.uniesp.financeiro.entity;

import br.com.uniesp.financeiro.Enums.TipoLancamento;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "Tb_lançamento")
@Entity(name = "Lancamento")
@Getter
public class Lancamento {

    private String descricao;
    private Date dataVencimento;
    private Date dataPagamento;
    private BigDecimal valor;
    private String observacao;
    @Enumerated(EnumType.STRING)
    private TipoLancamento tipoLancamento;

    public Lancamento(String descricao, Date dataVencimento, Date dataPagamento, BigDecimal valor, String observacao) {
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
        this.observacao = observacao;
    }


}
