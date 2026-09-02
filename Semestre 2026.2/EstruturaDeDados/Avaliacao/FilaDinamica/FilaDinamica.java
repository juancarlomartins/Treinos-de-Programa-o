public class FilaDinamica {
    private class No {
        int dado;
        No proximo;
        
        No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }
    
    private No inicio;
    private No fim;
    private int tamanho;
    
    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public boolean isEmpty() {
        return inicio == null;
    }
    
    // Inserir no final
    public void enqueue(int elemento) {
        No novoNo = new No(elemento);
        
        if (isEmpty()) {
            inicio = novoNo;   // se vazia, início e fim apontam para o novo
            fim = novoNo;
        } else {
            fim.proximo = novoNo;  // atual fim aponta para o novo
            fim = novoNo;          // novo nó agora é o fim
        }
        tamanho++;
        System.out.println("Inserido: " + elemento);
    }
    
    // Remover do início
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return -1;
        }
        int elemento = inicio.dado;
        inicio = inicio.proximo;  // início avança
        
        if (inicio == null) {     // se fila ficou vazia
            fim = null;
        }
        tamanho--;
        System.out.println("Removido: " + elemento);
        return elemento;
    }
    
    public int front() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return -1;
        }
        return inicio.dado;
    }
}