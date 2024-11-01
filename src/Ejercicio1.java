import java.util.Scanner;

public class Ejercicio1 {
    public void verificarEdad() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
