package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	    //Variables para almacenar la hora, minutos, segundos e incremento de segundos que el usuario desea.		
		int hora, minutos, segundos, incremento;
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Introduce la Hora (0-23): ");
		        hora = sc.nextInt();

		        System.out.print("Introduce los Minutos (0-59): ");
		        minutos = sc.nextInt();

		        System.out.print("Introduce los Segundos (0-59): ");
		        segundos = sc.nextInt();

		        System.out.print("Introduce los segundos a incrementar: ");
		        incremento = sc.nextInt();
		        
		        // El bucle se ejecuta tantas veces como segundos queramos sumar
		        for (int i = 0; i < incremento; i++) {
		            segundos++;

		            // Si los segundos llegan a 60, reseteamos y sumamos minuto
		            if (segundos == 60) {
		                segundos = 0;
		                minutos++;

		                // Si los minutos llegan a 60, reseteamos y sumamos hora
		                if (minutos == 60) {
		                    minutos = 0;
		                    hora++;

		                    // Si la hora llega a 24, reseteamos a 0
		                    if (hora == 24) {
		                        hora = 0;
		                    }
		                }
		            }
		        }
		        
		        // %02d asegura que siempre se muestren dos dígitos (ej. 05 en lugar de 5)
		        System.out.printf("Nueva hora: %02d:%02d:%02d%n", hora, minutos, segundos);
		        
		        //Cierre escáner
		        sc.close();
		    }
		}
