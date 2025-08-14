package br.com.h.estoque.stock.model.saidaproduto.service;

import br.com.h.estoque.stock.model.saidaproduto.dto.SaidaProdutoRequestDto;
import br.com.h.estoque.stock.model.saidaproduto.dto.SaidaProdutoResponseDto;
import br.com.h.estoque.stock.model.saidaproduto.repository.SaidaProdutoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SaidaProdutoServiceImpl implements SaidaProdutoService{

    private final SaidaProdutoRepository saidaProdutoRepository;

    public SaidaProdutoServiceImpl(SaidaProdutoRepository saidaProdutoRepository) {
        this.saidaProdutoRepository = saidaProdutoRepository;
    }

    @Override
    public SaidaProdutoResponseDto registrarSaida(SaidaProdutoRequestDto dto) {
        return null;
    }

    @Override
    public SaidaProdutoResponseDto buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<SaidaProdutoResponseDto> listarTodasSaidas() {
        return List.of();
    }

    @Override
    public List<SaidaProdutoResponseDto> listarPorProduto(Long id) {
        return List.of();
    }

    @Override
    public List<SaidaProdutoResponseDto> listarPorPeriodo(LocalDate dataInicio, LocalDate dataFim) {
        return List.of();
    }

    @Override
    public void deletar(Long id) {

    }
}
