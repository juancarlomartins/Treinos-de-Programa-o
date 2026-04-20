import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static int[] gerarVetor() {
        Random rand = new Random();
        int[] v = new int[200];
        for (int i = 0; i < 200; i++) {
            v[i] = rand.nextInt(1000);
        }
        return v;
    }

    public static void main(String[] args) {

        int[] desordenado = gerarVetor();
        int[] ordenado = desordenado.clone();
        Arrays.sort(ordenado);

        long somaDes = 0, somaOrd = 0;

        for (int i = 0; i < 10; i++) {
            int[] copia = desordenado.clone();
            long ini = System.nanoTime();
            insertionSort(copia);
            long fim = System.nanoTime();
            somaDes += (fim - ini);
        }

        for (int i = 0; i < 10; i++) {
            int[] copia = ordenado.clone();
            long ini = System.nanoTime();
            insertionSort(copia);
            long fim = System.nanoTime();
            somaOrd += (fim - ini);
        }

        System.out.println("Insertion Sort");
        System.out.println("Média Desordenado: " + (somaDes / 10) + " ns");
        System.out.println("Média Ordenado: " + (somaOrd / 10) + " ns");
    }
}