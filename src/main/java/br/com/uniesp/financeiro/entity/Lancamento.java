package br.com.uniesp.financeiro.entity;

import br.com.uniesp.financeiro.domain.Lancamento.DadosAtualizacaoLancamento;
import br.com.uniesp.financeiro.domain.Lancamento.DadosCadastroLancamento;
import br.com.uniesp.financeiro.enums.TipoLancamento;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "lancamentos")
@Entity(name = "Lancamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
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
    private Boolean ativo;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Lancamento(DadosCadastroLancamento dados) {
        this.descricao = dados.descricao();
        this.dataVencimento = dados.dataVencimento();
        this.dataPagamento = dados.dataPagamento();
        this.valor = dados.valor();
        this.observacao = dados.observacao();
        this.tipoLancamento = dados.tipoLancamento();
        this.ativo = dados.ativo();
        this.pessoa = new Pessoa(dados.pessoa());
        this.categoria = new Categoria(dados.categoria());
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
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

    public Boolean getAtivo() {
        return ativo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void atualizarInformacoes(DadosAtualizacaoLancamento dados){
        if (dados.descricao() != null){
            this.descricao = dados.descricao();
        }
        if(dados.dataVencimento() != null){
            this.dataVencimento = dados.dataVencimento();
        }
        if(dados.dataPagamento() != null){
            this.dataPagamento = dados.dataPagamento();
        }
        if (dados.valor() != null){
            this.valor = dados.valor();
        }
        if(dados.observacao() != null){
            this.observacao = dados.observacao();
        }

    }

    public void deletar(){
        this.ativo = false;
    }
}
