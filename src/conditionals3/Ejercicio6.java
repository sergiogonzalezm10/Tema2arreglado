package conditionals3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Variable para almecenar el número del mes
		int mes;
		//Variable para almacenar el año
		int año;
		//Boolean para comprobar si el año es bisiesto o no
		boolean bisiesto;
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos que introduzcamos el número del mes
		System.out.println("Introduce el número del mes: ");
		mes = sc.nextInt();
		
		//Imprimimos que introduzcamos el año
		System.out.println("Introduce el año: ");
		año = sc.nextInt();
		
		//Comprobar si el año es bisiesto o no, y devolvernos true o false
		bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
		
		//Condicional if para si bisiesto es true , el año es bisiesto
		if (bisiesto == true) {
			System.out.println("Tu año es bisiesto");
			//Switch para dependiento del número del mes introducio imprimirnos cuantos dias tiene ese mes
			switch (mes) {
			case 1 -> {
				System.out.println("Enero: 31 días");
			} case 2 -> {
				System.out.println("Febrero: 29 días");
			} case 3 -> {
				System.out.println("Marzo: 31 días");
			} case 4 -> {
				System.out.println("Abril: 30 días");
			} case 5 -> {
				System.out.println("Mayo: 31 días");
			} case 6 -> {
				System.out.println("Junio: 30 días");
			} case 7 -> {
				System.out.println("Julio: 31 días");
			} case 8 -> {
				System.out.println("Agosto: 31 días");
			} case 9 -> {
				System.out.println("Septiembre: 30 días");
			} case 10 -> {
				System.out.println("Octubre: 31 días");
			} case 11 -> {
				System.out.println("Noviembre: 30 días");
			} case 12 -> {
				System.out.println("Diciembre: 31 días");
			} default -> {
				System.out.println("¡El año tiene 12 meses!");
						 }
			}
		
		//Condicional else para si el año no es bisiesto hacer lo siguiente
		} else { 
			System.out.println("Tu año no es bisiesto");
			
			switch (mes) {	
			case 1 -> {
				System.out.println("Enero: 31 días");
			} case 2 -> {
				System.out.println("Febrero: 28 días");
			} case 3 -> {
				System.out.println("Marzo: 31 días");
			} case 4 -> {
				System.out.println("Abril: 30 días");
			} case 5 -> {
				System.out.println("Mayo: 31 días");
			} case 6 -> {
				System.out.println("Junio: 30 días");
			} case 7 -> {
				System.out.println("Julio: 31 días");
			} case 8 -> {
				System.out.println("Agosto: 31 días");
			} case 9 -> {
				System.out.println("Septiembre: 30 días");
			} case 10 -> {
				System.out.println("Octubre: 31 días");
			} case 11 -> {
				System.out.println("Noviembre: 30 días");
			} case 12 -> {
				System.out.println("Diciembre: 31 días");
			} default -> {
				System.out.println("¡El año tiene 12 meses!");
						 }
			}
	}
		//Cierre escáner
		sc.close();
	}
}

