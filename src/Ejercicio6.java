import java.util.Scanner;

public class Ejercicio6 {
    private char[][] asientos = new char[5][5];
    private Scanner scanner = new Scanner(System.in);

    public Ejercicio6() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                asientos[i][j] = 'O';
            }
        }
    }

    public void reservarAsientos() {
        while (true) {
            mostrarAsientos();
            System.out.println("Seleccione una fila (0-4) y una columna (0-4) para reservar un asiento.");
            System.out.print("Fila: ");
            int fila = scanner.nextInt();
            System.out.print("Columna: ");
            int columna = scanner.nextInt();


            if (fila < 0 || fila >= 5 || columna < 0 || columna >= 5) {
                System.out.println("Selección inválida. Por favor, elige una fila y columna entre 0 y 4.");
                continue;
            }

            if (asientos[fila][columna] == 'X') {
                System.out.println("Este asiento ya está ocupado. Por favor, elige otro.");
            } else {
                // Reservar el asiento
                asientos[fila][columna] = 'X';
                System.out.println("Asiento reservado con éxito.");
            }
        }
    }

    private void mostrarAsientos() {
        System.out.println("Disposición de asientos:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
