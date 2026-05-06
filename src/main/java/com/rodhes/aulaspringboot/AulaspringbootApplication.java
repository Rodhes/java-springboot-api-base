package com.rodhes.aulaspringboot;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
//... imports ...
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodhes.aulaspringboot.domain.Categoria;
import com.rodhes.aulaspringboot.repositories.CategoriaRepository;

@SpringBootApplication
public class AulaspringbootApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(AulaspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// 1. Instancia as categorias (o ID é nulo porque o MySQL gera sozinho)
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		// 2. Salva no banco de dados usando o Repository
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
		System.out.println("✅ Categorias salvas no MySQL!");
	}
}

