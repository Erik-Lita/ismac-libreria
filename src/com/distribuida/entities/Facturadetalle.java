package com.distribuida.entities;

public class Facturadetalle {

	private int idFacturadetalle;
	private double cantidad;
	private double subtota;
	
	
	private Factura factura;
	private Libro libro;
	
	
	public Facturadetalle() {}


	public Facturadetalle(int idFacturadetalle, double cantidad, double subtota, Factura factura, Libro libro) {
	
		this.idFacturadetalle = idFacturadetalle;
		this.cantidad = cantidad;
		this.subtota = subtota;
		this.factura = factura;
		this.libro = libro;
	}
	
	
	
	
}
