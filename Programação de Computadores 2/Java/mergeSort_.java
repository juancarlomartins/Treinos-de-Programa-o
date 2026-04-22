import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mergeSort_ {
    
    // Merge Sort principal
    public static int[] mergeSort(int[] vetor) {
        if (vetor.length <= 1) return vetor;
        
        int meio = vetor.length / 2;
        int[] esquerda = mergeSort(Arrays.copyOfRange(vetor, 0, meio));
        int[] direita = mergeSort(Arrays.copyOfRange(vetor, meio, vetor.length));
        
        return merge(esquerda, direita);
    }
    
    // Função de mesclagem
    public static int[] merge(int[] esq, int[] dir) {
        int[] resultado = new int[esq.length + dir.length];
        int i = 0, j = 0, k = 0;
        
        while (i < esq.length && j < dir.length) {
            if (esq[i] <= dir[j]) {
                resultado[k++] = esq[i++];
            } else {
                resultado[k++] = dir[j++];
            }
        }
        
        while (i < esq.length) resultado[k++] = esq[i++];
        while (j < dir.length) resultado[k++] = dir[j++];
        
        return resultado;
    }
    
    // Programa principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Quantos elementos? ");
        int n = sc.nextInt();
        
        // Gera vetor aleatório
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = rand.nextInt(1000) + 1;
        }
        
        System.out.println("Original: " + Arrays.toString(vetor));
        
        // Ordena
        int[] ordenado = mergeSort(vetor);
        
        System.out.println("Ordenado: " + Arrays.toString(ordenado));
        
        sc.close();
    }
}
