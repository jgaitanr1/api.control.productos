package com.controlproductos.api.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String codigo;
	private String descripcion;
	private double precio;
	
	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AlmacenProducto> inventarioProductos = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)
    private Categoria categoria;

    @ManyToOne(fetch = FetchType.EAGER)
    private UnidadMedida unidadMedida;

    @ManyToOne(fetch = FetchType.EAGER)
    private Marca marca;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<AlmacenProducto> getInventarioProductos() {
		return inventarioProductos;
	}

	public void setInventarioProductos(List<AlmacenProducto> inventarioProductos) {
		this.inventarioProductos = inventarioProductos;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public UnidadMedida getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Producto(Long id, String codigo, String descripcion, double precio,
			List<AlmacenProducto> inventarioProductos, Categoria categoria, UnidadMedida unidadMedida, Marca marca) {
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.inventarioProductos = inventarioProductos;
		this.categoria = categoria;
		this.unidadMedida = unidadMedida;
		this.marca = marca;
	}

	public Producto() {

	}
	
	
    
    
}
