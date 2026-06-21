public class FilaEstatica {
    private int[] dados;
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidade;
    
    public FilaEstatica(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }
    
    public boolean isEmpty() {
        return tamanho == 0;
    }
    
    public boolean isFull() {
        return tamanho == capacidade;
    }
    
    // Inserir no final (enqueue)
    public void enqueue(int elemento) {
        if (isFull()) {
            System.out.println("Fila cheia!");
            return;
        }
        fim = (fim + 1) % capacidade;  // circular - quando chega ao fim, volta ao início
        dados[fim] = elemento;
        tamanho++;
        System.out.println("Inserido: " + elemento);
    }
    
    // Remover do início (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return -1;
        }
        int elemento = dados[inicio];
        inicio = (inicio + 1) % capacidade;  // avança o início
        tamanho--;
        System.out.println("Removido: " + elemento);
        return elemento;
    }
    
    // Consultar o primeiro elemento
    public int front() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return -1;
        }
        return dados[inicio];
    }
}