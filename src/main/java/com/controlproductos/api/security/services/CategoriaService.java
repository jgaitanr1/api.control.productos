package com.controlproductos.api.security.services;

import java.util.Set;

import com.controlproductos.api.models.Categoria;

public interface CategoriaService {
	
	Categoria agregarCategoria(Categoria categoria);
	
	Categoria actualizarCategoria(Categoria categoria);
	
	Set<Categoria> obtenerCategorias();
	
	Categoria obtenerCategoria(Long categoriaId);
	
	void eliminarCategoria(Long categoriaId);

}
