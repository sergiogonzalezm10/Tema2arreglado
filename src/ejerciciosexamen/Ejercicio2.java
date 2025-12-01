package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        int num;

	        //Pedir número mayor o igual a 0
	        do {
	            System.out.print("Introduce un número entero mayor o igual que 0: ");
	            num = sc.nextInt();
	        } while (num < 0);

	        int n = num;      
	        int pares = 0;
	        int impares = 0;

	       //Contar dígitos pares e impares
	        while (n > 0) {
	            int digito = n % 10; 
	            if (digito % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	            n = n / 10;
	        }

	        System.out.println("El número " + num + " tiene:");
	        System.out.println(pares + " dígitos pares");
	        System.out.println(impares + " dígitos impares");

	        sc.close();
	    }
}

