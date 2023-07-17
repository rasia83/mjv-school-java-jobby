//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mjvinnovation.school.jobby.service;

import com.mjvinnovation.school.jobby.model.Cadastro;
import com.mjvinnovation.school.jobby.repository.CadastroRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    @Autowired
    CadastroRepository cadastroRepository;

    public CadastroService() {
    }

    public Optional<Cadastro> cadastrar(Cadastro cadastro) {
        if (this.cadastroRepository.findByCadastroiningIgnoreCase(cadastro.getNome()).isPresent()) {
        }

        return Optional.of((Cadastro)this.cadastroRepository.save(cadastro));
    }

    public int buscarHabilidadeJava(List<Cadastro> habilidade) {
        int candidatosComJava = 0;
        for (Cadastro cadastro : habilidade) {
            if (cadastro.getHabilidades().contains("java")) {
                candidatosComJava++;
            }
        }
        return candidatosComJava;
    }
}
