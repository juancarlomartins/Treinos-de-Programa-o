package POO.Empresa;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Olá seja bem-vindo a nossa empresa!");
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Qual o seu nome? ");
        name = scanner.nextLine();
        System.out.println("Certo " + name + ", vamos conhecer a empresa");

        Funcionario funcionario1 = new Funcionario("Joao", 2200, 160);
        System.out.println("Funcionário 01:");
        funcionario1.exbirInfo();

        System.out.println();

        System.out.println("Funcionário 02:");
        FuncionarioTerceirizado funcionarioT = new FuncionarioTerceirizado("Paulo", 2200, 160, "AS LTDA", 1.25);
        funcionarioT.exbirInfo();
        
        boolean flag = true;
        if(flag == true){
            scanner.close();
        } else {
            System.out.println();
        }
    }
    
}
   