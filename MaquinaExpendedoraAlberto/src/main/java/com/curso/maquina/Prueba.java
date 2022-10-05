package com.curso.maquina;

import java.util.Scanner;

import com.curso.dominio.Maquina;
import com.curso.dominio.Refrescos;



public class Prueba {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/////////////////////////////////////////////////////////////////////////////////////////ATRIBUTOS
		
	int eleccion = 0; // Elegir entre el 1-4 dependiendo del producto que desee el usuario
	
	Refrescos cocaCola = new Refrescos("Coca-Cola","Zero-Azucar",0.33,0.50,8);          //1
	Refrescos fanta = new Refrescos("Fanta","Naranja",0.33,0.65,2);                     //2
	Refrescos cerveza = new Refrescos("Estrella-Galicia","0,0%",0.33,0.70,1);			//3
	Refrescos trina = new Refrescos("Trina","Naranja",0.33,0.80,3);						//4
	
	Maquina maquinita = new Maquina();
	
	
	Scanner sc = new Scanner(System.in);
	
	maquinita.agotado(14);
	

	while(eleccion!=5) {
		
		System.out.println("Indique la opción que desea realizar:" + "\n 1 - Realizar compra bebida "
				+ "\n 2 - Comprobar Stock Máquina " + "\n 3 - Comprobar Cambio Máquina"
				+ "\n 4 - Comprobar Recaudación del día ");
		System.out.println("");
		eleccion = sc.nextInt();
		
		
		switch(eleccion) {
		
		case 1://///////////////////COCACOLA
			System.out.println("Eligio " + cocaCola.getDescripcion() + "y el precio es de " + cocaCola.getPrecio() + "€");
			System.out.println("El Stock restante es " + cocaCola.getStock());
			maquinita.venta();
			maquinita.agotado(0);
			System.out.println("");
			
			break;
		
		
		case 2://///////////////////STOCK MAQUINA
			System.out.println("Eligio " + fanta.getDescripcion() + " de "+ fanta.getSabor() +" y el precio es de " + fanta.getPrecio() + "€");
			System.out.println("El Stock restante es " + fanta.getStock());
			System.out.println("");
			
			break;
		
		
		case 3:///////////////////CAMBIO MAQUINA
			System.out.println("Eligio " + cerveza.getDescripcion()+ " "+ cerveza.getSabor() +" y el precio es de " + cerveza.getPrecio() + "€");
			System.out.println("El Stock restante es " + cerveza.getStock());
			maquinita.sinCambio(eleccion);
			System.out.println("");
			break;
		
		
		case 4://////////////////RECAUDACION DEL DIA
			System.out.println("Eligio " + trina.getDescripcion() + " de "+ trina.getSabor() +" y el precio es de " + trina.getPrecio() + "€");
			System.out.println("El Stock restante es " + trina.getStock());
			maquinita.getRecaudacion();
			System.out.println("");
			break;
		
		default: //////////////////////NINGUNO DE LOS ANTERIORES
			
			System.out.println("Numeración Inválida");
        
		break;
		
		
		
		
		
		}


}//Fin

}

}

