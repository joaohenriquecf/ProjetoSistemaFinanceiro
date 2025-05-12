package br.com.uniesp.financeiro.entity;

import br.com.uniesp.financeiro.domain.DadosEndereco;
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
        this.estado = dadosEndereco.cidade();
    }


}
