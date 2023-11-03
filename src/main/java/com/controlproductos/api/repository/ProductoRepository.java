package com.controlproductos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controlproductos.api.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
