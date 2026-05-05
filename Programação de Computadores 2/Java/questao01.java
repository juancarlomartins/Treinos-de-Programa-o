//Aluno: Juan Carlo Teles Martins - 
import java.util.Scanner;
public class questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao programa de detecção de intrusos.\n");

        System.out.println("Digite o número de andares do prédio: ");
        int numeroAndares = scanner.nextInt();

        int[] sensoresPorAndar = new int[numeroAndares];
        int[] sensoresLigadosPorAndar = new int[numeroAndares];

        int totalAlertas = 0;   

        for (int andar = 1; andar <= numeroAndares; andar++){
            System.out.println("\nAndar " + andar + ". ");

            System.out.println("Quantos sensores de movimento existem no " + andar + "° andar? ");
            int numeroSensores = scanner.nextInt();
            sensoresPorAndar[andar - 1] = numeroSensores;

            for (int sensor = 1; sensor <= numeroSensores; sensor++){
                System.out.println("Sensor " + sensor + " - Houve movimento? 1- Sim | 0- Não: ");
                int movimento = scanner.nextInt();

                if (movimento == 1){
                    System.out.println("");
                }
            }
        }
    }
}
