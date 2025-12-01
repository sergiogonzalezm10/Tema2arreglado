package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		// Crear escáner
		Scanner sc = new Scanner(System.in);

		//Variable para almacenar el número introducido
        int num;
        //Variable para contar los dígitos
        int contador = 0;
        
        // Pedir número mayor que 0
        do {
            System.out.print("Introduce un número mayor que 0: ");
            num = sc.nextInt();
        } while (num <= 0);

     

        // For para ir dividiendo entre 10 hasta llegar a 0
        for (int n = num; n > 0; n /= 10) {
            contador++;
        }

        // Imprimir resultado
        System.out.println("El número " + num + " tiene " + contador + " dígitos.");

        //Cierre escáner
        sc.close();
    }
}
