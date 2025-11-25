package while1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
				//Inicio escáner
		        Scanner sc = new Scanner(System.in);
		        
		        //Variable para almacenar la altura del árbol
		        int altura;
		        //Variable para almacenar la altura del árbol más alto
		        int arbolMasAlto = 0; 

		        //Imprime que introduzcamos la altura de los árboles
		        System.out.println("Introduce la altura de los árboles en centímetros (-1 para terminar):");
		        System.out.print("Altura: ");
		        altura = sc.nextInt();

		        // Mientras la altura no sea -1, hacemos lo siguiente
		        while (altura != -1) {
		        	//Condicional if para si la altura es mayor al árbol más grande, este toma su valor
		        	if (altura > arbolMasAlto) {
		                arbolMasAlto = altura; 
		            }
		        	
		        	//Imprimimos que introduzcamos la altura de los árboles
		            System.out.print("Altura: ");
		            altura = sc.nextInt();
		        }
		        
		        //Imprimimos resultado
		        System.out.println("Resultado:");
		        //Condicional if para si el árbol más alto es mayor que 0, imprime la altura más alta
		        if (arbolMasAlto > 0) {
		            System.out.println("La altura del árbol más alto es: " + arbolMasAlto + " cm.");
		        //Condicional else para si no se introduce un número positivo
		        } else {
		            System.out.println("No se introdujeron alturas válidas.");
		        }
		        
		        //Cierre escáner
		        sc.close();
	
	}
	
}
