package ejercicios;

public class ejercicio10 {

/*  Factorial de un número
*	Descripción: Dado el número a = 6,
*   calcula su factorial.
*   El factorial de un número se obtiene multiplicando
*   todos los números desde 1 hasta el número dado.
*
*	Variables: a = 6.
*/


        public static void main(String[] args) {
            int numero = 6;
            int factorial = 1;


            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}
