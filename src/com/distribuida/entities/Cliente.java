package com.distribuida.entities;

import java.util.Date;

public class Cliente {

	// atributos
	private int diCliente;
	private String cedula;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String telefono;
	private String direccion;
	private String correo;
	
	//constructores
	public Cliente () {}

	public Cliente(int diCliente, String cedula, String nombre, String apellido, Date fechaNacimiento, String telefono,
			String direccion, String correo) {
		this.diCliente = diCliente;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}
//metodos getters and seterss
	public int getDiCliente() {
		return diCliente;
	}

	public void setDiCliente(int diCliente) {
		this.diCliente = diCliente;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Cliente [diCliente=" + diCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", direccion="
				+ direccion + ", correo=" + correo + "]";
	}

	

	
	
	
}