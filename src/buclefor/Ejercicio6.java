package buclefor;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

        // Variable para almacenar la nota
        int nota;
        // Variable para contar los suspensos
        int suspensos = 0;

        //Inicio escáner
        Scanner sc = new Scanner(System.in);
        
        // Bucle for para leer 5 notas
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la nota " + i + ": ");
			nota = sc.nextInt();
			// Comprobamos si la nota es un suspenso
            if (nota < 5) {
                suspensos++;
            }
        }
		// Imprimimos el número de suspensos
        System.out.println("Número de suspensos: " + suspensos);
        
        // Cierre escáner
        sc.close();
    }
}
