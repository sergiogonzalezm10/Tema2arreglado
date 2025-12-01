package exceptions;

import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		
		//Inicio escáner
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos que introduzcamos la edad
		System.out.println("Introduce su edad: ");
		int edad = scanner.nextInt();
		
		//Comprobamos que la edad es válida
		assert edad >= 0 && edad <=130 : "La edad no es válida";
		
		//Mostramos la edad

		
		//Cerramos el escáner
		scanner.close();
		
	}

}
