package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
			//Variable para la base y altura del triángulo
			int n;

			//Inicio escáner
	        Scanner sc = new Scanner(System.in);
	        
	        //Pedimos un número entero para la base y altura del triángulo
	        System.out.print("Introduce un número entero para la base y altura del triángulo: ");
	        n = sc.nextInt();

	        // Bucle para cada fila
	        for (int i = 1; i <= n; i++) {
	            // Espacios antes de los asteriscos
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // Asteriscos separados por espacios
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	                if (k < i) { // Evitar espacio extra al final
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Salto de línea al final de la fila
	        }
	        
	        //Cierre escáner
	        sc.close();
	    }
	}