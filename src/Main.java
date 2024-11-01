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
            System.out.println("13. Ejercicio 13 - Sistema de Votación Electrónica");
            System.out.println("14. Ejercicio 14 - Gestión de Empleados con Búsqueda");
            System.out.println("15. Ejercicio 15 - Sistema de Reservas para un Hotel");
            System.out.println("16. Ejercicio 16 - Control de Gastos Mensuales");
            System.out.println("17. Ejercicio 17 - Sistema de Evaluación de Proyectos");
            System.out.println("18. Ejercicio 18 - Sistema de Gestión de Vehículos");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                // Otras opciones
                case 18:
                    Ejercicio18 ejercicio18 = new Ejercicio18();
                    ejercicio18.gestionarVehiculos();
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
