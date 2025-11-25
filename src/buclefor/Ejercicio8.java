package buclefor;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		        
				//Variables para almacenar el valor de A
		        int A;
		        
		        //Variables para almacenar el valor de B
		        int B;
		        
		        //Inicio escáner
		        Scanner sc = new Scanner(System.in);
		        
		        //Pedimos el número A
		        System.out.print("Introduce el número A: ");
		        A = sc.nextInt();

		        //Pedimos el número B
		        System.out.print("Introduce el número B: ");
		        B = sc.nextInt();

		        // Si A es menor que B 
		        if (A < B) {
		            for (int i = A; i <= B; i++) {
		                System.out.println(i);
		            }
		        }
		        // Si B es menor que A
		        else if (B < A) {
		            for (int i = B; i <= A; i++) {
		                System.out.println(i);
		            }
		        }
		        // Si son iguales
		        else {
		            System.out.println("A y B son iguales: " + A);
		        }
		        
		        //Cierre escáner
		        sc.close();
		    }
	
}
