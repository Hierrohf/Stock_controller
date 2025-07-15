package br.com.h.estoque.stock.model.produto.dto;


import br.com.h.estoque.stock.enums.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProdutoRequestDto(

        @NotBlank(message = "O nome não pode ser null ou vazio")
        String nome,

        @NotNull(message = "A categoria não pode ser nula")
        Categoria categoria,

        @NotNull(message = "A quantidade no estoque não pode ser nula")
        @Positive(message = "A quantidade no estoque não pode ser negativa ou zero")
        BigDecimal quantidadeEstoque

) {
}
