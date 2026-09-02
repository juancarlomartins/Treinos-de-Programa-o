//Aluno: Juan Carlo Teles Martins - 202504940038

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculadora ===");
        System.out.println("Deseja iniciar uma operação? 1- Sim | 0- Não: ");
        int opcao = scanner.nextInt();

        while (opcao == 1){
            int operacao;
            System.out.println("=== Escolha ===");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação.");
            System.out.println("4- Divisão.");
            System.out.println("0- Sair.");
            operacao = scanner.nextInt();

            if (operacao == 1){
                System.out.println("1- Somar\n");
                System.out.println("Digite o valor do primeiro número: ");
                double num = scanner.nextDouble();
                System.out.println("Digite o valor do segundo número: ");
                double num2 = scanner.nextDouble();
                System.out.println("Resultado: " + (num + num2) + ".\n");
            } else if (operacao == 2){
                System.out.println("1- Subtração\n");
                System.out.println("Digite o valor do primeiro número: ");
                double num = scanner.nextDouble();
                System.out.println("Digite o valor do segundo número: ");
                double num2 = scanner.nextDouble();
                System.out.println("Resultado: " + (num - num2) + ".\n");
            } else if(operacao == 3) {
                System.out.println("1- Multiplicação\n");
                System.out.println("Digite o valor do primeiro número: ");
                double num = scanner.nextDouble();
                System.out.println("Digite o valor do segundo número: ");
                double num2 = scanner.nextDouble();
                System.out.println("Resultado: " + (num * num2) + ".\n");
            } else if(operacao == 4){
                System.out.println("1- Divisão\n");
                System.out.println("Digite o valor do primeiro número: ");
                double num = scanner.nextDouble();   
                System.out.println("Digite o valor do segundo número: ");
                double num2 = scanner.nextDouble();
                System.out.println("Resultado: " + (num / num2) + ".\n");
            } else {
                opcao = 0;
            }
        }

        System.out.println("Fim do programa, volte sempre!");
        scanner.close();
    }
}