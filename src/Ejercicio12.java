import java.util.Scanner;

public class Ejercicio12 {
    private double[] facturas;
    private double total;
    private Scanner scanner;

    public Ejercicio12() {
        facturas = new double[3];
        scanner = new Scanner(System.in);
    }

    public void gestionarPagos() {
        for (int i = 0; i < facturas.length; i++) {
            System.out.print("Ingrese el monto de la factura " + (i + 1) + ": ");
            facturas[i] = scanner.nextDouble();
        }

        total = calcularTotal();
        System.out.printf("El total a pagar es: %.2f\n", total);

        for (int i = 0; i < facturas.length; i++) {
            if (facturas[i] > 0) {
                pagarFactura(i);
            }
        }

        mostrarTotalRestante();
    }

    private double calcularTotal() {
        double suma = 0;
        for (double factura : facturas) {
            suma += factura;
        }
        return suma;
    }

    private void pagarFactura(int index) {
        System.out.printf("Factura %d: %.2f\n", index + 1, facturas[index]);
        System.out.print("¿Desea pagar esta factura? (sí/no): ");
        String respuesta = scanner.next();

        if (respuesta.equalsIgnoreCase("sí")) {
            System.out.printf("Pagando %.2f de la factura %d...\n", facturas[index], index + 1);
            total -= facturas[index];
            facturas[index] = 0;
            System.out.println("Factura pagada con éxito.");
        } else {
            System.out.println("Factura no pagada.");
        }
    }

    private void mostrarTotalRestante() {
        System.out.printf("El total restante a pagar es: %.2f\n", total);
    }
}
