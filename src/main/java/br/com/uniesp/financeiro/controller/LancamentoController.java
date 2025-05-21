package br.com.uniesp.financeiro.controller;

import br.com.uniesp.financeiro.domain.Lancamento.DadosCadastroLancamento;
import br.com.uniesp.financeiro.domain.Lancamento.DadosDetalhamentoLancamento;
import br.com.uniesp.financeiro.domain.Lancamento.DadosListagemLancamento;
import br.com.uniesp.financeiro.domain.Pessoa.DadosAtualizacaoPessoa;
import br.com.uniesp.financeiro.domain.Pessoa.DadosCadastroPessoa;
import br.com.uniesp.financeiro.domain.Pessoa.DadosDetalhamentoPessoa;
import br.com.uniesp.financeiro.domain.Pessoa.DadosListagemPessoa;
import br.com.uniesp.financeiro.entity.Lancamento;
import br.com.uniesp.financeiro.entity.Pessoa;
import br.com.uniesp.financeiro.repository.LancamentosRepostory;
import br.com.uniesp.financeiro.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("lancamentos")
public class LancamentoController {

}
