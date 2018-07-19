package com.cristianoborges.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristianoborges.app.domain.Categoria;
import com.cristianoborges.app.repositories.CategoriaRepository;
import com.cristianoborges.app.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Categoria obj = repo.findOne(id); 
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrato! Id: " + id 
					+ ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}
}