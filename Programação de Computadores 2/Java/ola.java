import java.util.Scanner;
public class ola {

    public int numero;
    public String nomeJogador;
    public String nomeInimigo;
    public String cpf;
    public String numeroTelefone;
    public static void main(String[] args){
        // adicionei o scanner para ler a entrada do usuário, mas por enquanto ele não está sendo utilizado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá seja bem-vindo ao meu programa!");
        
        boolean flag = true;
        int num = 1;
        String nome;
        nome = "Juan";

        System.out.println("Olá " + nome + " Bora testar esse programa aqui.");
        // bora ver mano
        System.out.println("Digite qualquer coisa aqui pra eu ver um negócio.");
        nome = scanner.nextLine();
        
        System.out.println("Olá " + nome + " seja bem-vindo!");



        // implementação extra no código
        if(flag == true){
            scanner.close();
        } else{
            System.out.println("bora ver né");
        }

    }
}