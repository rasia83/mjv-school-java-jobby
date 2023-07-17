package com.mjvinnovation.school.jobby.model;

import javax.persistence.*;

@Entity
@Table(name = "profissoes")
public class Profissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nome;

}
