import java.util.Scanner;
public class temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media;
        int contador;

        System.out.println("=== Calculadora de Temperatura===");
        System.out.println("Quantos dias você deseja cadastrar? ");
        int quantidade = input.nextInt();
        input.nextLine(); //limpando o buffer de memória.

        int [] dias = new int[quantidade];  


        ///coleta de dados.
        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite o dia " + (i + 1) + " : ");
        }

        //exibindo os dados coletados
        for (int i = 0; i < quantidade; i++){
            System.out.println("Elemento numero " + (i + 1) + ": ");
        }

        input.close();

    }
}
