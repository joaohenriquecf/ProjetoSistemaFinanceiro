package br.com.uniesp.financeiro.controller;

import br.com.uniesp.financeiro.domain.Categoria.DadosCadastroCategoria;
import br.com.uniesp.financeiro.domain.Categoria.DadosDetalhamentoCategoria;
import br.com.uniesp.financeiro.domain.Categoria.DadosListagemCategoria;
import br.com.uniesp.financeiro.entity.Categoria;
import br.com.uniesp.financeiro.repository.CategoriaRespository;
import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRespository categoriaRespository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroCategoria dados, UriComponentsBuilder uriBuilder){
        var categoria = new Categoria(dados);
        categoriaRespository.save(categoria);
        var uri = uriBuilder.path("/categorias/{id}").buildAndExpand(categoria.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoCategoria(categoria));
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemCategoria>> listar(@PageableDefault(size = 10, sort = {"nome"})Pageable paginacao){
        var page = categoriaRespository.findAllByAtivoTrue(paginacao).map(DadosListagemCategoria::new);
        return ResponseEntity.ok(page);
    }

}
