package dowhile;

import java.util.Scanner;

public class Ejercicio8 {

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
        
      
        do {
            System.out.println("Introduce el valor del dado en la primera tirada (UNO, DOS, etc): ");
            tirada1 = sc.next();
            
            //El valor del número 1 es el número que se ha introducido en la primera tirada
            num1 = switch (tirada1) {
                case "UNO","uno" -> 1;
                case "DOS", "dos" -> 2;
                case "TRES", "tres" -> 3;
                case "CUATRO","cuatro" -> 4;
                case "CINCO", "cinco" -> 5;
                case "SEIS", "seis" -> 6;
       
                default -> {
                    System.out.println("La primera tirada no es válida. Inténtalo de nuevo.");
      
                    yield 0; 
                }
            };
        // Mientras num1 sea 0, significa que la tirada fue inválida
        } while (num1 == 0); 

        // Se repetirá mientras que num2 sea 0 (el valor de error)
        do {
            System.out.println("Introduce el valor del dado en la segunda tirada (UNO, DOS, etc): ");
            tirada2 = sc.next();
                    
            //El valor del número 2 es el número que se ha introducido en la segunda tirada
            num2 = switch (tirada2) {
                case "UNO","uno" -> 1;
                case "DOS", "dos" -> 2;
                case "TRES", "tres" -> 3;
                case "CUATRO","cuatro" -> 4;
                case "CINCO", "cinco" -> 5;
                case "SEIS", "seis" -> 6;
                //Si el valor es incorrecto, imprimimos error y asignamos 0
                default -> {
                    System.out.println("La segunda tirada no es válida. Inténtalo de nuevo.");
                    yield 0;
                }
            };
        // Mientras num2 sea 0, la tirada fue inválida
        } while (num2 == 0); 


        //Si el programa llega aquí, es porque num1 y num2 son válidos (1-6)
        System.out.println("La suma es: " + (num1 + num2));
        
        //Cierre escáner
        sc.close();
    }

}