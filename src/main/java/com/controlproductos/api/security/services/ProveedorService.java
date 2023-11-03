package com.controlproductos.api.security.services;

import java.util.Set;

import com.controlproductos.api.models.Proveedor;

public interface ProveedorService {

	Proveedor agregarProveedor(Proveedor proveedor);
	
	Proveedor actualizarProveedor(Proveedor proveedor);
	
	Set<Proveedor> obtenerProveedores();
	
	Proveedor obtenerProveedor(Long proveedorId);
	
	void eliminarProveedor(Long proveedorId);
}
