import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = temp;
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
            selectionSort(copia);
            long fim = System.nanoTime();
            somaDes += (fim - ini);
        }

        for (int i = 0; i < 10; i++) {
            int[] copia = ordenado.clone();
            long ini = System.nanoTime();
            selectionSort(copia);
            long fim = System.nanoTime();
            somaOrd += (fim - ini);
        }

        System.out.println("Selection Sort");
        System.out.println("Média Desordenado: " + (somaDes / 10) + " ns");
        System.out.println("Média Ordenado: " + (somaOrd / 10) + " ns");
    }
}
