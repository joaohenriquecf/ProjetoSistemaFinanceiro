package br.com.uniesp.financeiro.entity;

import br.com.uniesp.financeiro.domain.Endereco.DadosEndereco;
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

    public Endereco(DadosEndereco dadosEndereco) {
        this.logradouro = dadosEndereco.logradouro();
        this.numero = dadosEndereco.numero();
        this.complemento = dadosEndereco.complemento();
        this.bairro = dadosEndereco.bairro();
        this.CEP = dadosEndereco.CEP();
        this.cidade = dadosEndereco.cidade();
        this.estado = dadosEndereco.estado();
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

    public void atualizarInformacoes(DadosEndereco dadosEndereco) {
        if(dadosEndereco.logradouro() != null){
            this.logradouro = dadosEndereco.logradouro();
        }
        if(dadosEndereco.numero() != null){
            this.numero = dadosEndereco.numero();
        }
        if (dadosEndereco.complemento() != null){
            this.complemento = dadosEndereco.complemento();
        }
        if (dadosEndereco.bairro() != null){
            this.bairro = dadosEndereco.bairro();
        }
        if (dadosEndereco.CEP() != null){
            this.CEP = dadosEndereco.CEP();
        }
        if (dadosEndereco.cidade() != null){
            this.cidade = dadosEndereco.cidade();
        }
        if (dadosEndereco.estado() != null){
            this.estado = dadosEndereco.estado();
        }
    }
}
