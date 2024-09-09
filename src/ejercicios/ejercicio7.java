package ejercicios;

public class ejercicio7 {
/*  Área de un triángulo
*	Descripción: Dadas la
*   base b = 5 y la altura h = 8 de un triángulo,
*   calcula su área usando la fórmula:

*	Variables: b = 5, h = 8.
*/


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar la base del triángulo al usuario
            System.out.print("Ingrese la base del triángulo: ");
            double base = scanner.nextDouble();

            // Solicitar la altura del triángulo al usuario
            System.out.print("Ingrese la altura del triángulo: ");
            double altura = scanner.nextDouble();

            // Calcular el área del triángulo
            double area = calcularArea(base, altura);

            // Mostrar el resultado
            System.out.println("El área del triángulo es: " + area);

            scanner.close();
        }


        public static double calcularArea(double base, double altura) {
            return (base * altura) / 2;
        }
    }

}
