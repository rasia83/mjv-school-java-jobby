package com.mjvinnovation.school.jobby.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PretencaoSalarial {

    @Column(precision = 10, scale = 2)
    private Double valorMinimo;

    @Column(precision = 10, scale = 2)
    private Double valorMaximo;

}
