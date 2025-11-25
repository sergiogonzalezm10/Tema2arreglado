package while1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
			
				//Imprimimos el escáner
				Scanner sc = new Scanner(System.in);
				
				//Variable para almacenar la edad
		        int edad;
		        //Variable para almacenar suma de las edades
		        int sumaEdades = 0;
		        //Variable para almacenar la cantidad de alumnos
		        int contadorAlumnos = 0;
		        //Variable para almacenar la cantidad de alumnos mayores
		        int mayoresEdad = 0;
		        //Variable para almacenar la media de edades
		        double media;
		        
		        //Imprimimos que introduzcamos las edades
		        System.out.println("Introduce las edades de los alumnos (número negativo para terminar):");
		        
		        System.out.print("Edad: ");
		        edad = sc.nextInt();

		        //Bucle Whil, mientras la edad no sea negativa, sumar las edades y contar los alumnos mayores de edad
		        while (edad >= 0) {
		            sumaEdades += edad;
		            contadorAlumnos++;

		            if (edad >= 18) {
		                mayoresEdad++;
		            }

		            System.out.print("Edad: ");
		            edad = sc.nextInt();
		        }
		        
		        //Imprimimos resultados
		        System.out.println("Resultados:");
		        
		        //Condicional if, si la cantidad de alumnos es mayor a 0, imprimimos resultados
		        if (contadorAlumnos > 0) {
		            media = sumaEdades / contadorAlumnos;
		        
		            System.out.println("Suma total de edades: " + sumaEdades);
		            System.out.println("Número de alumnos: " + contadorAlumnos);
		            System.out.println("Media de edades: " + media);
		            System.out.println("Número de mayores de edad: " + mayoresEdad);
		        } else {
		            System.out.println("No se introdujeron edades válidas.");
		        }
		        
		        //Cierre escáner
		        sc.close();
		    }
		}
