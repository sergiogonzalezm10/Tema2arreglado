package switch1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable para almacenar el primer número
		double num1;
		//Variable para almacenar el segundo número
		double num2;
		//Variable tipo string para almacenar la elección
		String eleccion;
		//Variable para almacenar el valor de la suma
		double suma;
		//Variable para almacenar el valor de la resta
		double resta;
		//Variable para almacenar el valor de la multiplicación
		double mult;
		//Variable para almacenar el valor de la división
		double div;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in); 
		
		//Imprimimos que introduzcamos el valor del primer número
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextDouble();
		//Imprimimos que introduzcamos el valor del segundo número
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextDouble();
		
		//Imprimimos que introduzcamos una de las siguientes opciones
		System.out.println("Selecciona una opcion: ");
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		eleccion = sc.next();
		
		//Switch para dependiendo la elección escogida hacer la operación correspondiente
		switch (eleccion) {
		case "A" , "a" -> {
		suma = num1 + num2; 
		System.out.println("La suma es: " + suma);
		}
		case "B","b" -> {
			resta = num1 - num2;
			System.out.println("La resta es: " + resta);
		}
		case "C","c" -> {
			mult = num1 * num2;
			System.out.println("La multiplicación es: " + mult);
		}
		case "D","d" -> {
			if (num2!=0) {
			div = num1 / num2;
			System.out.println("La división es: " + div);
			} else {
				System.out.println("No se puede dividir entre 0");
			}
		}
		//Si se introduce una elección que no se encuentra en el programa, imprimimos que la elección es incorrecta
		default ->
		System.out.println("Elección incorrecta");
		
		}
		//Cierre escáner
		sc.close();
	}
}
