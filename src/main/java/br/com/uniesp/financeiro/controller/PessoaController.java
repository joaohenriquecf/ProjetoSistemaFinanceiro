package br.com.uniesp.financeiro.controller;

import br.com.uniesp.financeiro.domain.Pessoa.DadosAtualizacaoPessoa;
import br.com.uniesp.financeiro.domain.Pessoa.DadosCadastroPessoa;
import br.com.uniesp.financeiro.domain.Pessoa.DadosDetalhamentoPessoa;
import br.com.uniesp.financeiro.domain.Pessoa.DadosListagemPessoa;
import br.com.uniesp.financeiro.entity.Pessoa;
import br.com.uniesp.financeiro.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;


    @PostMapping
    @Transactional
    public ResponseEntity Cadastrar(@RequestBody @Valid DadosCadastroPessoa dados, UriComponentsBuilder uriBuilder){
        var pessoa = new Pessoa(dados);
        pessoaRepository.save(pessoa);
        var uri = uriBuilder.path("/pessoas/ {id}").buildAndExpand(pessoa.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoPessoa(pessoa));
    }


    @GetMapping
    public ResponseEntity<Page<DadosListagemPessoa>> Listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        var page = pessoaRepository.findAllByAtivoTrue(paginacao).map(DadosListagemPessoa::new);
        return ResponseEntity.ok(page);
    }


    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity Atualizar(@PathVariable Long id, @RequestBody @Valid DadosAtualizacaoPessoa dados){
        var pessoa = pessoaRepository.getReferenceById((id));
        pessoa.atualizarInformacoes(dados);
        return ResponseEntity.ok(new DadosDetalhamentoPessoa(pessoa));
    }


    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity Deletar(@PathVariable Long id){
        var pessoa = pessoaRepository.getReferenceById(id);
        pessoa.deletar();
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        var pessoa = pessoaRepository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoPessoa(pessoa));
    }





}
