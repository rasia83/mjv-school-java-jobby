package com.mjvinnovation.school.jobby.repository;

import com.mjvinnovation.school.jobby.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

    public Optional<Cadastro> findByCadastroContainingIgnoreCase(String cadastro);
}
