package while1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Variable para almacenar los números introducidos
		int num;
		
		//Variable para almacenar los números positivos
		int suma = 0;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos un número
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		//Inicio while, si el número es mayor o igual a 0, se suma a uno la cantidad de números introducidos.
		while (num >= 0) {
			suma++;
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
		}
		
		//Si acaba el bucle, imprimimos la cantidad de números positivos
		System.out.println("Números positivos: " + suma);
		
		//Cierre escáner
		sc.close();
		
	}

}
