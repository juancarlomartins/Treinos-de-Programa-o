import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {   
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
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
        //Trecho para o vetor desordenado.
        for (int i = 0; i < 10; i++) {
            int[] copia = desordenado.clone();
            long ini = System.nanoTime();
            bubbleSort(copia);
            long fim = System.nanoTime();
            somaDes += (fim - ini);
        }
        //Trecho para o vetor ordenado.
        for (int i = 0; i < 10; i++) {
            int[] copia = ordenado.clone();
            long ini = System.nanoTime();
            bubbleSort(copia);
            long fim = System.nanoTime();
            somaOrd += (fim - ini);
        }

        System.out.println("Bubble Sort");
        System.out.println("Média Desordenado: " + (somaDes / 10) + " ns");
        System.out.println("Média Ordenado: " + (somaOrd / 10) + " ns");
    }
}
