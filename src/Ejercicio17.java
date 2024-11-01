import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio17 {
    private String[] proyectos;
    private double[] calificaciones;
    private Scanner scanner;

    public Ejercicio17() {
        proyectos = new String[5];
        calificaciones = new double[5];
        scanner = new Scanner(System.in);
    }

    public void evaluarProyectos() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del proyecto " + (i + 1) + ": ");
            proyectos[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la calificación para el proyecto '" + proyectos[i] + "' (0 a 10): ");
            calificaciones[i] = scanner.nextDouble();
        }

        mostrarProyectosOrdenados();
    }

    private void mostrarProyectosOrdenados() {
        Integer[] indices = new Integer[5];
        for (int i = 0; i < 5; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, Comparator.comparingDouble(i -> calificaciones[i]));

        System.out.println("\nProyectos ordenados por calificación (del más alto al más bajo):");
        for (int i = 4; i >= 0; i--) {
            int index = indices[i];
            System.out.println("Proyecto: " + proyectos[index] + " | Calificación: " + calificaciones[index]);
        }
    }
}
