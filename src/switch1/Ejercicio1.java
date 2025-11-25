package switch1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variable para almacenar el valor de la nota
		int nota;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos el valor de la nota
		System.out.println("Introduce la nota: ");
		nota = sc.nextInt();
		
		//Switch para dependiento de la nota introducida imprimirnos Insuficiente,Suficiente,Bien,Notable
		switch (nota) {
		case 0,1,2,3,4 -> {
			System.out.println("Insuficiente");
		}
		case 5 -> {
			System.out.println("Suficiente");
		}
		case 6 -> {
			System.out.println("Bien");
		}
		case 7,8 -> {
			System.out.println("Notable");
		}
		case 9,10 -> {
			System.out.println("Sobresaliente");
		}
		//Si la nota introducia no es un número del 0 al 10, imprimirnos que el número tiene que ser del 0 al 10
		default -> 
		System.out.println("Nota incorrecta ( 0 al 10 )");
	}
		//Cierre escáner
		sc.close();
		
	}
}
