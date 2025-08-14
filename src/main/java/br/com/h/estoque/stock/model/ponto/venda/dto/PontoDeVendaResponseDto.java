package br.com.h.estoque.stock.model.ponto.venda.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PontoDeVendaResponseDto(

        @NotNull(message = "O ID não pode ser vazio ou nulo.")
        Long id,

        @NotBlank(message = "O nome não pode ser vazio ou nulo.")
        String nome,

        @NotBlank(message = "A localização é obrigatória e não pode estar vazia.")
        String locacizacao
) {
}
