package br.com.h.estoque.stock.model.produto;

import br.com.h.estoque.stock.enums.Categoria;
<<<<<<< HEAD
import br.com.h.estoque.stock.model.produto.dto.ProdutoRequestDto;
import br.com.h.estoque.stock.model.produto.dto.ProdutoResponseDto;
=======
>>>>>>> 3dd1aa2b733d42f82c442dfacdd8a7467b5db2a8
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
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @Column(name = "QUANT_ESTOQUE")
    private BigDecimal quantidadeEstoque;
<<<<<<< HEAD

    public Produto(String nome, Categoria categoria, BigDecimal quantidadeEstoque){
        this.nome = nome;
        this.categoria = categoria;
        this.quantidadeEstoque = quantidadeEstoque;
    }

=======
>>>>>>> 3dd1aa2b733d42f82c442dfacdd8a7467b5db2a8
}
