package br.com.uniesp.financeiro.entity;

import jakarta.persistence.Entity;
import lombok.Getter;


@Entity
@Getter
public class Categoria {
    private String nome;

    public Categoria(){
        this.nome = nome;
    }

}
