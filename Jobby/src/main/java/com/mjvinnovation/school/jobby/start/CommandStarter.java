package com.mjvinnovation.school.jobby.start;

import com.mjvinnovation.school.jobby.model.Estado;
import com.mjvinnovation.school.jobby.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandStarter implements CommandLineRunner {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Use este recurso caso queira executar algum comando");

        Estado estado = new Estado();
        estado.setSigla("SP");
        estado.setNome("São Paulo");
        estadoRepository.save(estado);

    }
}
