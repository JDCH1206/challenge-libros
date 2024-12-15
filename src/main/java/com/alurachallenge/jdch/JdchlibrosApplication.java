package com.alurachallenge.jdch;

import com.alurachallenge.jdch.model.Libro;
import com.alurachallenge.jdch.principal.Principal;
import com.alurachallenge.jdch.repository.AutorRepository;
import com.alurachallenge.jdch.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdchlibrosApplication implements CommandLineRunner {

	@Autowired
	private LibroRepository repository;
	@Autowired
	private AutorRepository repositoryAutor;
	public static void main(String[] args) {
		SpringApplication.run(JdchlibrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository,repositoryAutor);
		principal.muestraElMenu();

	}
}
