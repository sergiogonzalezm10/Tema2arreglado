package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		int lado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la longitud del lado del cuadrado: ");
		lado = sc.nextInt();

		// Bucle para filas
		for (int i = 1; i <= lado; i++) { 
			// Bucle para columnas
            for (int j = 1; j <= lado; j++) {
                // Bordes: primera o última fila, primera o última columna
                if (i == 1 || i == lado || j == 1 || j == lado) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            // Salto de línea al final de la fila
            System.out.println(); // salto de línea al final de la fila
        }

		//	Cierre escáner
        sc.close();
    }
}