package br.com.h.estoque.stock.model.funcionario.repository;

import br.com.h.estoque.stock.model.funcionario.Funcionario;
<<<<<<< HEAD
import br.com.h.estoque.stock.model.funcionario.dto.FuncionarioRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

=======
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
>>>>>>> 3dd1aa2b733d42f82c442dfacdd8a7467b5db2a8
}
