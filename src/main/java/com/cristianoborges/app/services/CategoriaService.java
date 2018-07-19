package com.cristianoborges.app.services;

import  java.util.Optional ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristianoborges.app.domain.Categoria;
import com.cristianoborges.app.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) { Categoria obj = repo.findOne(id); return obj;
	}
}