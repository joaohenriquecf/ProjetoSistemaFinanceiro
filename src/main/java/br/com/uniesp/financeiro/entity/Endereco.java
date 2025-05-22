package br.com.uniesp.financeiro.entity;

import br.com.uniesp.financeiro.domain.Endereco.DadosAtualizacaoEndereco;
import br.com.uniesp.financeiro.domain.Endereco.DadosCadastroEndereco;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String CEP;
    private String cidade;
    private String estado;

    public Endereco(DadosCadastroEndereco dadosCadastroEndereco) {
        this.logradouro = dadosCadastroEndereco.logradouro();
        this.numero = dadosCadastroEndereco.numero();
        this.complemento = dadosCadastroEndereco.complemento();
        this.bairro = dadosCadastroEndereco.bairro();
        this.CEP = dadosCadastroEndereco.CEP();
        this.cidade = dadosCadastroEndereco.cidade();
        this.estado = dadosCadastroEndereco.estado();
    }

    public Endereco(DadosAtualizacaoEndereco dadosAtualizacaoEndereco) {
        this.logradouro = dadosAtualizacaoEndereco.logradouro();
        this.numero = dadosAtualizacaoEndereco.numero();
        this.complemento = dadosAtualizacaoEndereco.complemento();
        this.bairro = dadosAtualizacaoEndereco.bairro();
        this.CEP = dadosAtualizacaoEndereco.CEP();
        this.cidade = dadosAtualizacaoEndereco.cidade();
        this.estado = dadosAtualizacaoEndereco.estado();
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void atualizarInformacoes(DadosAtualizacaoEndereco dadosAtualizacaoEndereco) {
        if(dadosAtualizacaoEndereco.logradouro() != null){
            this.logradouro = dadosAtualizacaoEndereco.logradouro();
        }
        if(dadosAtualizacaoEndereco.numero() != null){
            this.numero = dadosAtualizacaoEndereco.numero();
        }
        if (dadosAtualizacaoEndereco.complemento() != null){
            this.complemento = dadosAtualizacaoEndereco.complemento();
        }
        if (dadosAtualizacaoEndereco.bairro() != null){
            this.bairro = dadosAtualizacaoEndereco.bairro();
        }
        if (dadosAtualizacaoEndereco.CEP() != null){
            this.CEP = dadosAtualizacaoEndereco.CEP();
        }
        if (dadosAtualizacaoEndereco.cidade() != null){
            this.cidade = dadosAtualizacaoEndereco.cidade();
        }
        if (dadosAtualizacaoEndereco.estado() != null){
            this.estado = dadosAtualizacaoEndereco.estado();
        }
    }
}
