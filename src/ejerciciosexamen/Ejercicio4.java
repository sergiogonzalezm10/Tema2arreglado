package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Introduzca el tamaño del lado: ");
        int n = sc.nextInt();

        int filas = 2 * n - 1;

        for (int i = 1; i <= filas; i++) {
            int numAsteriscos;
            int espaciosInicio;

            if (i <= n) {
                // Primera mitad: líneas de tamaño creciente
                numAsteriscos = n + 2 * (i - 1);
                espaciosInicio = n - i;
            } else {
                // Segunda mitad: líneas de tamaño decreciente
                int k = i - n;
                numAsteriscos = n + 2 * (filas - i);
                espaciosInicio = k;
            }

            // Espacios iniciales para centrar la figura
            for (int j = 0; j < espaciosInicio; j++) {
                System.out.print(" ");
            }

            // Asteriscos contiguos
            for (int j = 0; j < numAsteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
