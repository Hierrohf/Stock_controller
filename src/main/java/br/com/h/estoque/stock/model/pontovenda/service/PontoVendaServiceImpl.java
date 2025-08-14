package br.com.h.estoque.stock.model.pontovenda.service;

import br.com.h.estoque.stock.model.pontovenda.dto.PontoDeVendaRequestDto;
import br.com.h.estoque.stock.model.pontovenda.dto.PontoDeVendaResponseDto;

import java.util.List;

public class PontoVendaServiceImpl implements PontoVendaService{
    @Override
    public PontoDeVendaResponseDto criarPontoVenda(PontoDeVendaRequestDto dto) {
        return null;
    }

    @Override
    public PontoDeVendaResponseDto buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<PontoDeVendaResponseDto> buscarTodos() {
        return List.of();
    }

    @Override
    public PontoDeVendaResponseDto atualizarPontoVenda(PontoDeVendaRequestDto dto) {
        return null;
    }

    @Override
    public void deletarPontoVenda(Long id) {

    }
}
