package com.controlproductos.api.security.services;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlproductos.api.models.Marca;
import com.controlproductos.api.repository.MarcaRepository;

@Service
public class MarcaServiceImpl implements MarcaService{

	@Autowired
	private MarcaRepository marcaRepository;
	
	@Override
	public Marca agregarMarca(Marca marca) {
		return marcaRepository.save(marca);
	}

	@Override
	public Marca actualizarMarca(Marca marca) {
		return marcaRepository.save(marca);
	}

	@Override
	public Set<Marca> obtenerMarcas() {
		return new LinkedHashSet<>(marcaRepository.findAll());
	}

	@Override
	public Marca obtenerMarca(Long marcaId) {
		return marcaRepository.findById(marcaId).get();
	}

	@Override
	public void eliminarMarca(Long marcaId) {
		Marca marca = new Marca();
		marca.setId(marcaId);
		marcaRepository.delete(marca);
	}

}
