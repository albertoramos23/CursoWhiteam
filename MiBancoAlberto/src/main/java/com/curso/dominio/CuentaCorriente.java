package com.curso.dominio;

public class CuentaCorriente extends Cuenta {

	
///////////////////////////////////////////////////////////////////atributos
	
	private double descubierto;
	
//////////////////////////////////////////////////////////////////Constructores
	
	public CuentaCorriente(double saldoInicial ) {
		super(saldoInicial,0.0);
		// TODO Auto-generated constructor stub
	}

	public CuentaCorriente(double saldoInicial, double descubierto) {
		super(saldoInicial);
		this.descubierto = descubierto;
	}

	
	
	
	
///////////////////////////////////////////////////////////////////metodos
	
	
	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	
	
	public void retirar(double amt) {

		boolean result = true;
		
		if (balance < amt) {
			double descubierto = amt - balance;
			if ( descubierto < overdraftNeeded ) {
				result = false;
				} else {
				balance = 0.0;
				descubierto -= overdraftNeeded;
				}
				} else {
				balance -= amt
				}//

				
	
	
	return result;
}
}