import java.util.Scanner;
public class nome {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            //fazendo a coleta de dados.
            System.out.println("Olá seja bem-vindo ao meu programa!");
            System.err.println("Digite o seu nome: ");
            String nome = entrada.nextLine();

            System.out.println("Digite a sua idade: ");
            int idade = entrada.nextInt();

            System.out.println("Digite a sua altura (em metros)");
            double altura = entrada.nextDouble();

            //Para exibir os dados
            System.out.println("\n---Dados informados pelo usuário.---");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Altura: " + altura + " m");
        }
    }
}
