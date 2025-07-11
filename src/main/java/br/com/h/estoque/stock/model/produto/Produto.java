package br.com.h.estoque.stock.model.produto;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "PRODUTOS_VL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
    @SequenceGenerator(name = "produto_seq", sequenceName = "SEQ_PRODUTO", allocationSize = 1)//CRIAR SEQ LA NO BANCO ANTES DE RODAR O PROJETO
    @Column(name = "ID_PRODUTO")
    private Long id;

    @Column(name = "NM_PRODUTO")
    private String nome;

    @Column(name = "CATEG_PRODUTO")
    private String categoria;

    @Column(name = "QUANT_ESTOQUE")
    private BigDecimal quantidadeEstoque;
}
