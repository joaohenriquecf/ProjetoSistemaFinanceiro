package br.com.uniesp.financeiro.repository;

import br.com.uniesp.financeiro.entity.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository <Pessoa, Long> {

    Page<Pessoa> findAllByAtivoTrue(Pageable paginacao);
}
