// Juan Carlo Teles Martins
import java.util.Scanner;

public class qualquer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nOlá seja bem-vindo ao meu programa brabo\n");
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        boolean flag = true;
        while (flag == true){
            System.out.println("Certo " + nome + ", qual a função que você deseja usar?");
            System.out.println("1- Calculadora Básica\n2- Calcular IMC\n3- Sair.");
            int escolha = scanner.nextInt();
        }
    }
}
