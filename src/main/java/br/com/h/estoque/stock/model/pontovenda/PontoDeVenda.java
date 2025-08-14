package br.com.h.estoque.stock.model.pontovenda;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PONTOS_VENDA")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PontoDeVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ponto_seq")
    @SequenceGenerator(name = "ponto_seq", sequenceName = "SEQ_PONTO_VENDA", allocationSize = 1)
    @Column(name = "ID_PONTO_VENDA")
    private Long id;

    @Column(name = "NM_PONTO_VENDA", length = 100, nullable = false)
    private String nome;

    @Column(name = "LOCALIZACAO", length = 255)
    private String localizacao;

}