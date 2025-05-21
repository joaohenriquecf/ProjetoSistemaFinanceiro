package br.com.uniesp.financeiro.repository;

import br.com.uniesp.financeiro.entity.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRespository extends JpaRepository<Categoria, Long> {
    Page<Categoria> findAllByAtivoTrue(Pageable paginacao);
}
