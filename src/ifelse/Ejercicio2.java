package ifelse;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
	//Variable para almacenar el número
	double num;

	//Inicio escáner
	Scanner sc = new Scanner(System.in);
	
	//Imprimimos que introduzcamos un número
	System.out.println("Introduce número:");
	num = sc.nextDouble();
	
	//Condicional iff para comprobar si el número es casi-cero o no
	if (num <= -1 || num >= 1) {
		System.out.println("El número no es casi-cero");
	} else { 
		System.out.println("El número es casi-cero");
	}

	//Cierre escáner
	sc.close();
	}

}
