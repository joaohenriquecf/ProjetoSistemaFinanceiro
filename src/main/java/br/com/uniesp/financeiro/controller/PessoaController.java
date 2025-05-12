package br.com.uniesp.financeiro.controller;

import br.com.uniesp.financeiro.domain.DadosCadastroPessoa;
import br.com.uniesp.financeiro.entity.Pessoa;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @PostMapping
    public void Cadastrar(@RequestBody @Valid DadosCadastroPessoa dados){
        
    }
}
