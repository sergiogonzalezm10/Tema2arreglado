package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

        int num;

        // Pedir número mayor o igual a 0
        do {
            System.out.print("Introduce un número mayor o igual a 0: ");
            num = sc.nextInt();
        } while (num < 0);

        int original = num;
        int invertido = 0;

        // Usamos un for para invertir el número
        for (int n = num; n > 0; n /= 10) {
            int digito = n % 10;
            invertido = invertido * 10 + digito;
        }

        // Comprobación
        if (original == invertido) {
            System.out.println("El número " + original + " es capicúa.");
        } else {
            System.out.println("El número " + original + " no es capicúa.");
        }

        sc.close();
    }
}

