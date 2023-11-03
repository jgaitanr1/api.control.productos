package com.controlproductos.api.security.services;

import java.util.Set;

import com.controlproductos.api.models.AlmacenProducto;

public interface AlmacenProductoService {
	
	AlmacenProducto agregarAlmacenProducto(AlmacenProducto almacenProducto);
	
	AlmacenProducto actualizarAlmacenProducto(AlmacenProducto almacenProducto);
	
	Set<AlmacenProducto> obtenerAlmacenProductos();

	AlmacenProducto obtenerAlmacenProducto(Long almacenProductoId);
	
	void eliminarAlmacenProducto(Long almacenProductoId);
}
