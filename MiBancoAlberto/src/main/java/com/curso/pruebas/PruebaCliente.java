package com.curso.pruebas;

import com.curso.dominio.Cliente;
import com.curso.dominio.Cuenta;

public class PruebaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente("Alberto","Ramos", 0.0);
		Cliente cliente2 = new Cliente("Jane","Smith", 0.0);
	
		Cuenta cuenta1 = new Cuenta(500.0);
		Cuenta cuenta2 = new Cuenta(500.0);
		
		
///////////////////////////////////////////////////////////////////PARA CLIENTE ALBERTO RAMOS
		
		// INGRESAR
		System.out.println("Bienvenido al servicio Sr/Sra: " + cliente1.getApellido());
		System.out.println("Su saldo actual es de " + cliente1.getCuenta() + "€");
		System.out.println("Ingreso 200€");
		cuenta1.deposito(200.0);
		System.out.println("Su saldo actual es de " + cuenta1.getBalance() + "€");
		System.out.println("");
		
		// RETIRAR
		System.out.println("Retirar 800€");
		cuenta1.retirar(800.0);
		System.out.println("Su saldo actual es de " + cuenta1.getBalance() + "€");
		System.out.println("Gracias por usar el servicio " + cliente1.getNombre());	
		System.out.println("");	
	
////////////////////////////////////////////////////////////////////PARA CLIENTE JANE SMITH
		
		
		// RETIRAR
		System.out.println("Bienvenido al servicio Sr/Sra: " + cliente2.getApellido());
		System.out.println("Su saldo actual es de " + cliente2.getCuenta() + "€");
		System.out.println("Retirar 150€");
		cuenta2.retirar(150.0);
		System.out.println("Su saldo actual es de " + cuenta2.getBalance() + "€");
		System.out.println("");
		
		//INGRESAR
		System.out.println("Ingresar 22,50€");
		cuenta2.deposito(22.50);
		System.out.println("Su saldo actual es de " + cuenta2.getBalance() + "€");
		System.out.println("");	
		System.out.println("");
	
		// RETIRAR
		System.out.println("Retirar 47,62€");
		cuenta2.retirar(47.62);
		System.out.println("Su saldo actual es de " + cuenta2.getBalance() + "€");
		System.out.println("");	
		System.out.println("");
		
		// RETIRAR
		System.out.println("Retirar 400,00€");
		cuenta2.retirar(400.00);
		System.out.println("Su saldo actual es de " + cuenta2.getBalance() + "€");
		System.out.println("Gracias por usar el servicio " + cliente2.getNombre());
		System.out.println("");
		
		
	}

}
