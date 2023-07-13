package com.mjvinnovation.school.jobby.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cidades")
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nome;
/*
    @ManyToOne
    @JoinColumn(name="id_cadastro")
    private Cadastro cadastro;
*/
}
