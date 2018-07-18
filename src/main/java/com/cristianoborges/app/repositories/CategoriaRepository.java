package com.cristianoborges.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cristianoborges.app.domain.Categoria;

@Repository
public  interface  CategoriaRepository  extends  JpaRepository < Categoria , Integer > {

}
