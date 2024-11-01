import java.util.Scanner;

public class Ejercicio20 {
    private String[][] asientos;
    private Scanner scanner;

    public Ejercicio20() {
        asientos = new String[6][6];
        scanner = new Scanner(System.in);
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = "O";
            }
        }
    }

    public void mostrarAsientos() {
        System.out.println("Estado actual de los asientos (O = Disponible, X = Ocupado):");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void reservarAsiento() {
        mostrarAsientos();

        System.out.println("Selecciona el asiento que deseas reservar:");
        System.out.print("Fila (1-6): ");
        int fila = scanner.nextInt() - 1;
        System.out.print("Columna (1-6): ");
        int columna = scanner.nextInt() - 1;

        if (fila < 0 || fila >= 6 || columna < 0 || columna >= 6) {
            System.out.println("Asiento fuera de rango. Inténtalo de nuevo.");
            return;
        }

        if (asientos[fila][columna].equals("X")) {
            System.out.println("El asiento ya está ocupado. Elige otro asiento.");
        } else {
            asientos[fila][columna] = "X";
            System.out.println("Asiento reservado exitosamente.");
        }
        mostrarAsientos();
    }
}
