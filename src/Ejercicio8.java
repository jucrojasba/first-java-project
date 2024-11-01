import java.util.ArrayList;
import java.util.Scanner;

class Estudiante {
    String nombre;
    double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Promedio: " + promedio;
    }
}

public class Ejercicio8 {
    private ArrayList<Estudiante> estudiantes;
    private Scanner scanner;

    public Ejercicio8() {
        estudiantes = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void gestionarEstudiantes() {
        while (true) {
            System.out.println("\nSistema de Gestión de Estudiantes");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Mostrar Estudiantes");
            System.out.println("3. Buscar Estudiante por Nombre");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    mostrarEstudiantes();
                    break;
                case 3:
                    buscarEstudiante();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema de gestión de estudiantes.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }

    private void agregarEstudiante() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        Estudiante estudiante = new Estudiante(nombre, promedio);
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado: " + estudiante);
    }

    private void mostrarEstudiantes() {
        System.out.println("Lista de Estudiantes:");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }

    private void buscarEstudiante() {
        System.out.print("Ingrese el nombre del estudiante a buscar: ");
        String nombre = scanner.nextLine();

        boolean encontrado = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Estudiante encontrado: " + estudiante);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un estudiante con el nombre: " + nombre);
        }
    }
}
