package com.controlproductos.api.security.services;

import java.util.Set;

import com.controlproductos.api.models.UnidadMedida;

public interface UnidadMedidaService {

	UnidadMedida agregarUnidadMedida(UnidadMedida unidadMedida);
	
	UnidadMedida actualizarUnidadMedida(UnidadMedida unidadMedida);
	
	Set<UnidadMedida> obtenerUnidadMedidas();
	
	UnidadMedida obtenerUnidadMedida(Long unidadMedidaId);
	
	void eliminarUnidadMedida(Long unidadMedidaId);
}
