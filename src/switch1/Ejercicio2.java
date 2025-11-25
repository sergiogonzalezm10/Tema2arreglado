package switch1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variable para almacenar el día
		int dia;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzca el número del día de la semana
		System.out.println("Introduce el número del día de la semana: ");
		dia = sc.nextInt();
		
		//Switch para dependiendo del número de la semana introducido imprimirnos el nombre del día de la semana en el que estamos
		switch (dia) {
		case 1 -> {
		System.out.println("Lunes");
		}
		case 2 -> {
			System.out.println("Martes");
		}
		case 3 -> {
			System.out.println("Miércoles");
		}
		case 4 -> {
			System.out.println("Jueves");
		}
		
		case 5 -> {
			System.out.println("Viernes");
		}
		case 6 -> {
			System.out.println("Sábado");
		}
		case 7 -> {
			System.out.println("Domingo");
		} 
		
		default ->
			System.out.println("¡La semana solo tiene 7 días!");
		 
		}
		
		//Cierre escáner
		sc.close();
 }
}	
