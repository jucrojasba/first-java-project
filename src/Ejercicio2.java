import java.util.Scanner;

public class Ejercicio2 {
    private static final int MAX_ASISTENTES = 100;
    private int entradasDisponibles = MAX_ASISTENTES;

    public void gestionarEntradas() {
        Scanner scanner = new Scanner(System.in);

        while (entradasDisponibles > 0) {
            System.out.println("EntrSadas disponibles: " + entradasDisponibles);
            System.out.print("¿Deseas reservar una entrada? (si/no) o escribe 'menu' para volver al menú principal: ");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("si")) {
                entradasDisponibles--;
                System.out.println("¡Entrada reservada! Entradas restantes: " + entradasDisponibles);
            } else if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("Reserva cancelada. Entradas restantes: " + entradasDisponibles);
            } else if (respuesta.equalsIgnoreCase("menu")) {
                System.out.println("Volviendo al menú principal...");
                return;
            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        System.out.println("El evento está lleno. No hay más entradas disponibles.");
        System.out.println("Volviendo al menú principal...");
    }
}
