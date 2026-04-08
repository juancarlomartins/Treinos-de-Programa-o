import javax.swing.JOptionPane;
import java.util.Scanner;

public class buscaLinear{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Testando ===");
        int idade;
        String nome;
        double peso;
        double altura;

        nome = JOptionPane.showInputDialog(null, "Digite o seu nome", "Informações", JOptionPane.DEFAULT_OPTION);
        idade = Integer.parseInt(JOptionPane.showInputDialog( null, "Digite a sua idade: ", JOptionPane.DEFAULT_OPTION));

        scanner.close();
    }
}