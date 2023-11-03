package com.controlproductos.api.security.services;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlproductos.api.models.UnidadMedida;
import com.controlproductos.api.repository.UnidadMedidaRepository;

@Service
public class UnidadMedidaServiceImpl implements UnidadMedidaService{

	@Autowired
	private UnidadMedidaRepository unidadMedidaRepository;
	
	@Override
	public UnidadMedida agregarUnidadMedida(UnidadMedida unidadMedida) {
		return unidadMedidaRepository.save(unidadMedida);
	}

	@Override
	public UnidadMedida actualizarUnidadMedida(UnidadMedida unidadMedida) {
		return unidadMedidaRepository.save(unidadMedida);
	}

	@Override
	public Set<UnidadMedida> obtenerUnidadMedidas() {
		return new LinkedHashSet<>(unidadMedidaRepository.findAll());
	}

	@Override
	public UnidadMedida obtenerUnidadMedida(Long unidadMedidaId) {
		return unidadMedidaRepository.findById(unidadMedidaId).get();
	}

	@Override
	public void eliminarUnidadMedida(Long unidadMedidaId) {
		UnidadMedida unidadMedida = new UnidadMedida();
		unidadMedida.setId(unidadMedidaId);
		unidadMedidaRepository.delete(unidadMedida);
	}

}
