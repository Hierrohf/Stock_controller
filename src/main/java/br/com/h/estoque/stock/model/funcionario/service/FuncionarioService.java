package br.com.h.estoque.stock.model.funcionario.service;

import br.com.h.estoque.stock.model.funcionario.dto.FuncionarioRequestDto;
import br.com.h.estoque.stock.model.funcionario.dto.FuncionarioResponseDto;

import java.util.List;

public interface FuncionarioService {

    FuncionarioResponseDto criarFuncionario(FuncionarioRequestDto dto);
    FuncionarioResponseDto buscarPorId(Long id);
    List<FuncionarioResponseDto> listarTodos();
    FuncionarioResponseDto atualizarFuncionario(Long id, FuncionarioRequestDto dto);
    void deletarFuncionario(Long id);
}
