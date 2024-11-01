import java.util.Scanner;

public class Ejercicio9 {
    private String[] empleados;
    private int[] calificaciones;
    private Scanner scanner;

    public Ejercicio9() {
        empleados = new String[5];
        calificaciones = new int[5];
        scanner = new Scanner(System.in);
    }

    public void evaluarEmpleados() {
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            empleados[i] = scanner.nextLine();
        }

        for (int i = 0; i < calificaciones.length; i++) {
            int calificacion;
            do {
                System.out.print("Ingrese la calificación (1-10) para " + empleados[i] + ": ");
                calificacion = scanner.nextInt();
            } while (calificacion < 1 || calificacion > 10);
            calificaciones[i] = calificacion;
        }

        int maxCalificacion = calificaciones[0];
        int minCalificacion = calificaciones[0];
        String empleadoMax = empleados[0];
        String empleadoMin = empleados[0];

        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] > maxCalificacion) {
                maxCalificacion = calificaciones[i];
                empleadoMax = empleados[i];
            }
            if (calificaciones[i] < minCalificacion) {
                minCalificacion = calificaciones[i];
                empleadoMin = empleados[i];
            }
        }

        System.out.println("Empleado con la calificación más alta: " + empleadoMax + " (" + maxCalificacion + ")");
        System.out.println("Empleado con la calificación más baja: " + empleadoMin + " (" + minCalificacion + ")");
    }
}

