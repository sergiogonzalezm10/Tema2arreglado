package dowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor del número
		int num = 0;
		//Variable para almacenar el número por el que se multiplica el número base
		int numMult;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos un número
		System.out.println("Introduce un número: ");
		numMult = sc.nextInt();
		
		//Bucle para mientras el número sea menor o igual que 10, imprimir las multiplicaciones
		do {
			System.out.println(numMult + " x " + num + " = " + (numMult * num));
			num++; 
		} while (num <= 10);
		
		//Cierre escáner
		sc.close();
		
	}

}
