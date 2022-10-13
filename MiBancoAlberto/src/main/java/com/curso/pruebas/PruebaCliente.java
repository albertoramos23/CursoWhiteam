package com.curso.pruebas;

import com.curso.dominio.*;




public class PruebaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Customers Report");
		System.out.println("");
		
		Bank banco = new Bank();
		banco.agregaCliente("Simms","Jane");
		
		Cliente Jane = banco.getClientesIndex(0);
		Cuenta cuenta1 = new CuentaAhorro(500.0,1);
		Cuenta cuenta2 = new CuentaCorriente(500.0,2);
		Jane.añadirCuenta(cuenta1);
		Jane.añadirCuenta(cuenta2);
		
		
		
		
		
		
		/*Cliente cliente1 = new Cliente("Alberto","Ramos", 0.0);
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
		
		
		////////////////////////////////////////////////////////////////////CLIENTES NUEVOS
		
		Cliente cliente = new Cliente("Jane","Simms");
		Cliente cliente22 = new Cliente("Owen","Bryant");
		Cliente cliente3 = new Cliente("Tim","Soley");
		Cliente cliente4 = new Cliente("Maria","Soley");
		Cliente cliente5 = new Cliente("Jane","Smith");
		Cliente cliente6 = new Cliente("Alberto","Ramos");
	
		Cuenta dinero1 = new Cuenta(1789.90);
		
		///////////////////////////////////////////////////////////////////CLIENTES NUEVOS.
		Bank banco = new Bank();
		
		banco.agregaCliente(cliente);
		banco.agregaCliente(cliente22);
		banco.agregaCliente(cliente3);
		banco.agregaCliente(cliente4);
		banco.agregaCliente(cliente5);
		banco.agregaCliente(cliente6);
		System.out.println("Los clientes totales del banco son: " + banco.getCantidadClientes());
		
		System.out.println(cliente.getNombre()+" "+cliente.getApellido()+"\n"+cliente22.getNombre()+" "+cliente22.getApellido()+
				"\n"+cliente3.getNombre()+" "+cliente3.getApellido()+"\n"+cliente4.getNombre()+" "+cliente4.getApellido()+
				"\n"+cliente5.getNombre()+" "+cliente.getApellido()+"\n"+cliente6.getNombre()+" "+cliente6.getApellido());
		
		///////////////////////////////////////////////////////////////////BUSCADOR CLIENTE
		//System.out.println(banco.getClientes("Alberto"));
		*/
		
		
	}

}
