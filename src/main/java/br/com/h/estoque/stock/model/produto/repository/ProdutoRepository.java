package br.com.h.estoque.stock.model.produto.repository;

import br.com.h.estoque.stock.model.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
