package com.mjvinnovation.school.jobby.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "cadastro_experiencias")
public class CadastroExperiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(precision = 10, scale = 2)
    private Double salario;

    private boolean empregoAtual;

    @Column(columnDefinition = "DATE")
    private LocalDate dataContratacao;

    @Column(columnDefinition = "DATE")
    private LocalDate dataDesligamento;

    @Enumerated(EnumType.STRING)
    @Column(length = 5 )
    private RegimeContratacao regimeContratacao;

    // private Empresa empresa;
}
