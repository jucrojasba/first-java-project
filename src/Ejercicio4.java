import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    private ArrayList<String> inventario = new ArrayList<>();

    public void gestionarInventario() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar un nuevo producto");
            System.out.println("2. Eliminar un producto (agotado)");
            System.out.println("3. Ver inventario completo");
            System.out.println("0. Volver al menú principal");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto(scanner);
                    break;
                case 2:
                    eliminarProducto(scanner);
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }

    private void agregarProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del nuevo producto: ");
        String producto = scanner.nextLine();
        inventario.add(producto);
        System.out.println("Producto agregado al inventario.");
    }

    private void eliminarProducto(Scanner scanner) {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío. No hay productos para eliminar.");
            return;
        }

        mostrarInventario();
        System.out.print("Ingrese el número del producto a eliminar: ");
        int numeroProducto = scanner.nextInt();

        if (numeroProducto >= 1 && numeroProducto <= inventario.size()) {
            inventario.remove(numeroProducto - 1);
            System.out.println("Producto eliminado del inventario.");
        } else {
            System.out.println("Número de producto no válido.");
        }
    }

    private void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de productos:");
            for (int i = 0; i < inventario.size(); i++) {
                System.out.println((i + 1) + ". " + inventario.get(i));
            }
        }
    }
}

