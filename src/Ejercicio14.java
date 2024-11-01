import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {
    private ArrayList<Empleado> empleados;
    private Scanner scanner;

    public Ejercicio14() {
        empleados = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void gestionarEmpleados() {
        while (true) {
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Buscar Empleado");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    buscarEmpleado();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }

    private void agregarEmpleado() {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el puesto del empleado: ");
        String puesto = scanner.nextLine();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        Empleado nuevoEmpleado = new Empleado(nombre, puesto, salario);
        empleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado exitosamente.");
    }

    private void buscarEmpleado() {
        System.out.print("Ingrese el nombre o puesto del empleado a buscar: ");
        String criterio = scanner.nextLine();
        boolean encontrado = false;

        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(criterio) || empleado.getPuesto().equalsIgnoreCase(criterio)) {
                System.out.println(empleado);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Empleado no encontrado.");
        }
    }
}
