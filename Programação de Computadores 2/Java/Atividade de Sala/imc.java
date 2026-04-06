import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem-vindo a calculadora de imc\n");
        System.out.println("Digite aqui a sua altura: ");
        double altura = input.nextDouble();
        System.out.println("Digite aqui o seu peso: ");
        double peso = input.nextDouble();

        //Calculando o imc.
        double imc = peso * (altura * altura);
        //exibindo o resultado do cálculo
        System.out.println("O seu imc é: " + imc);
    }
}
