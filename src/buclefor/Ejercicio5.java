package buclefor;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Variable para almacenar el factorial
		long factorial = 1;
		
		//Número del cual queremos calcular el factorial
		int numero; 
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos un número
		System.out.print("Introduce un número para calcular su factorial: ");
		numero = sc.nextInt();
		
		//Bucle for para calcular el factorial
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
		}
		
		//Imprimimos el resultado
		System.out.println("El factorial de " + numero + " es: " + factorial);

		//Cierre escáner
		sc.close();
	}

}
