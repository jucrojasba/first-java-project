import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio5 {
    private ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();

    public void registrarUsuarios() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Registrar un nuevo usuario");
            System.out.println("2. Mostrar lista de usuarios registrados");
            System.out.println("0. Volver al menú principal");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarNuevoUsuario(scanner);
                    break;
                case 2:
                    mostrarUsuariosRegistrados();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }

    private void registrarNuevoUsuario(Scanner scanner) {
        System.out.print("Ingrese el nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Ingrese el correo electrónico: ");
        String correo = scanner.nextLine();

        String contraseña;
        while (true) {
            System.out.print("Ingrese la contraseña: ");
            contraseña = scanner.nextLine();

            if (validarContraseña(contraseña)) {
                break;
            } else {
                System.out.println("La contraseña debe tener al menos 8 caracteres, una letra mayúscula y un número.");
            }
        }

        usuariosRegistrados.add(new Usuario(nombreUsuario, contraseña, correo));
        System.out.println("Usuario registrado con éxito.");
    }

    private boolean validarContraseña(String contraseña) {
        return contraseña.length() >= 8 &&
                Pattern.compile("[A-Z]").matcher(contraseña).find() &&
                Pattern.compile("[0-9]").matcher(contraseña).find();
    }

    private void mostrarUsuariosRegistrados() {
        if (usuariosRegistrados.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Lista de usuarios registrados:");
            for (Usuario usuario : usuariosRegistrados) {
                System.out.println("Usuario: " + usuario.getNombreUsuario() + ", Correo: " + usuario.getCorreo());
            }
        }
    }


    private static class Usuario {
        private String nombreUsuario;
        private String contraseña;
        private String correo;

        public Usuario(String nombreUsuario, String contraseña, String correo) {
            this.nombreUsuario = nombreUsuario;
            this.contraseña = contraseña;
            this.correo = correo;
        }

        public String getNombreUsuario() {
            return nombreUsuario;
        }

        public String getCorreo() {
            return correo;
        }
    }
}
