import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Programa contador ===");
        int opcao = 1;
      
        while(opcao == 1){
            System.out.println("Vamos começar a contagem? 1- sim, 2- não.");
            opcao = scanner.nextInt();
            if (opcao != 1){
                System.out.println("Fim do programa, volte sempre!");
                return;
            }

            System.out.println("Digite aqui até quando você deseja fazer a contagem: ");
            int numero = scanner.nextInt();

            for(int i = 1; i < numero+1; i++){
                System.out.println("- " + i);
            }
        }
        
        scanner.close();
    }
}
