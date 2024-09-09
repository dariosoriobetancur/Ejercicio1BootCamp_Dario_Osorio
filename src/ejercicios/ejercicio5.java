package ejercicios;

public class ejercicio5 {
    /*  Máximo de tres números
    *	Descripción: Dados
    *   los números a = 5, b = 12 y c = 9,
    *   encuentra cuál de ellos es el mayor.
    *	Variables: a = 5, b = 12, c = 9.
    *
    */


        public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 13;
        int maximo;

        // se encuentra cual es el mayor de los tres
        if (a >= b && a >= c) {
            maximo = a;
        } else if (b >= a && b >= c) {
            maximo = b;
        } else {
            maximo = c;
        }

        System.out.println("El número mayor es: " + maximo);
    }
}