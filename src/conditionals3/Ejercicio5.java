package conditionals3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		double distancia;
		double dias;
		double precioTotal;
		double descuento;
		final double PRECIOKM = 2.5;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos la distancia a recorrer
		System.out.println("Distancia a recorrer ( en Km ): ");
		distancia = sc.nextDouble();
		
		//Imprimimos que introduzcamos los días de estancia
		System.out.println("Número de días: ");
		dias = sc.nextDouble();
		
		//Operación para calcular el precio total
		precioTotal = distancia * PRECIOKM;
		
		//Condicional if para si los dias son mayor a 7 o los kms a 800, aplicar descuento
		if (dias > 7 || distancia > 800) {
			descuento = ( precioTotal * 0.70 );
			System.out.println("Usted cuenta con descuento del 30%");
			System.out.println("El precio con descuento es de: " + descuento);
		} else {
			System.out.println("El precio del billete es de: " + precioTotal);
		}
		
		// Cierre escáner
		sc.close();
	}

}
