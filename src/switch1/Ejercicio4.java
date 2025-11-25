package switch1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Inicio escáner
		Scanner sc = new Scanner(System.in);
		
		//Variable tipo String para almacenar la primera tirada
		String tirada1;
		//Variable tipo String para almacenar la segunda tirada
		String tirada2;
		//Variable para almacenar el primer valor del dado
		int num1;	
		//Variable para almacenar el segundo valor del dado
		int num2;
		
		//Imprimimos que introduzcamos el valor del dado en la primera tirada
		System.out.println("Introduce el valor del dado en la primera tirada(UNO, DOS, etc): ");
		tirada1 = sc.next();
		//Imprimimos que introduzcamos el valor del dado en la segunda tirada
		System.out.println("Introduce el valor del dado en la segunda tirada (UNO, DOS, etc): ");
		tirada2 = sc.next();
				
		//El valor del número 1 es el número que se ha introducido en la primera tirada ( en letras , convertido en número con yield ) ,se realiza esto mediante un Switch		
		num1 = switch (tirada1) {
		case "UNO","uno" -> {
			yield 1;
		}
		case "DOS", "dos" -> {
			yield 2;
		}
		case "TRES", "tres" -> {
			yield 3;
		}
		case "CUATRO","cuatro" -> {
			yield 4;
		}
		case "CINCO", "cinco" -> {
			yield 5;
		}
		case "SEIS", "seis" -> {
			yield 6;
		}
		//Si el valor introducido en la primera tirada no es un número del 1 al 6, imprimimos que la primera tirada no es válida
		default -> {
			System.out.println("La primera tirada no es válida");
				yield 0;
		}
				};
				
				//El valor del número 2 es el número que se ha introducido en la segunda tirada ( en letras , convertido en número con yield ) ,se realiza esto mediante un Switch
				num2 = switch (tirada2) {
				case "UNO","uno" -> {
					yield 1;
				}
				case "DOS", "dos" -> {
					yield 2;
				}
				case "TRES", "tres" -> {
					yield 3;
				}
				case "CUATRO","cuatro" -> {
					yield 4;
				}
				case "CINCO", "cinco" -> {
					yield 5;
				}
				case "SEIS", "seis" -> {
					yield 6;
				}
				//Si el valor introducido en la segunda tirada no es un número del 1 al 6, imprimimos que la segunda tirada no es válida
				default -> {
					System.out.println("La segunda tirada no es válida");
					yield 0;
				}
				};

				//Imprimimos la suma de los dos números
				System.out.println("La suma es: "+(num1+num2));
				
				//Cierre escáner
				sc.close();
			}

		}
