package br.com.h.estoque.stock.model.pontovenda.service;

import br.com.h.estoque.stock.model.pontovenda.dto.PontoDeVendaRequestDto;
import br.com.h.estoque.stock.model.pontovenda.dto.PontoDeVendaResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PontoVendaService {

    PontoDeVendaResponseDto criarPontoVenda(PontoDeVendaRequestDto dto);
    PontoDeVendaResponseDto buscarPorId(Long id);
    List<PontoDeVendaResponseDto> buscarTodos();
    PontoDeVendaResponseDto atualizarPontoVenda(PontoDeVendaRequestDto dto);
    void deletarPontoVenda(Long id);
}
/*criarFuncionario buscarPorId buscar todos atualizar deletar */