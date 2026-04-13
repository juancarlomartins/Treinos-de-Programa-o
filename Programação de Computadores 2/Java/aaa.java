import java.util.Scanner;

public class aaa {
    public static void main(String[] args){
        System.out.println("Seja bem-vindo ao meu programa.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos começar? 1- sim | 2- sair.");
        int opcao = 1;

        while(opcao == 1){
            System.out.println("Digite o valor do número: ");
            int num = scanner.nextInt();
            System.out.println("Digite o valor do segundo número: ");
            int num2 = scanner.nextInt();

            System.out.println("Soma: " + (num + num2));
            System.out.println("Subtração: " + (num - num2));
            System.out.println("Multiplicação: " + num * num2);
            System.out.println("Divisão: " + (num / num2));

            
            System.out.println("Deseja continuar? 1- sim | 2- sair.");
            opcao = scanner.nextInt();
            //scanner.close();
        }

        System.out.println("Fim do programa.");
    }
}
