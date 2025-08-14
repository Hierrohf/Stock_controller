package br.com.h.estoque.stock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Categoria {

    BEBIDA(0),
    ALIMENTO(1);

    private final int valor;
}
