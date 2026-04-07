import java.util.Scanner;

public class treino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Seja be-vindo ao meu programa === ");
        System.out.println("Até quanto você deseja fazer uma contagem? ");
        int contagem = scanner.nextInt();
        
        //fazendo uma contagem usando o loop for

        for (int i = 1; i < contagem+1; i++){
            System.out.println("- " + i);
        }

        scanner.close();
    }
}
