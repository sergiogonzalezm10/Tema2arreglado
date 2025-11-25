package ifelse;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Variable para almacenar el primer número
		int num1;
		//Variable para almacenar el segundo número
		int num2;
		//Variable para almacenar el tercer número
		int num3;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos el primer número
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextInt();
		//Imprimimos que introduzcamos el segundo número
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextInt();
		//Imprimimos que introduzcamos el tercer número
		System.out.println("Introduce el tercer número: ");
		num3 = sc.nextInt();
		
		//Condicional para comprobar si la suma de los dos primeros números es igual al tercer número
		if (num1 + num2 == num3) {
			System.out.println("La suma del número 1 y número 2 es igual al número 3");
			
		//Condicional else if para comprobar si la suma del primer número y del tercero es igual al segundo número
		} else if ( num1 + num3 == num2) {
			System.out.println("La suma del número 1 y número 3 es igual al número 2");
		//Concicional else if para comprobar si la sumda del segundo número y del tercero es igual al primer número
		} else if ( num2 + num3 == num1) {
			System.out.println("La suma del número 2 y número 3 es igual al número 1");
		
		//Condicional else por sino se cumple lo anterior, imprimir la suma entre dos de los tres números no da de resultado el valor del otro
		} else {
			System.out.println("La suma entre dos de algunos de estos números no da de resultado el valor del otro");
		}
		
		//Cierre escáner
		sc.close();
	}
}
