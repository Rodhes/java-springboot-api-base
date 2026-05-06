package com.rodhes.aulaspringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodhes.aulaspringboot.domain.Categoria;
import com.rodhes.aulaspringboot.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		// findById retorna um Optional (um container que pode ou não ter a categoria)
	    Optional<Categoria> obj = repo.findById(id);
	    
	    // Se encontrar, retorna o objeto. Se não, retorna null (ou lança uma exceção)
	    return obj.orElse(null);
		
	}

}
