package br.com.h.estoque.stock.model.produto.service;

import br.com.h.estoque.stock.model.produto.Produto;
import br.com.h.estoque.stock.model.produto.dto.ProdutoRequestDto;
import br.com.h.estoque.stock.model.produto.dto.ProdutoResponseDto;
import br.com.h.estoque.stock.model.produto.mapper.ProdutoToMapper;
import br.com.h.estoque.stock.model.produto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository,Produto produto) {
        this.produtoRepository = produtoRepository;
    }
//tratar as exceptions
    @Override
    public ProdutoResponseDto criarProduto(ProdutoRequestDto dto) {
        return null;
    }

    @Override
    public ProdutoResponseDto buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<ProdutoResponseDto> listarTodos() {
        return List.of();
    }

    @Override
    public ProdutoResponseDto atualizarProduto(ProdutoResponseDto dto) {
        return null;
    }

    @Override
    public void deletarProduto(Long id) {

    }
}
