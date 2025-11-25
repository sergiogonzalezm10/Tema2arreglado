package while1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);

		//Variable para almacenar el valor del número
        int numero;
        //Variable para almacenar la cantidad de números introducidos
        int contador = 0;
        //Variable para almacenar la suma de números positivos
        int sumaPositivos = 0;
        //Variable para almacenar la suma de números negativos
        int sumaNegativos = 0;
        //Variable para almacenar la cantidad de números negativos
        int contadorNegativos = 0;
        //Variable para almacenar la cantidad de ceros
        int contadorCeros = 0;
        //Variable para almacenar la media de números negativos
        double mediaNegativos = 0;
        
        //Imprimimos que introduzcamos 10 números enteros
        System.out.println("Introduce 10 números enteros (positivos, negativos o cero):");
        
        //Bucle while, para si el contador es menor a 10, dejarnos imprimir 10 números enteros
        while (contador < 10) {
            System.out.print("Número " + (contador + 1) + ": ");
            numero = sc.nextInt();
            
            //Condicional if, para si número es mayor a 0, sumar los números positivos introducidos
            if (numero > 0) {
                sumaPositivos += numero;
             //Si el número es menor que 0, sumar los números negativos
            } else if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
             //Sino contar los ceros introducidos
            } else {
                contadorCeros++;
            }
            
            //Sumarle al contador la cantidad de números introducidos
            contador++;
        }
        
        //Si la cantidad de números negativos es mayor a 0, calcular la media de números negativos introducidos
        if (contadorNegativos > 0) {
            mediaNegativos = (double) sumaNegativos / contadorNegativos;
        }
        
        //Imprime resultados
        System.out.println("Resultados:");
        System.out.println("Suma de los números positivos: " + sumaPositivos);
        if (contadorNegativos > 0)
            System.out.println("Media de los números negativos: " + mediaNegativos);
        else
            System.out.println("No se introdujeron números negativos.");
        System.out.println("Cantidad de ceros introducidos: " + contadorCeros);
        
        //Cierre escáner
        sc.close();

	}

}
