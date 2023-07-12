package com.mjvinnovation.school.jobby.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "estados")
public class Estado {

    @Id
    @Column(length = 2 )
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String sigla;

    @Column(nullable = false, length = 20)
    private String nome;

}
