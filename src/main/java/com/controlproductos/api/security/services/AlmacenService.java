package com.controlproductos.api.security.services;

import java.util.Set;

import com.controlproductos.api.models.Almacen;

public interface AlmacenService {

	Almacen agregarAlmacenProducto(Almacen almacen);

	Almacen actualizarAlmacenProducto(Almacen almacen);

	Set<Almacen> obtenerAlmacenes();

	Almacen obtenerAlmacen(Long almacenId);

	void eliminarAlmacen(Long almacenId);
}
