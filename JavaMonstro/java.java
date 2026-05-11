public class java {
    public static void main(String[] args){
        System.out.println("Olá seja bem-vindo ao meu programa! vamos brincar com vetores e for.\n");

        int[] vetor = {1, 2, 3, 4, 5}; // Criando o vetor com 5 posições.

        int n = vetor.length; // recebe o tamanho do vetor.

        // para imprimir cada valor relacionado ao vetor
        for (int i = 0; i < n; i++){
            System.out.println(vetor[i]);//vetor[i] para imprimir os valores do vetor criado.
        }
    }
}