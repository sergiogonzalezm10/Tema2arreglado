package conditionals3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Variable para almacemar el número
		double num;
		//Varibale para almacenar y calcular el valor absoluto del número
		double valorAbsoluto;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que indiquemos un número
		System.out.println("Introduce un número: ");
		num = sc.nextDouble();
		
		//Operador ternario para si el número es menor a 0 , convertirlo positivo o sino dejarlo igual
		valorAbsoluto = (num < 0)? -num : num;
		
		System.out.println("El valor absoluto es: " + valorAbsoluto);
		
		//Cierre escáner
		 sc.close();
	}

}
