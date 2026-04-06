public class nota {
    public static void main(String[] args) {
        int nota = 85;

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
///git add .
/// git status
/// git commit
/// git push
///tu é doido
    }   
}