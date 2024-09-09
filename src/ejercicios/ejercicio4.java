package ejercicios;

 public class ejercicio4 {

    /*4. Números primos
*	Descripción: Dado el número a = 29,
*   determina si es primo.
*   Un número primo solo tiene
*   dos divisores: 1 y él mismo.
•	Variables: a = 29.
*/

        public static void main(String[] args) {
            int a = 30;
            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            //resultado.
            if (esPrimo) {
                System.out.println(a + " es un número primo.");
            } else {
                System.out.println(a + " no es un número primo.");
            }
        }
    }
