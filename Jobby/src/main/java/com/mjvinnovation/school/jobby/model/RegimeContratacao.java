package com.mjvinnovation.school.jobby.model;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum RegimeContratacao {
    CLT, PJ, COP, AUT;

    @Enumerated(EnumType.STRING)
    @Column(length = 5)
    private RegimeContratacao regimeContratacao;

}

