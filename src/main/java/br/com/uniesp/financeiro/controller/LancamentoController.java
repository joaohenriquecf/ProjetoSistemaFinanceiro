package br.com.uniesp.financeiro.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lancamentos")
public class LancamentoController {

    public void Cadastrar(@RequestBody @Valid )
}
