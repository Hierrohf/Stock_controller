package br.com.h.estoque.stock.model.pontovenda.repository;

import br.com.h.estoque.stock.model.pontovenda.PontoDeVenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoDeVendaRepository extends JpaRepository<PontoDeVenda, Long> {
}
