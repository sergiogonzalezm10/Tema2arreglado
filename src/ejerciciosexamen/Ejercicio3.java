package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el tamaño del triángulo: ");
    int lado = sc.nextInt();

    for (int i = 0; i < lado; i++) {
        // Imprimir espacios a la izquierda para desplazar el triángulo
        for (int espacio = 0; espacio < i; espacio++) {
            System.out.print(" ");
        }

        if (i == 0) {
            // Primera fila: imprimir * separados por espacio
            for (int j = 0; j < lado; j++) {
                System.out.print("*");
                if (j < lado - 1) System.out.print(" ");
            }
        } else if (i == lado - 1) {
            // Última fila: solo un *
            System.out.print("*");
        } else {
            // Filas intermedias: un * al inicio y otro al final
            System.out.print("*");
            // espacios entre los dos asteriscos
            int espaciosInternos = 2 * (lado - i) - 3;
            for (int s = 0; s < espaciosInternos; s++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }

    sc.close();
}
}