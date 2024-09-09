package ejercicios;

public class ejercicio8 {
    /*
       8. Conversión de temperatura
	   Descripción: Dado que la temperatura es c = 25 grados Celsius,
	   conviértela a Fahrenheit usando la fórmula:

	   Variables: c = 25.
     */

        public static void main(String[] args) {
            double celsius = 25;

            double fahrenheit = (celsius * 9/5) + 32;

            System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
        }
    }
}
