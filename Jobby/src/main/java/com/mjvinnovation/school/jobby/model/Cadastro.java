package com.mjvinnovation.school.jobby.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "cadastros")
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String cpf;

    private LocalDate dataNascimento;

    private String email;

    private Long telefone;


    @Embedded
    private Celular celular;

    @Embedded
    private PretencaoSalarial pretencaoSalarial;

}
