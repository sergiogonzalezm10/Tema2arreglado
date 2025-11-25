package buclefor;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//variable para almacenar la suma de los números impares
		int suma = 0;
		//variable para almacenar el número impar actual
        int numeroImpar = 1;  

        //Bucle for para sumar los 10 primeros números impares
        for (int i = 1; i <= 10; i++) {
            suma += numeroImpar;
            numeroImpar += 2;  
        }

        //Imprimimos el resultado
        System.out.println("La suma de los 10 primeros números impares es: " + suma);
    }
}
