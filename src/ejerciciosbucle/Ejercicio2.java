package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variable para almacenar el valor del número
		int num;
		//Variable para contar los divisores
		int divisores = 0;
		//Variable para contar los números primos
		 int contadorPrimos = 0;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos un número
		System.out.print("Introduce un número : ");
        num = sc.nextInt();


        //Bucle for para recorrer todos los números desde 1 hasta num
        for (int i = 1; i <= num; i++) {
            //Bucle for para contar cuántos divisores tiene i
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }

            //Condicional if para si tiene exactamente 2 divisores, el número es primo
            if (divisores == 2) {
                contadorPrimos++;
            }
        }
        
        //Imprimimos la cantidad de números primos encontrados
        System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + num);

        //Cierre escáner
        sc.close();
    }
}
