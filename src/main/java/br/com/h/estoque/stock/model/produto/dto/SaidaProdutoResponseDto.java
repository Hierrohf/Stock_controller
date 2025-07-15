package br.com.h.estoque.stock.model.produto.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record SaidaProdutoResponseDto(


        @NotNull(message = "O campo 'id' não pode ser nulo.")
        Long id,

        @NotNull(message = "O campo 'idProduto' não pode ser nulo.")
        Long idProduto,

        @NotBlank(message = "O campo 'nomeProduto' não pode estar em branco.")
        String nomeProduto,

        @NotNull(message = "O campo 'idFuncionario' não pode ser nulo.")
        Long idFuncionario,

        @NotBlank(message = "O campo 'nomeFuncionario' não pode estar em branco.")
        String nomeFuncionario,

        @NotNull(message = "O campo 'idPontoDeVenda' não pode ser nulo.")
        Long idPontoDeVenda,

        @NotBlank(message = "O campo 'nomePontoDeVenda' não pode estar em branco.")
        String nomePontoDeVenda,

        @NotNull(message = "O campo 'quantidade' não pode ser nulo.")
        Long quantidade,

        @NotNull(message = "O campo 'dataHora' não pode ser nulo.")
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
        LocalDateTime dataHora,

        String observacao


) {
}
