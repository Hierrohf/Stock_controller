package br.com.h.estoque.stock.model.funcionario.dto;

import br.com.h.estoque.stock.enums.Turno;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FuncionarioResponseDto(

        @NotNull(message = "O ID nao pode ser vazio ou nulo")
        Long id,

        @NotBlank(message = "O nome não pode ser vazio ou nulo.")
        String nome,

        @NotBlank(message = "A funcao não pode ser vazio ou nulo.")
        String cargo,

        @NotNull(message = "O turno é obrigatório.")
        Turno turno
) {
}
