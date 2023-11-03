package com.controlproductos.api.security.services;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlproductos.api.models.Almacen;
import com.controlproductos.api.repository.AlmacenRepository;

@Service
public class AlmacenServiceImpl implements AlmacenService{

	@Autowired
	private AlmacenRepository almacenRepository;
	
	@Override
	public Almacen agregarAlmacenProducto(Almacen almacen) {
		return almacenRepository.save(almacen);
	}

	@Override
	public Almacen actualizarAlmacenProducto(Almacen almacen) {
		return almacenRepository.save(almacen);
	}

	@Override
	public Set<Almacen> obtenerAlmacenes() {
		return new LinkedHashSet<>(almacenRepository.findAll());
	}

	@Override
	public Almacen obtenerAlmacen(Long almacenId) {
		return almacenRepository.findById(almacenId).get();
	}

	@Override
	public void eliminarAlmacen(Long almacenId) {
		Almacen almacen = new Almacen();
		almacen.setId(almacenId);
		almacenRepository.delete(almacen);
	}

}
