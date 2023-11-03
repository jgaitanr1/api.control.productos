package com.controlproductos.api.security.services;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlproductos.api.models.Producto;
import com.controlproductos.api.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto agregarProducto(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Set<Producto> obtenerProductos() {
		return new LinkedHashSet<>(productoRepository.findAll());
	}

	@Override
	public Producto obtenerProducto(Long productoId) {
		return productoRepository.findById(productoId).get();
	}

	@Override
	public void eliminarProducto(Long productoId) {
		Producto producto = new Producto();
		producto.setId(productoId);
		productoRepository.delete(producto);
	}

	
}
