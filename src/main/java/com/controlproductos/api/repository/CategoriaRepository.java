package com.controlproductos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controlproductos.api.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
