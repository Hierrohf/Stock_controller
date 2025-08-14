package br.com.h.estoque.stock.model.funcionario;

import br.com.h.estoque.stock.enums.Turno;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "FUNCIONARIO_VL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funcionario_seq")
    @SequenceGenerator(name = "funcionario_seq", sequenceName = "SEQ_FUNCIONARIO", allocationSize = 1)//CRIAR SEQ LA NO BANCO ANTES DE RODAR O PROJETO
    @Column(name = "ID_FUNCIONARIO")
    private Long id;

    @Column(name = "NM_FUNCIONARIO")
    private String nome;

    @Column(name = "CARGO_FUNCIONARIO")
    private String cargo;

    @Enumerated(EnumType.STRING)
    @Column(name = "TURNO_FUNCIONARIO")
    private Turno turno;
}
