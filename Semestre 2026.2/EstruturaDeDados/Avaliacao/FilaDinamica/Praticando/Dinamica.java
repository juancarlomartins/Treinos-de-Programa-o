package Praticando;

public class Dinamica {
    private class No{
        int dado;
        No proximo;

        No(int dado){
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;

    public Dinamica(){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        System.out.println("Fila criada com sucesso!");
    }

    public boolean isEmpty(){
        return inicio == null;
    }

    public void enqueue(int elemento){
        No novoNo = new No(elemento);
        if (isEmpty()){
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
        tamanho++;
        System.out.println("Inserido: " + elemento);
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Não é possível remover, a lista está vazia");
            return -1;
        }

        int elementoRemovido = inicio.dado;
        inicio = inicio.proximo;

        if(inicio == null){
            fim = null;
        }
        tamanho--;
        System.out.println("Removido: " + elementoRemovido + ".");
        return elementoRemovido;
    }

    public int front(){
        if (isEmpty()){
            System.out.println("A fila está vazia");
            return -1;
        }

        System.out.println("Primeiro da fila: " + inicio.dado);
        return inicio.dado;
    }
    public int back(){
        if (isEmpty()){
            System.out.println("A fila está vazia");
            return -1;
        }

        System.out.println("Último da fila: " + fim.dado);
        return fim.dado;
    }

    public void exibir(){
        if (isEmpty()){
            System.out.println("A fila está vazia");
            return;
        }
        System.out.print("Fila [");
        No atual = inicio;
        while(atual != null){
            System.out.print(atual.dado);
            if(atual.proximo != null){
                System.out.print(" -> ");
            }
            atual = atual.proximo;
        }
        System.out.print("].");
        System.out.println("\nInicio: " + inicio.dado + ", Fim: " + fim.dado + ", tamanho: " + tamanho);
    }

    public void limpar(){
        inicio = null;
        fim = null;
        tamanho = 0;
        System.out.println("Fila limpa!");
    }

    public static void main(String[] args) {
        System.out.println("Bora testar essa bomba que eu fiz aqui.");
        System.out.println("Criando fila dinamica....");
        Dinamica fila = new Dinamica();

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        //fila.dequeue();
        fila.exibir();
    }
}
