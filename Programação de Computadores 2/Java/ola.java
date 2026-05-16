import java.util.Scanner;


public class ola {
    public static void main(String[] args){
        // adicionei o scanner para ler a entrada do usuário, mas por enquanto ele não está sendo utilizado

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá seja bem-vindo ao meu programa!");
        

        int []vetor = {1, 2, 3, 4, 5};

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}