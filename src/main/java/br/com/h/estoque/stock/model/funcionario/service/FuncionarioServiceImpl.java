package br.com.h.estoque.stock.model.funcionario.service;

import br.com.h.estoque.stock.model.funcionario.dto.FuncionarioRequestDto;
import br.com.h.estoque.stock.model.funcionario.dto.FuncionarioResponseDto;
import br.com.h.estoque.stock.model.funcionario.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioServiceImpl(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public FuncionarioResponseDto criarFuncionario(FuncionarioRequestDto dto) {
        return null;
    }

    @Override
    public FuncionarioResponseDto buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<FuncionarioResponseDto> listarTodos() {
        return List.of();
    }

    @Override
    public FuncionarioResponseDto atualizarFuncionario(Long id, FuncionarioRequestDto dto) {
        return null;
    }

    @Override
    public void deletarFuncionario(Long id) {

    }
}
