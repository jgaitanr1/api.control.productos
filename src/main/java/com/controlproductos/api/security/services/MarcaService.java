package com.controlproductos.api.security.services;

import java.util.Set;

import com.controlproductos.api.models.Marca;

public interface MarcaService {

	Marca agregarMarca(Marca marca);
	
	Marca actualizarMarca(Marca marca);
	
	Set<Marca> obtenerMarcas();
	
	Marca obtenerMarca(Long marcaId);
	
	void eliminarMarca(Long marcaId);
}
