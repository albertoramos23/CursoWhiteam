package com.curso.dominio;

import com.curso.dominio.Cliente;


public class Bank {

	private Cliente[] clientes;
	private int cantidadClientes;
	
	
	public Bank() {
		
		clientes = new Cliente[6];
		cantidadClientes = 0;
		//clientes[0] = new Cliente("Jane","Smith");
	
	
	}

	public void agregaCliente(String nombre , String apellido) {
		
		int numero = cantidadClientes++;
		clientes[numero]= new Cliente(nombre,apellido);
		
		
	}

	public int getCantidadClientes() {
		return cantidadClientes;
	}

	public Cliente getClientes(Cliente[] clientes,String nombre , String apellido) {
		
		int numero = 0;
		
		Cliente clienteNuevo = new Cliente(nombre, apellido);
		
		while(clientes!=null) {
		
		if(clientes[numero].getNombre().equals(nombre)) {
			
			clienteNuevo=clientes[numero];
		}
		numero++;
		}
		
		return clienteNuevo;
		
		
	}

	public Cliente getClientesIndex(int index) {
		
		return clientes[index];
		
	}
	
	
	public void agregaCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		int numero = cantidadClientes++;
		clientes[numero]= new Cliente(null, null);
	}

	

	
	
	
	
	
	
	
	
	
	
	
}
