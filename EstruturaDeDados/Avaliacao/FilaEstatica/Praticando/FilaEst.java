package Praticando;
// Treinando o padrão da fila estática...
public class FilaEst {
    // Definindo os atributos da fila estaticas.
    private int[] dados;
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidade;

    public FilaEst(int capacidade){
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.fim = -1;
        this.inicio = 0;
        this.tamanho = 0;
        System.out.println("Fila criada! Capacidade: " + capacidade);
    }

    public boolean isEmpty(){ // ver se está vazia
        return tamanho == 0;
    }
    public boolean isFull(){
        return tamanho == capacidade; // ver se está cheia.
    }

    public void enqueue(int elemento){ // Para adicionar um novo elemento na fila...
        if (isFull()){
            System.out.println("A fila está cheia.");
            return;
        }

        fim = (fim + 1) % capacidade;
        dados[fim] = elemento;
        tamanho++;

        System.out.println("Inserido: " + elemento + ", na posição: " + fim);
        //exibir();
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("A fila já está vazia, não possível remover elementos.");
            return -1;
        }

        int elementoRemovido = dados[inicio];

        inicio = (inicio + 1) % capacidade; // Avança para o inicío (Circular)
        tamanho--;

        System.out.println("Removido: " + elementoRemovido + ", na posição: " + inicio);
        //exibir();
        return elementoRemovido;
    }
    // Método para ver qual o primeiro elemento da fila.
    public int front(){
        if(isEmpty()){
            System.out.println("Fila vazia, não há primeiro elemento.");
            return -1;
        }

        System.out.println("Primeiro elemento da fila: " + dados[inicio]);
        return dados[inicio];
    }
    // Método para ver o último da fila.
    public int back(){
        if(isEmpty()){
            System.out.println("Fila está vazia");
            return -1;
        }

        System.out.println("Ultimo elemento da fila: " + dados[fim]);
        return dados[fim];
    }

    // Método para exibir a fila completa.
    public void exibir(){
        if(isEmpty()){
            System.out.println("A fila está vazia!");
            return;
        }

        System.out.print("Fila: [");
        int contador = 0;
        int i = inicio;

        while(contador < tamanho){
            System.out.print(dados[i]);
            if(contador < tamanho -1){
                System.out.print(" -> ");
            }
            i = (i + 1) % capacidade;
            contador++;
        }
        System.out.print("] .");
        System.out.println("\nInicio: " + inicio + ", Fim: " + fim + ", Capacidade: " + tamanho);
    }

    // método para ver o tamanho da fila...
    public int size(){
        return tamanho;
    }
    public void limpar(){
        inicio = 0;
        fim = -1;
        tamanho = 0;
        System.out.println("Fila limpa!");
    }

    public static void main(String[] args) {
        System.out.println("==== testando a fila estática ====");
        System.out.println("Criando uma fila...");
        FilaEst fila = new FilaEst(3);

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        fila.exibir();

        fila.dequeue();
        fila.dequeue();

        fila.exibir();

        fila.enqueue(4);
        fila.enqueue(5);

        fila.exibir();

        System.out.println("Testando o overflow...");
        fila.enqueue(6);
    }
}
