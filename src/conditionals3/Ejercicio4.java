package conditionals3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Iniciamos Random número
		Random rd = new Random();
        
		//Variable para almacenar el primer número
        int num1 = rd.nextInt(1,100);
        
        // Variable para almacenar el segundo número
        int num2 = rd.nextInt(1,100);
        
        //Variable para almacenar la suma de los números
        int suma = num1 + num2;
        
        //Variable para almacenar la suma introducida por el usuario
        int sumUsuario;
        
        // Inicio escáner
        Scanner sc = new Scanner(System.in);
        
        //Imprimimos que introduzcamos los números
        System.out.println("Número 1 : " + num1);
        System.out.println("Número 2 : " + num2);
        System.out.println("¿Cuánto es la suma de ambos números?");
        sumUsuario = sc.nextInt();
        
        // Condicional if para comparar la suma de los números real con la introducida por el usuario
        if (sumUsuario == suma) {
            System.out.println("Correcto!!!");
        } else {
            System.out.println("NOOO, la suma es: "+ suma);
        }
        
        // Cierre escáner
        sc.close();
	}
}