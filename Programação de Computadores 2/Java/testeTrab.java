import java.util.Random;

public class testeTrab {

    // Bubble Sort
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

    // Selection Sort
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

    // Insertion Sort
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

    // Gera vetor aleatório
    public static int[] gerarVetorAleatorio(int tamanho) {
        Random rand = new Random();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = rand.nextInt(1000);
        }
        return vetor;
    }

    // Copiar vetor
    public static int[] copiarVetor(int[] original) {
        return original.clone();
    }

    public static void main(String[] args) {

        int[] vetorDesordenado = gerarVetorAleatorio(200);

        int[] vetorOrdenado = vetorDesordenado.clone();
        java.util.Arrays.sort(vetorOrdenado);

        testarAlgoritmo("Bubble Sort", vetorDesordenado, vetorOrdenado);
        testarAlgoritmo("Selection Sort", vetorDesordenado, vetorOrdenado);
        testarAlgoritmo("Insertion Sort", vetorDesordenado, vetorOrdenado);
    }

    public static void testarAlgoritmo(String nome, int[] desordenado, int[] ordenado) {

        long somaDesordenado = 0;
        long somaOrdenado = 0;

        // Teste com vetor desordenado
        for (int i = 0; i < 10; i++) {
            int[] copia = copiarVetor(desordenado);

            long inicio = System.nanoTime();
            executar(nome, copia);
            long fim = System.nanoTime();

            somaDesordenado += (fim - inicio);
        }

        // Teste com vetor ordenado
        for (int i = 0; i < 10; i++) {
            int[] copia = copiarVetor(ordenado);

            long inicio = System.nanoTime();
            executar(nome, copia);
            long fim = System.nanoTime();

            somaOrdenado += (fim - inicio);
        }

        System.out.println("\n" + nome);
        System.out.println("Média Desordenado: " + (somaDesordenado / 10) + " ns");
        System.out.println("Média Ordenado: " + (somaOrdenado / 10) + " ns");
    }

    public static void executar(String nome, int[] vetor) {
        switch (nome) {
            case "Bubble Sort":
                bubbleSort(vetor);
                break;
            case "Selection Sort":
                selectionSort(vetor);
                break;
            case "Insertion Sort":
                insertionSort(vetor);
                break;
        }
    }
}