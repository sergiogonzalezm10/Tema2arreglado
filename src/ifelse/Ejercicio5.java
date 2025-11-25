package ifelse;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Constante para almacenar la palabra PIEDRA 
		final String PIEDRA = "PIEDRA";
		//Constante para almacenar la palabra PAPEL 
		final String PAPEL = "PAPEL";
		//Constante para almacenar la palabra TIJERA 
		final String TIJERA = "TIJERA";
		
		//Variable para almacenar lo introducido en la primera jugada
		String jugada1;
		//Variable para almacenar lo introducido en la segunda jugada
		String jugada2;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos la primera jugada
		System.out.println("Movimiento jugador1 (PIEDRA , PAPEL O TIJERA): ");
		jugada1 = sc.next();
		//Imprimimos que introduzcamos la segunda jugada
		System.out.println("Movimiento jugador2 (PIEDRA , PAPEL O TIJERA): ");
		jugada2 = sc.next();
		
		//Condicional if para comprobar si el usuario ha introducido en la primera jugada algo que no sea PIEDRA , PAPEL O TIJERA
		if (!jugada1.equals(PIEDRA) && !jugada1.equals(PAPEL) && !jugada1.equals(TIJERA)) {
		System.out.println("Solo puedes utilizar PIEDRA , PAPEL O TIJERA");
		
		//Condicional else if para comprobar si el usuario ha introducido en la segunda jugada algo que no sea PIEDRA , PAPEL O TIJERA
		} else if (!jugada2.equals(PIEDRA) && !jugada2.equals(PAPEL) && !jugada2.equals(TIJERA)) {
		System.out.println("Solo puedes utilizar PIEDRA , PAPEL O TIJERA");
		
		//Condicional else if para comprobar si es empate
		} else if (jugada1.equals(jugada2)) { 
		System.out.println("Empate : " + jugada1 + " Y " + jugada2);
		
		//Condicional else if para comprobar si gana el jugador 1
		} else if (jugada1.equals(PIEDRA) && jugada2.equals(TIJERA)	|| jugada1.equals(PAPEL) && jugada2.equals(PIEDRA)|| jugada1.equals(TIJERA) && jugada2.equals(PAPEL)) {
		System.out.println("Gana el jugador 1");
		//Condicional else if por si no se cumple lo anterior gana el jugador 2
		} else {
		System.out.println("Gana el jugador 2");
		}
	
		//Cierre escáner
		sc.close();
	
	
	
	}
}
