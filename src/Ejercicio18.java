import java.util.ArrayList;
import java.util.Scanner;

class Vehiculo {
    private String matricula;
    private String modelo;
    private String estado;

    public Vehiculo(String matricula, String modelo, String estado) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Modelo: " + modelo + ", Estado: " + estado;
    }
}

public class Ejercicio18 {
    private ArrayList<Vehiculo> flota;
    private Scanner scanner;

    public Ejercicio18() {
        flota = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void gestionarVehiculos() {
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Registrar nuevo vehículo");
            System.out.println("2. Actualizar estado de un vehículo");
            System.out.println("3. Mostrar vehículos disponibles");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarVehiculo();
                    break;
                case 2:
                    actualizarEstadoVehiculo();
                    break;
                case 3:
                    mostrarVehiculosDisponibles();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }

    private void registrarVehiculo() {
        System.out.print("Ingrese matrícula del vehículo: ");
        String matricula = scanner.nextLine();
        System.out.print("Ingrese modelo del vehículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese estado del vehículo (disponible/u ocupado): ");
        String estado = scanner.nextLine();

        Vehiculo nuevoVehiculo = new Vehiculo(matricula, modelo, estado);
        flota.add(nuevoVehiculo);
        System.out.println("Vehículo registrado con éxito.");
    }

    private void actualizarEstadoVehiculo() {
        System.out.print("Ingrese matrícula del vehículo a actualizar: ");
        String matricula = scanner.nextLine();
        boolean encontrado = false;

        for (Vehiculo vehiculo : flota) {
            if (vehiculo.getMatricula().equals(matricula)) {
                System.out.print("Ingrese el nuevo estado del vehículo (disponible/ocupado): ");
                String nuevoEstado = scanner.nextLine();
                vehiculo.setEstado(nuevoEstado);
                System.out.println("Estado actualizado con éxito.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }
    }

    private void mostrarVehiculosDisponibles() {
        System.out.println("\nVehículos disponibles:");
        for (Vehiculo vehiculo : flota) {
            if (vehiculo.getEstado().equalsIgnoreCase("disponible")) {
                System.out.println(vehiculo);
            }
        }
    }
}
