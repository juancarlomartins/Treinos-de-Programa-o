import java.util.Scanner;
public class ola {

    private int numero;
    private String nomeJogador;
    private String nomeInimigo;
    private String cpf;
    private String numeroTelefone;
    public static void main(String[] args){
        // adicionei o scanner para ler a entrada do usuário, mas por enquanto ele não está sendo utilizado


        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá seja bem-vindo ao meu programa!");
        

        int []vetor = {1, 2, 3, 4, 5}; 

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }


        boolean flag = true;

        
        String nome;
        System.out.println("Digite o seu nome aqui carai.");
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