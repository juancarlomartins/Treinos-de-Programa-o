package Praticando;

public class FilaDin {
    // criando uma classe interna chamada nó
    private class No{
        int dado; // valor armazenado.
        No proximo; // Referência do próximo nó.

        // construtor de nó
        No(int dado){
            this.dado = dado;
            this.proximo = proximo;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;

    // === Construtor de Fila Dinâmica ===
    public FilaDin(){
        this.inicio = null; // fila vazia - inicio null
        this.fim = null; // fila vazia - fim null
        this.tamanho = 0;
        System.out.println("Fila Dinâmica criada! vamos começar as operações: ");
    }

    public boolean isEmpty(){
        return inicio == null;
    }

    public void enqueue(int elemento){
        No novoNo = new No(elemento);

        // Se a fila estiver vazia
        if (isEmpty()){
            //O novo nó é tanto o início quanto o fim da fila.
            inicio = novoNo;
            fim = novoNo;
        } else {
            // se não estiver vazia
            // O último nó (fim) aponta para o novo nó
            fim.proximo = novoNo;
            // O novo nó agora é o fim.
            fim = novoNo;
        }

        // aumenta tamanho
        tamanho++;
        System.out.println("Inserido: " + elemento);
    }

    // Método para remover (dequeue)
    public int dequeue(){
        if(isEmpty()){
            System.out.println("A fila está vazia, não é possível remover.");
            return -1;
        }
        // Guarda o elemento que será removido.
        int elementoRemovido = inicio.dado;
        // Inicio agora é o próximo nó
        inicio = inicio.proximo;

        if(inicio == null){ // caso a fila tenha ficado vazia nesse processo atual.
            fim = null;
        }
        tamanho--;

        System.out.println("Removido: " + elementoRemovido + ".");
        return elementoRemovido;
    }

    public int front(){ // Para visualizar o primeiro elemento da fila.
        if(isEmpty()){
            System.out.println("Erro! A fila está vazia.");
            return -1;
        }

        System.out.println("Primeiro da fila: " + inicio.dado);
        return inicio.dado;
    }
    public int back(){ // Para visualizar o último elemento da fila
        if(isEmpty()){
            System.out.println("Erro! A fila está vazia.");
            return -1;
        }
        System.out.println("Último elemento da fila: " + fim.dado);
        return fim.dado;
    }
    public void exibir(){ // Método para exibir a fila por completo
        if(isEmpty()){
            System.out.println("Fila: [] -> vazia");
            return;
        }

        System.out.print("Fila: [");
        No atual = inicio;
        while(atual != null){
            System.out.print(atual.dado);
            if(atual.proximo != null){
                System.out.print(" -> ");
            }
            atual = atual.proximo;
        }
        System.out.print("]");
        System.out.println("\nInicio: " + inicio.dado + ", Fim: " + fim.dado + ", tamanho atual: " + tamanho);
    }
    public int size(){ // Método para ver o tamanho atual da fila.
        return tamanho;
    }
    public void limpar(){ // método para limpar a fila.
        inicio = null;
        fim = null;
        tamanho = 0;
        System.out.println("Fila limpa!");
    }
    public static void main(String[] args) {
        System.out.println("=== testando a fila dinâmica ===");
        System.out.println("Criando uma nova fila...");
        FilaDin fila = new FilaDin();

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        fila.exibir();

        fila.dequeue();
        fila.exibir();

        fila.front();
        fila.back();
        fila.size();

        fila.limpar();
        fila.exibir();

        fila.enqueue(10);
        fila.exibir();
    }
}
