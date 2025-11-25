package buclefor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int num;
		int cantidadPrimos = 0;
		Scanner scanner = new Scanner(System.in);
		
	     System.out.print("Introduce un número: ");
	     num = scanner.nextInt();

		        //Recorremos desde 1 hasta num
		        for (int i = 1; i <= num; i++) {
	            
	            // El 1 no se considera primo por definición, lo saltamos
	            if (i == 1) {
	                continue;
	            }

	            boolean esPrimo = true;

	            //Comprobamos si 'i' es primo
	            // Intentamos dividir 'i' por todos los números desde 2 hasta i-1
	            // (Para optimizar, bastaría ir hasta i/2, pero lo haremos simple)
	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    esPrimo = false; // Si es divisible, no es primo
	                }
	            }

	            //Si pasó todas las pruebas, sumamos al contador
	            if (esPrimo) { 
	                System.out.print(i + " "); 
	                cantidadPrimos++;
	               
	            }
	        }
		        
	        System.out.println("Entre 1 y " + num + " hay " + cantidadPrimos + " números primos.");
	        
	        scanner.close();
	    }
	}