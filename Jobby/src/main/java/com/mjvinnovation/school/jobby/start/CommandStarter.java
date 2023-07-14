package com.mjvinnovation.school.jobby.start;

import com.mjvinnovation.school.jobby.model.*;
import com.mjvinnovation.school.jobby.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class CommandStarter implements CommandLineRunner {

    @Autowired
    private CadastroRepository cadastroRepository;

    @Autowired
    private CadastroExperienciaRepository cadastroExperienciaRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ProfissaoRepository profissaoRepository;



    @Override
    public void run(String... args) throws Exception {
        System.out.println("Use este recurso caso queira executar algum comando");

        Cadastro cadastro = preencherCadastro();

        cadastroRepository.save(cadastro);

    }

    private Cadastro preencherCadastro(){
        Cadastro cadastro = new Cadastro();

        cadastro.setNome("João da Silva Template");
        cadastro.setCpf("01234567890");
        cadastro.setDataNascimento(LocalDate.of(1983,3,19));
        cadastro.setEmail("jstemplate@gmail.com");

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua de Teste");
        endereco.setNumero("123B");
        endereco.setComplemento("fundos");
        endereco.setBairro("centro");
        endereco.setCep(13800000L);
        // Cidade cidade = cidadeRepository.findById(3550308).get(); // São Pualo SP
        Cidade cidade = cidadeRepository.findByUfAndNome("SP", "São Paulo");
        endereco.setCidade(cidade);
        cadastro.setEndereco(endereco);

        Celular celular = new Celular();
        celular.setNumero(19998761234L);
        celular.setWhatsapp(true);
        cadastro.setCelular(celular);

        PretencaoSalarial pretencaoSalarial = new PretencaoSalarial();
        pretencaoSalarial.setValorMinimo(1320.0);
        pretencaoSalarial.setValorMaximo(3500.0);
        cadastro.setPretencaoSalarial(pretencaoSalarial);

        List<String> habilidades = new ArrayList<>();
        // Java Core Skills
        habilidades.add("Java programming language");
        habilidades.add("Object-oriented programming (OOP)");
        habilidades.add("Java Collections framework");
        habilidades.add("Exception handling");
        habilidades.add("Multithreading and concurrency");
        habilidades.add("IO and File handling");
        habilidades.add("Java Generics");
        habilidades.add("Lambda expressions");
        habilidades.add("Java Streams API");
        // Java Enterprise Edition (Java EE)
        habilidades.add("Java Servlets");
        habilidades.add("JavaServer Pages (JSP)");
        habilidades.add("JavaServer Faces (JSF)");
        habilidades.add("Enterprise JavaBeans (EJB)");
        habilidades.add("Java Persistence API (JPA)");
        habilidades.add("Java Message Service (JMS)");
        habilidades.add("Java Transaction API (JTA)");
        habilidades.add("Java Authentication and Authorization Service (JAAS)");
        // Frameworks and Libraries
        habilidades.add("Spring Framework");
        habilidades.add("Hibernate ORM");
        habilidades.add("JavaServer Pages Standard Tag Library (JSTL)");
        habilidades.add("Apache Struts");
        habilidades.add("Apache Maven");
        habilidades.add("JUnit Testing");
        // Web Technologies
        habilidades.add("HTML, CSS, and JavaScript");
        habilidades.add("JavaServer Pages (JSP)");
        habilidades.add("JavaServer Faces (JSF)");
        habilidades.add("Spring MVC");
        habilidades.add("RESTful Web Services (JAX-RS)");
        habilidades.add("SOAP Web Services (JAX-WS)");
        // Databases
        habilidades.add("SQL (Structured Query Language)");
        habilidades.add("Relational Database Management Systems (RDBMS)");
        habilidades.add("MySQL");
        habilidades.add("Oracle Database");
        habilidades.add("PostgreSQL");
        // Other Tools and Technologies
        habilidades.add("Version Control Systems (e.g., Git)");
        habilidades.add("IDEs (Integrated Development Environments) like Eclipse or IntelliJ IDEA");
        habilidades.add("Build tools like Maven");
        habilidades.add("Application servers like Apache Tomcat");
        cadastro.setHabilidades(habilidades);


        Profissao profissao = profissaoRepository.findByNome("Analista de Sistemas");
        cadastro.setProfissao(profissao);

        Set<CadastroExperiencia> cadastroExperiencias = new HashSet<>();
        CadastroExperiencia cadastroExperiencia = new CadastroExperiencia();
        cadastroExperiencia.setSalario(2500.0);
        cadastroExperiencia.setEmpregoAtual(false);
        cadastroExperiencia.setDataContratacao(LocalDate.now().minusYears(3));
        cadastroExperiencia.setDataDesligamento(LocalDate.now().minusMonths(3));
        cadastroExperiencia.setRegimeContratacao(RegimeContratacao.CLT);
        profissao = profissaoRepository.findByNome("Analista de Testes");
        cadastroExperiencia.setProfissao(profissao);
        cadastroExperiencias.add(cadastroExperiencia);
        cadastro.setCadastroExperiencias(cadastroExperiencias);

        return cadastro;
    }

}
