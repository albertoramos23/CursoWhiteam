package com.curso.dominio;

public class CuentaAhorro extends Cuenta{

	///////////////////////////////////////////////////////////////////atributos
	private double tipoInteres;
	
	
	
	//////////////////////////////////////////////////////////////////Constructores
	
	public CuentaAhorro(double saldoInicial) {
		super(saldoInicial);
		
	}
		
	public CuentaAhorro(double saldoInicial, double tipoInteres) {
		super(saldoInicial);
		this.tipoInteres = tipoInteres;
	}

	
	
	/////////////////////////////////////////////////////////////////metodos
	
	
	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}	
	
	



	



	

}
