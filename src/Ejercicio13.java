import java.util.Scanner;

public class Ejercicio13 {
    private String[] candidatos;
    private int[] votos;
    private Scanner scanner;

    public Ejercicio13() {
        candidatos = new String[]{"Candidato A", "Candidato B", "Candidato C"};
        votos = new int[candidatos.length];
        scanner = new Scanner(System.in);
    }

    public void gestionarVotacion() {
        System.out.println("Sistema de Votación Electrónica");
        System.out.println("Por favor, voten por uno de los siguientes candidatos:");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println((i + 1) + ". " + candidatos[i]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Usuario " + (i + 1) + ", elija su candidato (1-3): ");
            int voto = scanner.nextInt();

            // Validar voto
            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++;
            } else {
                System.out.println("Voto inválido, por favor elija un número entre 1 y 3.");
                i--;
            }
        }

        mostrarResultados();
    }

    private void mostrarResultados() {
        System.out.println("\nResultados de la Votación:");
        int maxVotos = 0;
        int ganadorIndex = -1;

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i] + ": " + votos[i] + " votos");
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                ganadorIndex = i;
            }
        }

        if (ganadorIndex != -1) {
            System.out.println("El ganador es: " + candidatos[ganadorIndex]);
        } else {
            System.out.println("No hay un ganador claro.");
        }
    }
}
