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
            System.out.println("1- Calculadora Básica\n2- Calcular IMC\n5- Sair.");
            int escolha = scanner.nextInt();
            while (escolha == 1){
                System.out.println("=== Calculadora básica ===");
                System.out.println("");
                System.out.print("Qual operação você deseja fazer?");
                int escolhaC = scanner.nextInt();

                if (escolhaC == 1){
                    
                }
                if (escolhaC == 2){

                }
                if (escolhaC == 3){

                }
                if (escolhaC == 4){

                }
                else {
                    escolha = 10;
                }
            }

            while (escolha == 2){
                System.out.println("=== Calculadora de IMC ===");
                double peso;
                double altura;
                System.out.print("Certo " + nome + ", Digite o seu peso atual: ");
                peso = scanner.nextDouble();
                System.out.print("Certo " + nome + ", Digite o sua altura: ");
                altura = scanner.nextDouble();

                double resultado;

                System.out.println("=== Resultado do Cálculo do IMC === ");


            }




            if (escolha == 5){
                flag = false;
            }
        }
        
        // método para desligar o scanner por completo...
        int close = 1;
        if (close == 1){
            System.out.println("Volte sempre!");
            scanner.close();
        }
    }
}
