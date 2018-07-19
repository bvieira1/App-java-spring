package com.cristianoborges.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cristianoborges.app.domain.Produto;



@Repository
public  interface  ProdutoRepository  extends  JpaRepository < Produto , Integer > {

}
