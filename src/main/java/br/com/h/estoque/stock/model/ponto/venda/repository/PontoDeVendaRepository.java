package br.com.h.estoque.stock.model.ponto.venda.repository;

import br.com.h.estoque.stock.model.ponto.venda.PontoDeVenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoDeVendaRepository extends JpaRepository<PontoDeVenda, Long> {
}
