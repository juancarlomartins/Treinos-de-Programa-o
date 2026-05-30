// Juan Carlo Teles Martins
import java.util.Scanner;

public class qualquer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nOlá seja bem-vindo ao meu programa brabo\n");
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        boolean flag = true;
        // Em breve vou fazer um programa que vai usar orientação a objetos para melhorar a manutenção...
        while (flag == true){
            System.out.println("Certo " + nome + ", qual a função que você deseja usar?");
            System.out.println("1- Calculadora Básica\n2- Calcular IMC\n3- Sair.");
            int escolha = scanner.nextInt();
            while (escolha == 1){
                System.out.println("=== Calculadora básica ===");

                int escolhaC = scanner.nextInt();

                if (escolhaC == 1){

                }
            }
        }
        int close = 1;
        if (close == 1){
            System.out.println("Volte sempre!");
            scanner.close();
        }
    }
}
