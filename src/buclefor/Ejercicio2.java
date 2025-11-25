package buclefor;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor del número
		int contador = 0;
		
		//Variable para almacenar el valor del múltiplo
		int limite; 
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos un número
		System.out.print("Introduce un número: ");
        limite = sc.nextInt();
        
        //Bucle for para contar los múltiplos de 3 entre 1 y el número introducido
		for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                contador++;
            }
		}
		
		//Imprimimos el resultado
        System.out.println("Hay " + contador + " múltiplos de 3 entre 1 y " + limite + ".");
        
        //Cierre escáner
        sc.close();
		
	}
}
