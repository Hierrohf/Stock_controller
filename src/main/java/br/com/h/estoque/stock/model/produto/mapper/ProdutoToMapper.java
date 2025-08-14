package br.com.h.estoque.stock.model.produto.mapper;

import br.com.h.estoque.stock.model.produto.Produto;
import br.com.h.estoque.stock.model.produto.dto.ProdutoRequestDto;
import br.com.h.estoque.stock.model.produto.dto.ProdutoResponseDto;

public class ProdutoToMapper {

    public static Produto ToProduto(ProdutoRequestDto dto){
        return new Produto(dto.nome(), dto.categoria(),dto.quantidadeEstoque());
    }

    public static ProdutoResponseDto toDto(Produto produto){
        return new ProdutoResponseDto(produto.getId(),produto.getNome(),produto.getCategoria(),produto.getQuantidadeEstoque());
    }
}
