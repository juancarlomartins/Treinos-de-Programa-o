package POO.loja;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá seja bem-vindo ao minha loja!");

        // Criando o primeiro produto
        produto produto1 = new produto("Cadeno", 50, 25);
        Eletronico eletronico1 = new Eletronico("Samsung s23", 2499.99, 5, 24);

        produto1.exibirInfo();

        System.out.println("\n==============================\n");

        eletronico1.exibirInfo();
        eletronico1.temGarantiaLonga(24);

        System.out.println("\n==============================\n");

        // para fechar o scanner...
        boolean flagDesligar = true;
        if (flagDesligar == true){
            scanner.close();
        } else {
            System.out.println();
        }
    }
}
