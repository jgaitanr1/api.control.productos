package com.controlproductos.api.payload.response;

import java.util.List;

public class UserInfoResponse {
	private Long id;
	private String username;
	private String email;
	private String nombre;
	private String apellido;
	private String docIdentidad;
	private String fecNacimiento;
	private String nroTelefono;
	private boolean estado;
	private List<String> roles;
	
	public UserInfoResponse(Long id, String username, String email, String nombre, String apellido,
			String docIdentidad, String fecNacimiento, String nroTelefono, boolean estado, List<String> roles) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;

		this.nombre = nombre;
		this.apellido = apellido;
		this.docIdentidad = docIdentidad;
		this.fecNacimiento = fecNacimiento;
		this.nroTelefono = nroTelefono;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocIdentidad() {
		return docIdentidad;
	}

	public void setDocIdentidad(String docIdentidad) {
		this.docIdentidad = docIdentidad;
	}

	public String getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(String fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String getNroTelefono() {
		return nroTelefono;
	}

	public void setNroTelefono(String nroTelefono) {
		this.nroTelefono = nroTelefono;
	}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public List<String> getRoles() {
		return roles;
	}
}
