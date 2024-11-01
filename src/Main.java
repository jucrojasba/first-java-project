import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione el ejercicio a ejecutar:");
            System.out.println("1. Ejercicio 1 - Validación de Usuario Simple");
            System.out.println("2. Ejercicio 2 - Control de Entradas a un Evento");
            System.out.println("3. Ejercicio 3 - Sistema de Gestión de Tareas Pendientes");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    ejercicio1.verificarEdad();
                    break;
                case 2:
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    ejercicio2.gestionarEntradas();
                    break;
                case 3:
                    Ejercicio3 ejercicio3 = new Ejercicio3();
                    ejercicio3.gestionarTareas();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }
}

