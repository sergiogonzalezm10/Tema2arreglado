package buclefor;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor del número
		int num;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos un número
		System.out.print("Introduce un número entero num (>=1): ");
		num = sc.nextInt();
		
		//Imprimimos los números del 1 al num
		if (num<=0) {
		    System.out.println("El número introducido no es válido.");
		    
		} else  {
			
			System.out.println("Contando de 1 a " + num + ":");
			for (int i = 1; i <= num; i++) {
			System.out.println(i);
			
		  }
		}

		//Cierre escáner
		sc.close();
	}

}