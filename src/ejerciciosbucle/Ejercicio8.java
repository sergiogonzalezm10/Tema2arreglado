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

        // El bucle continúa mientras numero no sea 0
        while (numero != 0) {
	        	
        	//Contamos el número introducido
            total++; 

            // Comprobamos si el número es mayor que el anterior
            if (numero > anterior) {
                anterior = numero;
           //Sino, contamos un fallo
            } else {
                System.out.println("Fallo es menor.");
                fallos++;
            }

            // Pedimos el siguiente número
            System.out.print("Dime un número: ");
            numero = sc.nextInt(); 
        }
        
        // Mostramos los resultados
        System.out.println("Total de números introducidos: " + total);
        System.out.println("Números fallados: " + fallos);
        
        //Cierre escáner
        sc.close();
    }
}
