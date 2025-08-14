package br.com.h.estoque.stock.enums;

import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum PontoDeVenda {
    BAR_PICINA(0),
    CAMBUSA(1);

    private final int valor;
}
