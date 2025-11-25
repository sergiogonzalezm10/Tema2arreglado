package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int n;
		
	      	Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Introduce el número de filas de la pirámide: ");
	        n = sc.nextInt();
	        
	        // Bucle para cada fila
	        for (int i = 1; i <= n; i++) {
	            //1. Espacios iniciales para centrar la pirámide
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            //2. Parte ascendente: del 1 hasta i
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }

	            //3. Parte descendente: de i-1 hasta 1
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }

	            //Salto de línea al final de la fila
	            System.out.println();
	        }
	        
	        //Cierre escáner
	        sc.close();
	    }
	}
