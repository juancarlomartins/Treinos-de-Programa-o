// Aluno: Juan Carlo Teles Martins
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    
    public static void main(String[] args) {
        int tamanho = 200;
        
        int[] originalDesordenado = gerarVetorAleatorio(tamanho);
        int[] originalOrdenado = gerarVetorOrdenado(tamanho);
        
        System.out.println("--- MERGE SORT ---");
        System.out.println("Tamanho do vetor: " + tamanho + " elementos\n");
        
        long[] temposDesordenado = new long[10];
        long[] temposOrdenado = new long[10];
        
        for (int i = 0; i < 10; i++) {
            int[] copia = Arrays.copyOf(originalDesordenado, originalDesordenado.length);
            long inicio = System.nanoTime();
            mergeSort(copia, 0, copia.length - 1);
            long fim = System.nanoTime();
            temposDesordenado[i] = fim - inicio;
        }
        
        for (int i = 0; i < 10; i++) {
            int[] copia = Arrays.copyOf(originalOrdenado, originalOrdenado.length);
            long inicio = System.nanoTime();
            mergeSort(copia, 0, copia.length - 1);
            long fim = System.nanoTime();
            temposOrdenado[i] = fim - inicio;
        }
        
        System.out.println("Vetor DESORDENADO - Tempos individuais (ns):");
        for (int i = 0; i < 10; i++) {
            System.out.println("  Execução " + (i+1) + ": " + temposDesordenado[i] + " ns");
        }
        double mediaDesord = calcularMedia(temposDesordenado);
        System.out.printf("Tempo MÉDIO (desordenado): %.2f ns\n\n", mediaDesord);
        
        System.out.println("Vetor ORDENADO - Tempos individuais (ns):");
        for (int i = 0; i < 10; i++) {
            System.out.println("  Execução " + (i+1) + ": " + temposOrdenado[i] + " ns");
        }
        double mediaOrd = calcularMedia(temposOrdenado);
        System.out.printf("Tempo MÉDIO (ordenado): %.2f ns\n", mediaOrd);
    }
    
    private static void mergeSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergeSort(vetor, esquerda, meio);
            mergeSort(vetor, meio + 1, direita);
            merge(vetor, esquerda, meio, direita);
        }
    }
    
    private static void merge(int[] vetor, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;
        
        int[] vetorEsquerda = new int[n1];
        int[] vetorDireita = new int[n2];
        
        for (int i = 0; i < n1; i++)
            vetorEsquerda[i] = vetor[esquerda + i];
        for (int j = 0; j < n2; j++)
            vetorDireita[j] = vetor[meio + 1 + j];
        
        int i = 0, j = 0;
        int k = esquerda;
        
        while (i < n1 && j < n2) {
            if (vetorEsquerda[i] <= vetorDireita[j]) {
                vetor[k] = vetorEsquerda[i];
                i++;
            } else {
                vetor[k] = vetorDireita[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            vetor[k] = vetorEsquerda[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            vetor[k] = vetorDireita[j];
            j++;
            k++;
        }
    }
    
    private static double calcularMedia(long[] tempos) {
        long soma = 0;
        for (long t : tempos) {
            soma += t;
        }
        return soma / 10.0;
    }
    
    private static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random random = new Random(42);
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(10000);
        }
        return vetor;
    }
    
    private static int[] gerarVetorOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i;
        }
        return vetor;
    }
}
