import java.util.Scanner;

public class Ejercicio11 {
    private String[] productos;
    private int[] cantidades;
    private int contador;
    private static final int MAX_PRODUCTOS = 10;
    private Scanner scanner;

    public Ejercicio11() {
        productos = new String[MAX_PRODUCTOS];
        cantidades = new int[MAX_PRODUCTOS];
        contador = 0;
        scanner = new Scanner(System.in);
    }

    public void gestionarInventario() {
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Actualizar cantidad de un producto");
            System.out.println("3. Mostrar inventario");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    actualizarCantidad();
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema de inventario...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private void agregarProducto() {
        if (contador < MAX_PRODUCTOS) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la cantidad en stock: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            productos[contador] = nombre;
            cantidades[contador] = cantidad;
            contador++;
            System.out.println("Producto agregado exitosamente.");
        } else {
            System.out.println("No se pueden agregar más productos, el inventario está lleno.");
        }
    }

    private void actualizarCantidad() {
        System.out.print("Ingrese el nombre del producto a actualizar: ");
        String nombre = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (productos[i].equalsIgnoreCase(nombre)) {
                System.out.print("Ingrese la nueva cantidad: ");
                cantidades[i] = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Cantidad actualizada exitosamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    private void mostrarInventario() {
        System.out.println("Inventario de productos:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Producto: " + productos[i] + ", Cantidad en stock: " + cantidades[i]);
        }
    }
}
