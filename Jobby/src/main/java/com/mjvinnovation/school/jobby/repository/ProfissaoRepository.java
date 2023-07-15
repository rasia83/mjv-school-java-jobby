package com.mjvinnovation.school.jobby.repository;

import com.mjvinnovation.school.jobby.model.Profissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProfissaoRepository  extends JpaRepository<Profissao, Integer> {

    // @Query("SELECT p FROM Profissao p WHERE p.nome LIKE :nome")
    Profissao findByNome(String nome);

}
