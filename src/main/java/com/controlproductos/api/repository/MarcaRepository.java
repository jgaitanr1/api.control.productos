package com.controlproductos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controlproductos.api.models.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{

}
