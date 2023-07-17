package com.mjvinnovation.school.jobby.service;

import com.mjvinnovation.school.jobby.model.Cadastro;
import com.mjvinnovation.school.jobby.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CadastroService {

    @Autowired
    CadastroRepository cadastroRepository;

    public Optional<Cadastro> postCadastro(Cadastro cadastro) {
        if (cadastroRepository.findByCadastroContainingIgnoreCase(cadastro.getNome()).isPresent()) ;
        return Optional.empty();
    }
}
