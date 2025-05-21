package br.com.uniesp.financeiro.repository;

import br.com.uniesp.financeiro.entity.Lancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentosRepostory extends JpaRepository<Lancamento, Long> {

    Page<Lancamento> findAllByAtivoTrue(Pageable paginacao);
}
