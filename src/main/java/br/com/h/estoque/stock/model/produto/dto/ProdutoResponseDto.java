package br.com.h.estoque.stock.model.produto.dto;

import br.com.h.estoque.stock.enums.Categoria;
import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProdutoResponseDto(


        @NotNull(message = "O ID do produto não pode ser nulo.")
        Long id,

        @NotBlank(message = "O nome do produto é obrigatório.")
        String nome,

        @NotBlank(message = "A categoria do produto é obrigatória.")
        Categoria categoria,

        @NotNull(message = "A quantidade em estoque não pode ser nula.")
        @Positive(message = "A quantidade em estoque deve ser um número positivo.")
        BigDecimal quantidadeEstoque
) {
}
