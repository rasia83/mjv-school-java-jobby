package com.mjvinnovation.school.jobby.repository;

import com.mjvinnovation.school.jobby.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

    @Query("SELECT c FROM Cidade c WHERE c.uf = :uf AND c.nomeMunicipio = :nomeMunicipio")
    Cidade findByUfAndNome(String uf, String nomeMunicipio);

}
