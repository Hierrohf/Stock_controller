package br.com.h.estoque.stock.model.funcionario.repository;

import br.com.h.estoque.stock.model.funcionario.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
