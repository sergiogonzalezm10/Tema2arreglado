package ifelse;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Variable para almacenar el número entero
		int num;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos un número
		System.out.println("Introduce un número:");
		num = sc.nextInt();
		
		//Condicional if para comprobar si el número es par o impar y imprimir par o impar dependiendo.
		if (num % 2 == 0) {
			System.out.println("El número es par");	
		} else { 
			System.out.println("El número es impar"); 
		}
		
		//Cierre escáner
		sc.close();
	}

	}
