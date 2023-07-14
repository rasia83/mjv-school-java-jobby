package com.mjvinnovation.school.jobby.start;

import com.mjvinnovation.school.jobby.model.Cidade;
import com.mjvinnovation.school.jobby.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandStarter implements CommandLineRunner {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Use este recurso caso queira executar algum comando");

        // Cidade cidade = cidadeRepository.getReferenceById(3550308);
        Cidade cidade = cidadeRepository.findById(3550308).get();

        System.out.println(cidade);

    }
}
