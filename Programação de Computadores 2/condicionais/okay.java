import java.util.Scanner;

public class okay {

    public void printDados(String nome, int idade, String curso){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
    }
    public static void main(String[] args) {
        System.out.print("Olá seja bem-vindo ao meu programa brabo\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        int idade;
        String curso;

        System.out.print("Certo " + nome + ", agora vamos coletar alguns dados importantes.\n");
        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();
        System.out.print("Digite o curso que você faz: ");
        curso = scanner.nextLine();

        System.out.println("=== Dados Coletados do Usuário ===");

        int num = 1;

        if (num == 1){
            scanner.close();
        }
    }
}
