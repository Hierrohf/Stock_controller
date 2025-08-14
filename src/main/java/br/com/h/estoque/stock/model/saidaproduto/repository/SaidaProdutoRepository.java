package br.com.h.estoque.stock.model.saidaproduto.repository;

import br.com.h.estoque.stock.model.saidaproduto.SaidaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaidaProdutoRepository extends JpaRepository<SaidaProduto, Long> {
}
