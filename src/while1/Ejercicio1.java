package while1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Variable para almacenar la suma de los números
		int suma = 0;
		//Variable para almacenar los números introducidos
		int num;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
	
		//Imprimimos que introduzcamos un número
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		//Inicio while, si el número es mayor o igual a 0, seguimos introduciendo números
		while (num>=0) {
			suma+=num;
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
		}
		
		//Si se acaba el bucle while se imprime la suma de todos los números introducidos
		System.out.println("La suma es: " + suma);
		
		//Cierre escáner
		sc.close();
	}

}
