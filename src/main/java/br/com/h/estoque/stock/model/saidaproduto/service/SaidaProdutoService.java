package br.com.h.estoque.stock.model.saidaproduto.service;

import br.com.h.estoque.stock.model.saidaproduto.dto.SaidaProdutoRequestDto;
import br.com.h.estoque.stock.model.saidaproduto.dto.SaidaProdutoResponseDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface SaidaProdutoService {

    SaidaProdutoResponseDto registrarSaida(SaidaProdutoRequestDto dto);
    SaidaProdutoResponseDto buscarPorId(Long id);
    List<SaidaProdutoResponseDto> listarTodasSaidas();
    List<SaidaProdutoResponseDto> listarPorProduto(Long id);
    List<SaidaProdutoResponseDto> listarPorPeriodo(LocalDate dataInicio, LocalDate dataFim);
    void deletar(Long id);
}
/*registrarSaida buscarPorId listarTodas listarPorProduto deletar listarPorPeriodo*/