package br.com.h.estoque.stock.model.produto.service;

import br.com.h.estoque.stock.model.produto.dto.ProdutoRequestDto;
import br.com.h.estoque.stock.model.produto.dto.ProdutoResponseDto;

import java.util.List;

public interface ProdutoService {

    ProdutoResponseDto criarProduto(ProdutoRequestDto dto);
    ProdutoResponseDto buscarPorId(Long id);
    List<ProdutoResponseDto> listarTodos();
    ProdutoResponseDto atualizarProduto(ProdutoResponseDto dto);
    void deletarProduto(Long id);
}
/*riarFuncionario  buscarPorId  listarTodos  atualizar deletar*/