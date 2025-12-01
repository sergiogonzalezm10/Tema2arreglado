package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número inicial: ");
        int anterior = sc.nextInt();

        int total = 0;
        int fallos = 0;

        System.out.print("Dime un número: ");
        int numero = sc.nextInt();

        // El bucle continúa mientras numero NO sea 0
        while (numero != 0) {

            total++; // contamos el número introducido

            if (numero > anterior) {
                // correcto → actualizamos
                anterior = numero;
            } else {
                // fallo
                System.out.println("Fallo es menor.");
                fallos++;
            }

            System.out.print("Dime un número: ");
            numero = sc.nextInt(); // pedimos el siguiente número
        }

        System.out.println("Total de números introducidos: " + total);
        System.out.println("Números fallados: " + fallos);

        sc.close();
    }
}
