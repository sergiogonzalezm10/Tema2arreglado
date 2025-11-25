package ifelse;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable para almecenar el valor de "a"
		double a;
		//Variable para almecenar el valor de "b"
		double b;
		//Variable para almecenar el valor de "c"
		double c;
		//Variable para almecenar el valor de "x" ( Operación sin raíz )
		double x;
		//Variable para almecenar el valor del primer resultado de x
		double x1;
		//Variable para almecenar el valor del segundo resultado de x
		double x2;
		//Variable para almecenar el valor del resultado de la raíz
		double raiz;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos el valor de "a"
		System.out.println("Introduce valor a: ");
		a = sc.nextDouble();
		//Imprimimos que introduzcamos el valor de "b"
		System.out.println("Introduce valor b: ");
		b = sc.nextDouble();
		//Imprimimos que introduzcamos el valor de "c"
		System.out.println("Introduce valor c: ");
		c = sc.nextDouble();
		
		//Operación para calcular el valor de la raíz
		raiz = b*b - 4*a*c;
		
		//Condicional if para comprobar si la raíz es mayor que 0
		if (raiz > 0 )  {
		//Operación para calcular el primer valor de x
		x1 = (-b + Math.sqrt(raiz))/ (2 * a);
		//Operación para calcular el segundo valor de x
		x2 = (-b - Math.sqrt(raiz))/ (2 * a);
		System.out.println("Soluciones reales:");
		System.out.println("X = " + x1);
		System.out.println("X = " + x2);
		
		//Condicional else if para comprobar si la raíz es igual que 0
		} else if (raiz == 0) {
		//Operación para calcular el valor de x ( Ecuación con raíz = 0)
        x = -b / (2 * a);
        System.out.println("Hay una única solución real:");
        System.out.println("x = " + x);
        
        //Else para sino se cumplen las anteriores condiciones y por tanto imprimir que la ecuación no tiene solución
		} else {
			System.out.println("La ecuación no tiene soluciones reales.");
		}
		
		//Cierre escáner
		sc.close();
		
	}
	}

