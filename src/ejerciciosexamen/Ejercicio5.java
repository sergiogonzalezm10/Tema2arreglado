package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio5 {

		public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        
        // 1. Pedimos el tamaño del escaque (casilla)
        System.out.print("Introduce el tamaño del escaque: ");
        int tamano = sc.nextInt();
        
        // El tablero de ajedrez estándar tiene 8 filas y 8 columnas de casillas.
        
        // BUCLE PRINCIPAL: Recorre las 8 FILAS de casillas del tablero
        for (int filaTablero = 0; filaTablero < 8; filaTablero++) {
            
            // BUCLE DE ALTURA: Cada fila de casillas tiene 'tamano' líneas de alto
            for (int linea = 0; linea < tamano; linea++) {
                
                // BUCLE DE COLUMNAS: Recorre las 8 COLUMNAS de casillas en esa línea
                for (int colTablero = 0; colTablero < 8; colTablero++) {
                    
                    // Lógica para decidir el color:
                    // Si sumamos la posición de la fila y la columna:
                    // - Si es PAR (0, 2, 4...) -> Toca casilla oscura (#)
                    // - Si es IMPAR (1, 3, 5...) -> Toca casilla clara (espacio)
                    // Esto crea el efecto alternado automáticamente.
                    
                    // BUCLE DE ANCHURA: Imprime el contenido de UNA casilla
                    for (int i = 0; i < tamano; i++) {
                        
                        if ((filaTablero + colTablero) % 2 == 0) {
                            System.out.print("#"); // Casilla oscura
                        } else {
                            System.out.print(" "); // Casilla clara (espacios)
                        }
                    }
                }
                
                // Al terminar de pintar una línea horizontal completa, hacemos un salto de línea
                System.out.println(); 
            }
        }
        
        sc.close();
    }
}