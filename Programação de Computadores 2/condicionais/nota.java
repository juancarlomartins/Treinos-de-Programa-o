import java.util.Scanner;
public class nota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nota;
        System.out.print("Digite aqui a sua nota: ");
        nota = scanner.nextInt();

        if (nota >= 90){
            System.out.println("Conceito A");
        } else if (nota >= 80) {
            System.out.println("Conceito B");
        } else if (nota >= 70) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Conceito D - reprovado");
        }

        //Usando operador ternário (forma compacta)
        String resultado = (nota >= 70) ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + resultado);

        boolean flag = true;
        if (flag == true){
            scanner.close();
        } else {
            System.out.println("Nem vai chegar aqui isso");
        }
    }   
}