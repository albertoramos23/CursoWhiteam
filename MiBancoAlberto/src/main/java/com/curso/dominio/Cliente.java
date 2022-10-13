package com.curso.dominio;

public class Cliente {

	
	String nombre;
	String apellido;
	//private double cuenta;
	
	private Cuenta[] cuentas;
	private int numeroCuenta;
	
	public Cliente(String nombre, String apellido,double cuenta) {
		this.nombre= nombre;
		this.apellido= apellido;
		//this.cuenta = cuenta;
	}

	public Cliente(String nombre, String apellido) {
		this.nombre= nombre;
		this.apellido= apellido;
		
		cuentas = new Cuenta[10];
		numeroCuenta = 0;
	}
	
	//////////////////////////////////////////////////
	
	public void añadirCuenta(Cuenta cuenta) {
		int i = numeroCuenta++;
		cuentas[i]= cuenta;
	}
	
	/*public double getCuenta() {
		return cuenta;
	}*/

	/*public void setCuenta(double cuenta) {
		this.cuenta = cuenta;
	}*/

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	

	public Cuenta getCuenta(int cuenta_index) {
		return cuentas[cuenta_index];
	}

	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	
	
	
}
