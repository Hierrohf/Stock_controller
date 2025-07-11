package br.com.h.estoque.stock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
public enum Turno {
    DIURNO(0),
    NOTURNO(1);

    private final int valor;
}
