package com.controlproductos.api.security.services;

import java.util.Set;

import com.controlproductos.api.models.Producto;

public interface ProductoService {

	Producto agregarProducto(Producto producto);
	
	Producto actualizarProducto(Producto producto);
	
	Set<Producto> obtenerProductos();
	
	Producto obtenerProducto(Long productoId);
	
	void eliminarProducto(Long productoId);
}
