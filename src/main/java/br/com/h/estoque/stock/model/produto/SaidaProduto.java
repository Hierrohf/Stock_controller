package br.com.h.estoque.stock.model.produto;

import br.com.h.estoque.stock.enums.PontoDeVenda;
import br.com.h.estoque.stock.model.funcionario.Funcionario;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "SAIDA_PRODUTO_VL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SaidaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "saida_produto_seq")
    @SequenceGenerator(name = "saida_produto_seq", sequenceName = "SEQ_SAIDA_PRODUTO", allocationSize = 1)//CRIAR SEQ LA NO BANCO ANTES DE RODAR O PROJETO
    private Long id;

    @ManyToOne
    @JoinColumn(name = "PRODUTO_ID", nullable = false)
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "FUNCIONARIO_ID", nullable = false)
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "PONTO_VENDA_ID", nullable = false)
    @Enumerated(EnumType.STRING)
    private PontoDeVenda pontoDeVenda;

    @Column(name = "QUANTIDADE",nullable = false)
    private BigDecimal quantidade;

    @Column(name = "DATA-HORA",nullable = false)
    private LocalDateTime dataHora;

    @Column(name = "OBSERVACAO")
    private String observacao; //opicional
}
