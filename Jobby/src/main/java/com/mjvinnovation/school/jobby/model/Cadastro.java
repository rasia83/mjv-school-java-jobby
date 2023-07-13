package com.mjvinnovation.school.jobby.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "cadastros")
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;


    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(columnDefinition = "DATE")
    private LocalDate dataNascimento;

    private String email;

    private Long telefone;

    // @OneToOne

    // private Endereco endereco;

    @Embedded
    private Celular celular;

    @Embedded
    private PretencaoSalarial pretencaoSalarial;

    @ElementCollection
    private List<String> habilidades;

}
