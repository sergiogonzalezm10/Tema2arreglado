package ifelse;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variable para almacenar el número
		double num;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos valor del número
		System.out.println("Introduce número comprendido entre 0 y 99999: ");
		num = sc.nextDouble();
		
		//Condicional if para comparar el número
		if (num < 0 || num > 99999) {
			System.out.println("Tiene que ser un número comprendido entre 0 y 99999: ");
		//Condicional if para comparar el número si cumple lo anterior o no y hacer lo siguiente
		} else if ( num < 10) {
			System.out.println("El número tiene 1 cifra");
		} else if ( num < 100) {
			System.out.println("El número tiene 2 cifras");
		} else if ( num < 1000) {
			System.out.println("El número tiene 3 cifras");
		} else if ( num < 10000) {
			System.out.println("El número tiene 4 cifras");
		} else if ( num < 100000) {
			System.out.println("El número tiene 5 cifras");
		}
		
		//Cierre escáner
		sc.close();
	}

}
