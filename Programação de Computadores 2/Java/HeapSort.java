// Aluno: Juan Carlo Teles Martins
import java.util.Arrays;
import java.util.Random;

public class HeapSort {
    
    public static void main(String[] args) {
        int tamanho = 200;
        
        int[] originalDesordenado = gerarVetorAleatorio(tamanho);
        int[] originalOrdenado = gerarVetorOrdenado(tamanho);
        
        System.out.println("=== HEAP SORT ===");
        System.out.println("Tamanho do vetor: " + tamanho + " elementos\n");
        
        long[] temposDesordenado = new long[10];
        long[] temposOrdenado = new long[10];
        
        for (int i = 0; i < 10; i++) {
            int[] copia = Arrays.copyOf(originalDesordenado, originalDesordenado.length);
            long inicio = System.nanoTime();
            heapSort(copia);
            long fim = System.nanoTime();
            temposDesordenado[i] = fim - inicio;
        }
        
        for (int i = 0; i < 10; i++) {
            int[] copia = Arrays.copyOf(originalOrdenado, originalOrdenado.length);
            long inicio = System.nanoTime();
            heapSort(copia);
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
    
    private static void heapSort(int[] vetor) {
        int n = vetor.length;
        
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(vetor, n, i);
        }
        
        for (int i = n - 1; i > 0; i--) {
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;
            
            heapify(vetor, i, 0);
        }
    }
    
    private static void heapify(int[] vetor, int n, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;
        
        if (esquerda < n && vetor[esquerda] > vetor[maior]) {
            maior = esquerda;
        }
        
        if (direita < n && vetor[direita] > vetor[maior]) {
            maior = direita;
        }
        
        if (maior != i) {
            int swap = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = swap;
            
            heapify(vetor, n, maior);
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