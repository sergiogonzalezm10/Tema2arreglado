package while1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable para almacenar los números introducidos
				int num;
				
				//Variable para almacenar la suma de los números 
				int suma = 0;
				
				//Variabl para almacenar la cantidad de números introducidos
				int cantidadNum = 0;
				//Inicio escáner
				Scanner sc = new Scanner(System.in);
				
				//Imprimimos que introduzcamos un número
				System.out.println("Introduce un número: ");
				num = sc.nextInt();
				
				//Inicio while, si el número es mayor o igual a 0, se suma a uno la cantidad de números introducidos.
				while (num >= 0) {
					suma+=num;
					cantidadNum++;
					System.out.println("Introduce un número: ");
					num = sc.nextInt();
				}
				
				if (cantidadNum > 0) {
		            System.out.println("La media de los números positivos introducidos es: " + (suma/cantidadNum));
		        } else {
		            System.out.println("No se introdujeron números positivos.");
		        }
				//Cierre escáner
				sc.close();
				
			}

		}
