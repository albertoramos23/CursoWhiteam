package com.curso.dominio;

public class Cliente {

	
	String nombre;
	String apellido;
	private double cuenta;
	
	public Cliente(String nombre, String apellido,double cuenta) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.cuenta = cuenta;
	}

	public Cliente(String nombre, String apellido) {
		this.nombre= nombre;
		this.apellido= apellido;
		
	}
	
	
	
	public double getCuenta() {
		return cuenta;
	}

	public void setCuenta(double cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	
	
}
