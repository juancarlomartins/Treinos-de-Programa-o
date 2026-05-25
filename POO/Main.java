package POO;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá seja bem-vindo ao minha loja!");

        // Criando o novo objeto celular
        Eletronico celular = new Eletronico("Samsung S23", 2499.99, 5, 24);

        //exibirInfo(celular);


        // para fechar o scanner...
        boolean flagDesligar = true;
        if (flagDesligar == true){
            scanner.close();
        } else {
            System.out.println();
        }
    }
}
