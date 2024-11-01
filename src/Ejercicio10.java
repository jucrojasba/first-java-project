import java.util.Scanner;

public class Ejercicio10 {
    private int[] calificaciones;
    private Scanner scanner;

    public Ejercicio10() {
        calificaciones = new int[10];
        scanner = new Scanner(System.in);
    }

    public void realizarEncuesta() {
        for (int i = 0; i < calificaciones.length; i++) {
            int calificacion;
            do {
                System.out.print("Cliente " + (i + 1) + ", califique su satisfacción (1-5): ");
                calificacion = scanner.nextInt();
            } while (calificacion < 1 || calificacion > 5);
            calificaciones[i] = calificacion;
        }

        double suma = 0;
        int maxCalificaciones = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
            if (calificacion == 5) {
                maxCalificaciones++;
            }
        }
        double promedio = suma / calificaciones.length;

        System.out.printf("Promedio de satisfacción: %.2f%n", promedio);
        System.out.println("Número de clientes que dieron la calificación máxima (5): " + maxCalificaciones);
    }
}
