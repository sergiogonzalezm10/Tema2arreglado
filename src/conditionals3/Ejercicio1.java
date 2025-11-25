package conditionals3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Inicio escáner
		Scanner sc = new Scanner(System.in);

		// Variable para almacenar el número introducido
		int numero;
			
		//Variables para cada uno de los digitos del número
		int digito1;
		int digito2;
		int digito3;
		int digito4;

		//Imprimimos que introduzcamos el número
		System.out.print("Introduce un número entre 0 y 9999: ");
		numero = sc.nextInt();
		
		//Condicional if para comparar el número
		if (numero < 0 || numero > 9999) {
			System.out.println("El número introducido debe estar entre 0 y 9999");
		//Condicional else if para saber si el número es capicúa
				} else if (numero < 10) {
					System.out.println("El número " + numero + " es capicúa.");
			
				} else if (numero < 100) {
					digito1 = numero / 10;
					digito2 = numero % 10;
					
					if (digito1 == digito2) {
						System.out.println("El número " + numero + " es capicúa.");

					} else {
						System.out.println("El número " + numero + " no es capicúa.");

					}
				} else if (numero < 1000) {
					digito1 = numero / 100;
					digito3 = numero % 10;
					
					if (digito1 == digito3) {
						System.out.println("El número " + numero + " es capicúa.");

					} else {
						System.out.println("El número " + numero + " no es capicúa.");

					}
				} else {
					digito1 = numero / 1000;
					digito2 = (numero / 100) % 10;
					digito3 = (numero / 10) % 10;
					digito4 = numero % 10;

					if ((digito1 == digito4) && (digito2 == digito3)) {
						System.out.println("El número " + numero + " es capicúa.");

					} else {
						System.out.println("El número " + numero + " no es capicúa.");
					}
				}
		
				//Cierre escáner
				sc.close();
			}
}
