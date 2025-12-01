package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número n: ");
        int n = sc.nextInt();

        // Generar la pirámide
        for (int i = 1; i <= n; i++) {

            // Parte creciente: 1 hasta i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Parte decreciente: i-1 hasta 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Salto de línea al final de cada fila
            System.out.println(); 
        }
        
        //Cierre escáner
        sc.close();
    }
}