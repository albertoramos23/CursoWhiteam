package com.curso.dominio;

public class Cuenta {

///////////////////////////////////////////////////////////////////////ATRIBUTOS
	private double balance;

///////////////////////////////////////////////////////////////////////CONSTRUCTORES

	public Cuenta(double saldoInicial) {
		if (saldoInicial > 0) {
			this.balance = saldoInicial;
		}
	}

////////////////////////////////////////////////////////////////////////MÉTODOS

	public double getBalance() {
		return balance;
	}

	
	/////////////////////////////DEPOSITAR PASTA
	
	public void deposito(double amt) {
		if (amt > 0) {
			this.balance = this.balance + amt;
		} else {
			System.out.println("El importe tiene que ser mayor a 0€");
		}

	}

/////////////////////////////////RETIRAR PASTA
	
	public void retirar(double amt) {

		if (amt <= 0) {
			System.out.println("Debe ser una cantidad mayor a 0 €");
			return;
		}

		if (balance >= amt) {
			this.balance = this.balance - amt;
		} else {
			System.out.println("No tiene suficientes fondos");
		}

	}//

	@Override
	public String toString() {
		return "Cuenta{" + "balance=" + balance + '}';
	}
	
	
	
}
