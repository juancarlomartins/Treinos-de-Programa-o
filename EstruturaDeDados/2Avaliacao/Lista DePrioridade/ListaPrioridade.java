import java.util.ArrayList;

public class ListaPrioridade {
    private ArrayList<Integer> heap;
    
    public ListaPrioridade() {
        heap = new ArrayList<>();
    }
    
    // Inserir elemento
    public void inserir(int valor) {
        heap.add(valor);           // adiciona no final
        subir(heap.size() - 1);    // ajusta subindo
    }
    
    // Ajuste para cima (heapify up)
    private void subir(int indice) {
        int pai = (indice - 1) / 2;  // índice do pai
        
        while (indice > 0 && heap.get(indice) > heap.get(pai)) {
            // troca filho com pai se filho for maior
            trocar(indice, pai);
            indice = pai;
            pai = (indice - 1) / 2;
        }
    }
    
    // Remover o elemento de maior prioridade (raiz)
    public int remover() {
        if (heap.isEmpty()) return -1;
        
        int raiz = heap.get(0);           // guarda a raiz
        int ultimo = heap.remove(heap.size() - 1);  // remove o último
        
        if (!heap.isEmpty()) {
            heap.set(0, ultimo);           // coloca o último na raiz
            descer(0);                     // ajusta descendo
        }
        
        return raiz;
    }
    
    // Ajuste para baixo (heapify down)
    private void descer(int indice) {
        int maior = indice;
        int esquerda = 2 * indice + 1;
        int direita = 2 * indice + 2;
        
        // Verifica se o filho esquerdo é maior
        if (esquerda < heap.size() && heap.get(esquerda) > heap.get(maior)) {
            maior = esquerda;
        }
        
        // Verifica se o filho direito é maior
        if (direita < heap.size() && heap.get(direita) > heap.get(maior)) {
            maior = direita;
        }
        
        // Se algum filho é maior, troca e continua descendo
        if (maior != indice) {
            trocar(indice, maior);
            descer(maior);
        }
    }
    
    private void trocar(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    
    public boolean isEmpty() {
        return heap.isEmpty();
    }
    
    // Exemplo de uso
    public static void main(String[] args) {
        ListaPrioridade fila = new ListaPrioridade();
        
        fila.inserir(10);
        fila.inserir(30);
        fila.inserir(20);
        fila.inserir(50);
        fila.inserir(40);
        
        System.out.println("Removendo em ordem de prioridade:");
        while (!fila.isEmpty()) {
            System.out.println(fila.remover());  // 50, 40, 30, 20, 10
        }
    }
}
