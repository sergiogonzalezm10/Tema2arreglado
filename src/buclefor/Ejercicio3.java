package buclefor;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Variable para almacenar el valor del número
		int num;
		//Variable para almacenar la suma de los números
        int suma = 0;
        //Variable para almacenar la media de los números
        double media;
        
        //Inicio escáner
        Scanner sc = new Scanner(System.in);
        
        //Imprimimos que introduzcamos 10 números
        System.out.println("Introduce 10 números:");

        //Bucle for para leer 10 números y calcular la suma
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            num = sc.nextInt();
            suma += num;
        }
		
        //Calculamos la media
        media = suma / 10.0;
        
		//Imprimimos la media
        System.out.println("La media es: " + media);
        
        //Cierre escáner
        sc.close();
    }

}
