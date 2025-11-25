package dowhile;

import java.util.Scanner;

public class Ejercicio5 {
	
	 public static void main(String[] args) {
		 	
		 	//Variable para almacenar el valor del número mínimo
	        int minimo = 1;
	        //Variable para almacenar el valor del número máximo
	        int maximo = 100;
	        //Variable para almacenar el valor del intento
	        int intento;
	        //Variable tipo String para almacenar la respuesta
	        String respuesta;
	        
	        //Inicio escáner
	        Scanner sc = new Scanner(System.in);
	        
	        //Imprimimos que pensemos un número y que el ordenador intentará adivinarlo
	        System.out.println("Piensa un número entre 1 y 100");
	        System.out.println("El ordenador intentará adivinarlo");
	     
	        /* Bucle do para mientras la respuesta no sea igual a "igual",
	           darnos números aleatorio y preguntarnos si es mayor,
	           menor o igual a nuestro número */
	        do {
	          
	            intento = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
	            System.out.println("¿Es " + intento + " tu número?");
	            System.out.print("Escribe (mayor/menor/igual): ");
	            respuesta = sc.next().toLowerCase();

	            if (respuesta.equals("mayor")) {
	                minimo = intento + 1;          
	            } else if (respuesta.equals("menor")) {
	                maximo = intento - 1; 
	            } else if (!respuesta.equals("igual")) {
	                System.out.println("Por favor, responde solo con 'mayor', 'menor' o 'igual'.");
	            }

	        } while (!respuesta.equals("igual"));
	        
	        //Imprimimos que la máquina ha acertado el número
	        System.out.println("¡HAS ACERTADO! El número era " + intento + ".");
	        
	        //Cierre escáner
	        sc.close();
	    }
}
