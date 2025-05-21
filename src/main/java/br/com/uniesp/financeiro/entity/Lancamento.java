package br.com.uniesp.financeiro.entity;

import br.com.uniesp.financeiro.enums.TipoLancamento;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "Tb_lançamento")
@Entity(name = "Lancamento")
@Getter
@Setter
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Date dataVencimento;
    private Date dataPagamento;
    private BigDecimal valor;
    private String observacao;
    @Enumerated(EnumType.STRING)
    private TipoLancamento tipoLancamento;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Lancamento(String descricao, Date dataVencimento, Date dataPagamento, BigDecimal valor, String observacao) {
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
        this.observacao = observacao;
    }

    public String getDescricao(){
        return descricao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public TipoLancamento getTipoLancamento() {
        return tipoLancamento;
    }

    public Long getId() {
        return id;
    }
}
