package com.mjvinnovation.school.jobby.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long cep;

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;



}
