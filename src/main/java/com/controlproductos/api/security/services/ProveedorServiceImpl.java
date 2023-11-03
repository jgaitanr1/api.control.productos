package com.controlproductos.api.security.services;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controlproductos.api.models.Proveedor;
import com.controlproductos.api.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	private ProveedorRepository proveedorRepository;
	
	@Override
	public Proveedor agregarProveedor(Proveedor proveedor) {
		return proveedorRepository.save(proveedor);
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		return proveedorRepository.save(proveedor);
	}

	@Override
	public Set<Proveedor> obtenerProveedores() {
		return new LinkedHashSet<>(proveedorRepository.findAll());
	}

	@Override
	public Proveedor obtenerProveedor(Long proveedorId) {
		return proveedorRepository.findById(proveedorId).get();
	}

	@Override
	public void eliminarProveedor(Long proveedorId) {
		Proveedor proveedor = new Proveedor();
		proveedor.setId(proveedorId);
		proveedorRepository.delete(proveedor);
	}

}
