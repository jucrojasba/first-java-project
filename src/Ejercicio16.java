import java.util.Scanner;

public class Ejercicio16 {
    private double[] gastosMensuales;
    private Scanner scanner;

    public Ejercicio16() {
        gastosMensuales = new double[12];
        scanner = new Scanner(System.in);
    }

    public void registrarGastos() {
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese el gasto para el mes " + (i + 1) + ": ");
            gastosMensuales[i] = scanner.nextDouble();
        }

        double totalGastos = calcularTotal();
        double promedioGastos = calcularPromedio(totalGastos);

        System.out.println("El gasto total del año es: " + totalGastos);
        System.out.println("El gasto promedio mensual es: " + promedioGastos);
    }

    private double calcularTotal() {
        double total = 0;
        for (double gasto : gastosMensuales) {
            total += gasto;
        }
        return total;
    }

    private double calcularPromedio(double total) {
        return total / 12;
    }
}
