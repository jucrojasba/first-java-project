import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione el ejercicio a ejecutar:");
            System.out.println("1. Ejercicio 1 - Validación de Usuario Simple");
            System.out.println("2. Ejercicio 2 - Control de Entradas a un Evento");
            System.out.println("3. Ejercicio 3 - Sistema de Gestión de Tareas Pendientes");
            System.out.println("4. Ejercicio 4 - Gestión de Inventario en una Tienda");
            System.out.println("5. Ejercicio 5 - Sistema de Registro de Usuarios");
            System.out.println("6. Ejercicio 6 - Sistema de Reservas de Cine");
            System.out.println("7. Ejercicio 7 - Gestión de Reservas en un Restaurante");
            System.out.println("8. Ejercicio 8 - Sistema de Gestión de Estudiantes");
            System.out.println("9. Ejercicio 9 - Sistema de Evaluación de Empleados");
            System.out.println("10. Ejercicio 10 - Aplicación de Encuestas de Satisfacción");
            System.out.println("11. Ejercicio 11 - Sistema de Inventario de Productos con Cantidades");
            System.out.println("12. Ejercicio 12 - Sistema de Pago para Facturas");
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
                case 4:
                    Ejercicio4 ejercicio4 = new Ejercicio4();
                    ejercicio4.gestionarInventario();
                    break;
                case 5:
                    Ejercicio5 ejercicio5 = new Ejercicio5();
                    ejercicio5.registrarUsuarios();
                    break;
                case 6:
                    Ejercicio6 ejercicio6 = new Ejercicio6();
                    ejercicio6.reservarAsientos();
                    break;
                case 7:
                    Ejercicio7 ejercicio7 = new Ejercicio7();
                    ejercicio7.gestionarReservas();
                    break;
                case 8:
                    Ejercicio8 ejercicio8 = new Ejercicio8();
                    ejercicio8.gestionarEstudiantes();
                    break;
                case 9:
                    Ejercicio9 ejercicio9 = new Ejercicio9();
                    ejercicio9.evaluarEmpleados();
                    break;
                case 10:
                    Ejercicio10 ejercicio10 = new Ejercicio10();
                    ejercicio10.realizarEncuesta();
                    break;
                case 11:
                    Ejercicio11 ejercicio11 = new Ejercicio11();
                    ejercicio11.gestionarInventario();
                    break;
                case 12:
                    Ejercicio12 ejercicio12 = new Ejercicio12();
                    ejercicio12.gestionarPagos();
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
