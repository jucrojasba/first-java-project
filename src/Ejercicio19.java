import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio19 {
    private ArrayList<String> productos = new ArrayList<>();
    private ArrayList<Double> precios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void gestionarInventario() {
        System.out.println("Bienvenido al sistema de control de inventario con precios.");

        while (true) {
            System.out.println("1. Agregar producto y precio");
            System.out.println("2. Mostrar inventario");
            System.out.println("0. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    mostrarInventario();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema de control de inventario.");
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    private void agregarProducto() {
        System.out.print("Ingresa el nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        System.out.print("Ingresa el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea

        productos.add(nombreProducto);
        precios.add(precioProducto);
        System.out.println("Producto agregado correctamente.");
    }

    private void mostrarInventario() {
        System.out.println("Inventario de productos y precios:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println("Producto: " + productos.get(i) + " - Precio: $" + precios.get(i));
        }
    }
}
