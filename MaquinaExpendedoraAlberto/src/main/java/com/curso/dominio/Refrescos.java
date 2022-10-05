package com.curso.dominio;

public class Refrescos {

	
	/////////////////////////////////////////////////////////ATRIBUTOS
	String descripcion;
	String sabor;
	double cl;
	double precio;
	int stock;
	enum agotado{
		SI,NO;
	}
	
	
	/////////////////////////////////////////////////////////CONSTRUCTORES
	
	public Refrescos(String descripcion, String sabor, double cl, double precio, int stock) {
		super();
		this.descripcion = descripcion;
		this.sabor = sabor;
		this.cl = cl;
		this.precio = precio;
		this.stock = stock;
	}

	
	
/////////////////////////////////////////////////////////////METODOS

	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public double getCl() {
		return cl;
	}


	public void setCl(double cl) {
		this.cl = cl;
	}


	public double getPrecio() {
		return this.precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}

	
	public void setStock(int stock) {
		this.stock = stock;
	}

	

	@Override
	public String toString() {
		return "Refrescos [descripcion=" + descripcion + ", sabor=" + sabor + ", cl=" + cl + ", precio=" + precio
				+ ", stock=" + stock + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
