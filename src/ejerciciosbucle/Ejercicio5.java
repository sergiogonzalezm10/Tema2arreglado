package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variable para almacenar el número N
        int N;

        //Inicio escáner
        Scanner sc = new Scanner(System.in);
        
        //Pedimos un número entre 0 y 20
        do {
            System.out.print("Introduce un número entero entre 0 y 20: ");
            N = sc.nextInt();
        } while (N < 0 || N > 20);

        //Recorremos del 1 al N
        for (int i = 1; i <= N; i++) {
            // Repetimos el número i, i veces
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            //Imprimimos un salto de línea después de cada número
            System.out.println();
        }
        
        //Cierre escáner
        sc.close();
   }
}

