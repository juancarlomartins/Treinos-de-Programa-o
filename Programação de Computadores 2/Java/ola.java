import java.util.Scanner;


public class ola {
    public static void main(String[] args){
        // adicionei o scanner para ler a entrada do usuário, mas por enquanto ele não está sendo utilizado

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá seja bem-vindo ao meu programa!");
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine(); // Lê a linha de entrada do usuário
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
        // scanner.nextLine(); // Lê a linha de entrada do usuário
    }
}