import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Tabuada dinâmica ==");
        int opcao = 1;

        while(opcao == 1){
            System.out.println("Vamos lá, digite aqui o número o qual você deseja ver a tabuada: ");
            int numero = scanner.nextInt();

            System.out.println("=== Tabuada do " + numero + ": ===");

            for (int i = 1; i < 11; i++){
                System.err.println(numero + " x " + i + " = " + (numero*i));
            }

            System.out.println("Você deseja continuar? 1- sim | 2- não.");
            opcao = scanner.nextInt();
            if (opcao != 1){
                System.out.println("Fim do programa, volte sempre!");
                return;
            }

        }
        scanner.close();
    }
}
