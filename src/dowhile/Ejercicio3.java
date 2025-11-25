package dowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor del número
		int num = 1;
		//Variable para almacenar el valor del número final
		int numFinal;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos un número
		System.out.println("Introduce un número : ");
		numFinal = sc.nextInt();
		
		//Bucle do-while para imprimir los números del 1 al número introducido
		do {
			System.out.print(num + " " );
			num++;
		} while (num <= numFinal);

		//Cierre escáner
		sc.close();
		
	}

}
