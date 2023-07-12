package com.mjvinnovation.school.jobby.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "empresas")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

}