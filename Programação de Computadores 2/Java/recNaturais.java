import java.util.Scanner;

public class recNaturais{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculo de diferentes recursos naturais.\n");
        System.out.println("Digite o valor referente a produção de produtos agricolas: ");
        int agricola = input.nextInt();
        System.out.println("Digite o valor referente a produção de produtos florestais: ");
        int florestais = input.nextInt();
        System.out.println("Digite o valor referente a produção de produtos pesqueiro: ");
        int pesqueiro = input.nextInt();

        double media = (agricola + florestais + pesqueiro) / 3;

        System.out.println("Resultado da media: " + media);
        input.close();
    }
}
