package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
			//Variable para la base y altura del triángulo
			int num;

			//Inicio escáner
	        Scanner sc = new Scanner(System.in);
	        
	        //Pedimos un número entero para la base y altura del triángulo
	        System.out.print("Introduce un número entero para la base y altura del triángulo: ");
	        num = sc.nextInt();

	        // Bucle para cada fila
	        for (int i = 1; i <= num; i++) {
	            // Imprimir espacios antes de los asteriscos
	        	for (int j = 0; j < num- i; j++) {
	                System.out.print(" ");
	            }
	            // Imprimir asteriscos
	            for (int k = 0 ; k < i; k++) {
	                System.out.print("* ");
	            }
	            // Salto de línea al final de cada fila
	            System.out.println(); 
	        }
	        
	        //Cierre escáner
	        sc.close();
	    }
	}