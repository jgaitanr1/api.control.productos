package com.controlproductos.api.security.services;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlproductos.api.models.AlmacenProducto;
import com.controlproductos.api.repository.AlmacenProductoRepository;

@Service
public class AlmacenProductoServiceImpl implements AlmacenProductoService {

	@Autowired
	private AlmacenProductoRepository almacenProductoRepository;

	@Override
	public AlmacenProducto agregarAlmacenProducto(AlmacenProducto almacenProducto) {
		return almacenProductoRepository.save(almacenProducto);
	}

	@Override
	public AlmacenProducto actualizarAlmacenProducto(AlmacenProducto almacenProducto) {
		return almacenProductoRepository.save(almacenProducto);
	}

	@Override
	public Set<AlmacenProducto> obtenerAlmacenProductos() {
		return new LinkedHashSet<>(almacenProductoRepository.findAll());
	}

	@Override
	public AlmacenProducto obtenerAlmacenProducto(Long almacenProductoId) {
		return almacenProductoRepository.findById(almacenProductoId).get();
	}

	@Override
	public void eliminarAlmacenProducto(Long almacenProductoId) {
		AlmacenProducto almacenProducto = new AlmacenProducto();
		almacenProducto.setId(almacenProductoId);
		almacenProductoRepository.delete(almacenProducto);
	}
	
}
