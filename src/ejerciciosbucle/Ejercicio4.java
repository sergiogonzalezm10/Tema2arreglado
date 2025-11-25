package ejerciciosbucle;

import java.util.Scanner;

	public class Ejercicio4 {
	
		public static void main(String[] args) {
			//Variables para almacenar los números
	        int a, b;
	        //Variable para almacenar el menor de los dos números
	        int mayor;
	        //Variable para almacenar el máximo común divisor
	        int mcm;
	        Scanner sc = new Scanner(System.in);
	
	        System.out.print("Introduce el primer número (a): ");
	        a = sc.nextInt();
	
	        System.out.print("Introduce el segundo número (b): ");
	        b = sc.nextInt();
	
	        mayor = (a > b) ? a : b;
	        mcm = 0;
	
	        //Recorremos desde el mayor hasta encontrar el mínimo común múltiplo
	        for (int i = mayor; mcm == 0; i++) {
	        	if (i % a == 0 && i % b == 0) {
	                mcm = i;
	            }
	        }
	
	        System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + mcm);
	
	        sc.close();
	    }
	}
