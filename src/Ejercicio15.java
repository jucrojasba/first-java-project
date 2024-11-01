import java.util.Scanner;

public class Ejercicio15 {
    private char[][] habitaciones;
    private Scanner scanner;

    public Ejercicio15() {
        habitaciones = new char[4][4];
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                habitaciones[i][j] = 'O'; // O para disponible
            }
        }
        scanner = new Scanner(System.in);
    }

    public void gestionarReservas() {
        while (true) {
            mostrarHabitaciones();
            System.out.print("Seleccione la fila (0-3) de la habitación que desea reservar (o -1 para salir): ");
            int fila = scanner.nextInt();

            if (fila == -1) {
                System.out.println("Saliendo...");
                return;
            }

            System.out.print("Seleccione la columna (0-3) de la habitación que desea reservar: ");
            int columna = scanner.nextInt();

            if (fila < 0 || fila >= 4 || columna < 0 || columna >= 4) {
                System.out.println("Selección no válida. Intente de nuevo.");
                continue;
            }


            if (habitaciones[fila][columna] == 'O') {
                habitaciones[fila][columna] = 'X'; // X para ocupado
                System.out.println("Habitación reservada exitosamente.");
            } else {
                System.out.println("La habitación ya está ocupada. Por favor, seleccione otra.");
            }
        }
    }

    private void mostrarHabitaciones() {
        System.out.println("Estado de las habitaciones:");
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                System.out.print(habitaciones[i][j] + " ");
            }
            System.out.println();
        }
    }
}
