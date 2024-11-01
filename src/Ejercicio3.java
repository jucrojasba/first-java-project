import java.util.Scanner;

public class Ejercicio3 {
    private static final int MAX_TAREAS = 10;
    private String[] tareas = new String[MAX_TAREAS];
    private boolean[] completadas = new boolean[MAX_TAREAS];
    private int totalTareas = 0;

    public void gestionarTareas() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Ver lista de tareas");
            System.out.println("0. Volver al menú principal");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarTarea(scanner);
                    break;
                case 2:
                    marcarTareaComoCompletada(scanner);
                    break;
                case 3:
                    mostrarListaDeTareas();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }

    private void agregarTarea(Scanner scanner) {
        if (totalTareas < MAX_TAREAS) {
            System.out.print("Ingrese la nueva tarea: ");
            String tarea = scanner.nextLine();
            tareas[totalTareas] = tarea;
            completadas[totalTareas] = false;
            totalTareas++;
            System.out.println("Tarea agregada correctamente.");
        } else {
            System.out.println("La lista de tareas está llena. No puedes agregar más tareas.");
        }
    }

    private void marcarTareaComoCompletada(Scanner scanner) {
        if (totalTareas == 0) {
            System.out.println("No hay tareas en la lista.");
            return;
        }

        mostrarListaDeTareas();
        System.out.print("Ingrese el número de la tarea a marcar como completada: ");
        int numeroTarea = scanner.nextInt();

        if (numeroTarea >= 1 && numeroTarea <= totalTareas) {
            completadas[numeroTarea - 1] = true;
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Número de tarea no válido.");
        }
    }

    private void mostrarListaDeTareas() {
        if (totalTareas == 0) {
            System.out.println("No hay tareas en la lista.");
        } else {
            System.out.println("Lista de tareas:");
            for (int i = 0; i < totalTareas; i++) {
                String estado = completadas[i] ? "Completada" : "Pendiente";
                System.out.println((i + 1) + ". " + tareas[i] + " - " + estado);
            }
        }
    }
}
