package com.mjvinnovation.school.jobby.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "profissoes")
public class Profissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

}
