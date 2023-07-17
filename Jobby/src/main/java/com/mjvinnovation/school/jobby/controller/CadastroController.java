//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mjvinnovation.school.jobby.controller;

import com.mjvinnovation.school.jobby.model.Cadastro;
import com.mjvinnovation.school.jobby.repository.CadastroRepository;
import com.mjvinnovation.school.jobby.service.CadastroService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

public class CadastroController {
    @Autowired
    public CadastroService cadastroService;
    @Autowired
    public CadastroRepository cadastroRepository;

    public CadastroController() {
    }

    @GetMapping({"/all"})
    public ResponseEntity<List<Cadastro>> getAll() {
        return ResponseEntity.ok(this.cadastroRepository.findAll());
    }

    @GetMapping({"/nome/{nome}"})
    public Optional<Cadastro> getByCadastro(@PathVariable String cadastro) {
        if (!cadastro.isEmpty()) {
            return this.cadastroRepository.findByCadastroiningIgnoreCase(cadastro);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cadastro não encontrado", (Throwable)null);
        }
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Cadastro> getById(@PathVariable Integer id) {
        return (ResponseEntity)this.cadastroRepository.findById(id).map((resposta) -> {
            return ResponseEntity.ok(resposta);
        }).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping({"/cadastrar"})
    public ResponseEntity<Cadastro> postCadastro(@RequestBody Cadastro cadastro) {
        return (ResponseEntity)this.cadastroService.cadastrar(cadastro).map((resposta) -> {
            return ResponseEntity.status(HttpStatus.CREATED).body(resposta);
        }).orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
    }

    @GetMapping({"/java"})
    public ResponseEntity<Integer> getJava(@PathVariable List<Cadastro> habilidade) {
        Integer quantidadeCandidatosJava = this.cadastroService.buscarHabilidadeJava(habilidade);
        return ResponseEntity.ok(quantidadeCandidatosJava);
    }
}
