
package EstruturaDeDados.Avaliacao.PilhaEstatica;

public class PilhaEstatica {
    private int[] dados;      // array para armazenar os elementos
    private int topo;          // índice do topo da pilha
    private int capacidade;    // tamanho máximo da pilha
    
    // Construtor - define capacidade e inicializa topo = -1 (pilha vazia)
    public PilhaEstatica(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;        // -1 significa pilha vazia
    }
    
    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }
    
    // Verifica se a pilha está cheia
    public boolean isFull() {
        return topo == capacidade - 1;
    }
    
    // Inserir elemento no topo (push)
    public void push(int elemento) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
            return;
        }
        topo++;                 // incrementa o topo
        dados[topo] = elemento; // coloca o elemento na nova posição
        System.out.println("Inserido: " + elemento);
    }
    
    // Remover elemento do topo (pop)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        int elemento = dados[topo]; // guarda o elemento do topo
        topo--;                     // decrementa o topo
        System.out.println("Removido: " + elemento);
        return elemento;
    }
    
    // Visualizar o topo sem remover (peek)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return dados[topo];
    }

    public static void main(String[] args) {
        System.out.println("testando a pilha braba.\n");
        PilhaEstatica pilha = new PilhaEstatica(3);

        pilha.push(5);
        pilha.push(2);
        pilha.push(4);

        
        pilha.pop();

        pilha.peek();

        System.out.println(pilha.peek());
    }
}
