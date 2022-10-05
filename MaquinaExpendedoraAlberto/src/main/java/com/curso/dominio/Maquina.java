package com.curso.dominio;

import com.curso.dominio.Refrescos;
import com.curso.maquina.Prueba;

public class Maquina {

	/////////////////////////////////////////////////////////////// ATRIBUTOS
	
	double monedas=0; 			//Introducidas en la maquina
	double cambio=5.00;         //Cambio que hay dentro de la maquina
	double recaudacion=0;		//Lo que se va ingresando por ventas.
	int stockMaquina=10;		//Stock Actual de la maquina.
	double precioBebida=0.50;	//Precio de la bebida por unidad.

	///////////////////////////////////////////////////////////////// CONSTRUCTORES

	/*public Maquina(double monedas, double cambio, double recaudacion, int stockMaquina, double precioBebida) {
		super();
		this.monedas = monedas;
		this.cambio = cambio;
		this.recaudacion = recaudacion;
		this.stockMaquina = stockMaquina;
		this.precioBebida = precioBebida;
	}

	*/
	/////////////////////////////////////////////////////////////////METODOS
	
	public void venta() {

		if (stockMaquina > 0) {
			stockMaquina = stockMaquina - 1;
			recaudacion = recaudacion + 1;
			System.out.println("Gracias , aqui tiene su bebida");
		
		} else {
			System.out.println("La maquina esta fuera de servicio");
			System.out.println("Recoja el cambio" + monedas);
		}
	}

	public void reponer(int refrescosNuevos) {
		this.stockMaquina = refrescosNuevos;

	}

	public boolean agotado(int stockMaquina) {

		if (stockMaquina <= 0) {
			System.out.println("Producto Agotado");
			return true;
		} else {
			stockMaquina--;
			

		}
		return false;

	}

	public void introduceImporte(double precio) {

		if (monedas < precioBebida) {
			this.precioBebida = this.precioBebida + monedas;
		} else {
			System.out.println("El importe tiene que ser mayor a 0€");
		}

	}

	public void sinCambio(double precio) {

		if (monedas == precio) {
			System.out.println(+precio + "Es el precio exacto");
		} else {
			cambio = monedas - precio;
			System.out.println("Su cambio es : " + cambio);
		}

	}

	/////////////////////////////////////////////////////////////////////////GET Y SETTERS
	public double getRecaudacion() {
		return this.recaudacion * this.precioBebida;
	}

	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}

	public int getStockMaquina() {
		return this.stockMaquina;
	}

	public void setStockMaquina(int stockMaquina) {
		this.stockMaquina = stockMaquina;
	}


	public double getMonedas() {
		return monedas;
	}


	public void setMonedas(double monedas) {
		this.monedas = monedas;
	}


	public double getCambio() {
		return cambio;
	}


	public void setCambio(double cambio) {
		this.cambio = cambio;
	}


	public double getPrecioBebida() {
		return precioBebida;
	}


	public void setPrecioBebida(double precioBebida) {
		this.precioBebida = precioBebida;
	}

	
	
	
	
}
