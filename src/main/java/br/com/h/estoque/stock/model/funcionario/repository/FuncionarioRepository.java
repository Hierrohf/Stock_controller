package br.com.h.estoque.stock.model.funcionario.repository;

import br.com.h.estoque.stock.model.funcionario.Funcionario;
import br.com.h.estoque.stock.model.funcionario.dto.FuncionarioRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
