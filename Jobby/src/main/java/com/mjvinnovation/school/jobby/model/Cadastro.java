package com.mjvinnovation.school.jobby.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @Embedded
    private Celular celular;

    @Embedded
    private PretencaoSalarial pretencaoSalarial;

    @ElementCollection
    private List<String> habilidades;

    @Enumerated(EnumType.STRING)
    @Column(length = 10 )
    private Sexo sexo;

    @ManyToOne()
    @JoinColumn(name = "profissao_id")
    private Profissao profissao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public PretencaoSalarial getPretencaoSalarial() {
        return pretencaoSalarial;
    }

    public void setPretensaoSalarial(PretencaoSalarial pretencaoSalarial) {
        this.pretencaoSalarial = pretencaoSalarial;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }




}


