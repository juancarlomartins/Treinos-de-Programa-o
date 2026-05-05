// Aluno: Juan Carlo Teles Martins
import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    
    public static void main(String[] args) {
        int tamanho = 200;
        
        int[] originalDesordenado = gerarVetorAleatorio(tamanho);
        int[] originalOrdenado = gerarVetorOrdenado(tamanho);
        
        System.out.println("--- QUICK SORT ---");
        System.out.println("Tamanho do vetor: " + tamanho + " elementos\n");
        
        long[] temposDesordenado = new long[10];
        long[] temposOrdenado = new long[10];
        
        for (int i = 0; i < 10; i++) {
            int[] copia = Arrays.copyOf(originalDesordenado, originalDesordenado.length);
            long inicio = System.nanoTime();
            quickSort(copia, 0, copia.length - 1);
            long fim = System.nanoTime();
            temposDesordenado[i] = fim - inicio;
        }
        
        for (int i = 0; i < 10; i++) {
            int[] copia = Arrays.copyOf(originalOrdenado, originalOrdenado.length);
            long inicio = System.nanoTime();
            quickSort(copia, 0, copia.length - 1);
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
    
    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int indiceParticao = particionar(vetor, inicio, fim);
            quickSort(vetor, inicio, indiceParticao - 1);
            quickSort(vetor, indiceParticao + 1, fim);
        }
    }
    
    private static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = inicio - 1;
        
        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;
        
        return i + 1;
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
