import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    private ArrayList<String> reservas;
    private Scanner scanner;

    public Ejercicio7() {
        reservas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void gestionarReservas() {
        while (true) {
            System.out.println("\nGestión de Reservas en el Restaurante");
            System.out.println("1. Agregar Reserva");
            System.out.println("2. Cancelar Reserva");
            System.out.println("3. Mostrar Reservas Confirmadas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarReserva();
                    break;
                case 2:
                    cancelarReserva();
                    break;
                case 3:
                    mostrarReservas();
                    break;
                case 0:
                    System.out.println("Saliendo de la gestión de reservas.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }

    private void agregarReserva() {
        System.out.print("Ingrese el nombre del cliente para la reserva: ");
        String nombre = scanner.nextLine();
        reservas.add(nombre);
        System.out.println("Reserva agregada para " + nombre + ".");
    }

    private void cancelarReserva() {
        System.out.print("Ingrese el nombre del cliente para cancelar la reserva: ");
        String nombre = scanner.nextLine();

        if (reservas.remove(nombre)) {
            System.out.println("Reserva cancelada para " + nombre + ".");
        } else {
            System.out.println("No se encontró una reserva para " + nombre + ".");
        }
    }

    private void mostrarReservas() {
        System.out.println("Reservas Confirmadas:");
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas confirmadas.");
        } else {
            for (String reserva : reservas) {
                System.out.println("- " + reserva);
            }
        }
    }
}
