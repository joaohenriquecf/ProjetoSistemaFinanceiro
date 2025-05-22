package br.com.uniesp.financeiro.controller;

import br.com.uniesp.financeiro.domain.Lancamento.DadosAtualizacaoLancamento;
import br.com.uniesp.financeiro.domain.Lancamento.DadosCadastroLancamento;
import br.com.uniesp.financeiro.domain.Lancamento.DadosDetalhamentoLancamento;
import br.com.uniesp.financeiro.domain.Lancamento.DadosListagemLancamento;
import br.com.uniesp.financeiro.entity.Lancamento;
import br.com.uniesp.financeiro.repository.LancamentosRepository;
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

    @Autowired
    private LancamentosRepository lancamentosRepository;

    @PostMapping
    @Transactional
    public ResponseEntity Cadastrar(@RequestBody @Valid DadosCadastroLancamento dados, UriComponentsBuilder uriBuilder){
        var lancamento = new Lancamento(dados);
        lancamentosRepository.save(lancamento);
        var uri = uriBuilder.path("/lancamentos/{id}").buildAndExpand(lancamento.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoLancamento(lancamento));
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemLancamento>> listar(@PageableDefault(size = 10, sort = {"id"})Pageable paginacao){
        var page = lancamentosRepository.findAllByAtivoTrue(paginacao).map(DadosListagemLancamento::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity atualizar(@PathVariable Long id, @RequestBody @Valid DadosAtualizacaoLancamento dados){
        var lancamento = lancamentosRepository.getReferenceById((id));
        lancamento.atualizarInformacoes(dados);
        return ResponseEntity.ok(new DadosDetalhamentoLancamento(lancamento));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deletar(@PathVariable Long id){
        var lancamento = lancamentosRepository.getReferenceById(id);
        lancamento.deletar();
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id){
        var lancamento = lancamentosRepository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoLancamento(lancamento));
    }
}
