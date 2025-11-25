package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Variables para almacenar los números
        int a, b;
        //Variable para almacenar el menor de los dos números
        int menor;
        //Variable para almacenar el máximo común divisor
        int mcd;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número (a): ");
        a = sc.nextInt();

        System.out.print("Introduce el segundo número (b): ");
        b = sc.nextInt();

        menor = (a < b) ? a : b;
        mcd = 1;

        // Recorremos de 1 al menor, guardando el último divisor común
        for (int i = 1; i <= menor; i++) {
            if (a % i == 0 && b % i == 0) {
                mcd = i;
            }
        }

        System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + mcd);

        sc.close();
    }
}
