package ejercicios;

public class ejercicio6 {

    /*
        6. Promedio de tres números
    	Descripción: Dados los
    	números a = 4, b = 9 y c = 13,
    	calcula el promedio de los tres.

	    Variables: a = 4, b = 9, c = 13.
    */

        public static void main(String[] args) {
            int a = 4;
            int b = 9;
            int c = 11;

            // se suma los tres números.

            float promedio = (a + b + c)/3 ;

            System.out.println("El promedio de " + a + ", " + b +", " + c + " es: " + promedio);
        }
}

