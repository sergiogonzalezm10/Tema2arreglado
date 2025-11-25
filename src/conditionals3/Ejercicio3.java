package conditionals3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {	
		
		// Inicio escáner
        Scanner sc = new Scanner(System.in);
        
        // Variable para almacenar el número del dni
        int numero;
        
        // Variable para almacenar la letra del dni
        String letra = null;
        
        // Variable para almacenar la longitud del número
        int longitud;
        
        // Variable para almacenar el módulo del DNI
        int moduloDni;
        
        // Imprimimos que pida al usuario que introduzca los números de su DNI
        System.out.println("Introduce una combinación de 8 digitos del DNI ");
        numero = sc.nextInt();
        
        // Vemos la longitud del número
        longitud = String.valueOf(numero).length();
        
        //Condicional if para comprobar si la longitud del número es distinto a 8 e imprimir que tiene que tener 8 cifras si no.
        if ( longitud != 8) {
           System.out.println("El número debe de ser de 8 cifras");
         
        //Condicional else para sino se cumple lo anterior calcular la letra del DNI
        } else {
            
            moduloDni = numero %23;
            
            //Switch para dependiendo del valor del número del DNI por el módulo de 23, darnos la letra correspondiente del número
            letra = switch (numero % 23) {
            case 0 ->{ 
                yield "T";
            }
            case 1 ->{ 
                yield "R";
            }
            case 2 ->{ 
                yield "W";
            }
            case 3 ->{ 
                yield "A";
            }
            case 4 ->{ 
                yield "G";
            }
            case 5 ->{ 
                yield "M";
            }
            case 6 ->{ 
                yield "Y";
            }
            case 7 ->{ 
                yield "F";
            }
            case 8 ->{ 
                yield "P";
            }
            case 9 ->{ 
                yield "D";
            }
            case 10 ->{ 
                yield "X";
            }
            case 11->{ 
                yield "B";
            }
            case 12 ->{ 
                yield "N";
            }
            case 13 ->{ 
                yield "J";
            }
            case 14 ->{ 
                yield "Z";
            }
            case 15 ->{ 
                yield "S";
            }
            case 16 ->{ 
                yield "Q";
            }
            case 17 ->{ 
                yield "V";
            }
            case 18 ->{ 
                yield "H";
            }
            case 19 ->{ 
                yield "L";
            }
            case 20 ->{ 
                yield "C";
            }
            case 21 ->{ 
                yield "K";
            }
            default ->{
                yield "E";
            }
            };    
        }
        
        // Imprimimos el DNI con la letra correspondiente
        System.out.println(numero + letra);

        // Cierre escáner
        sc.close();
	}
}
