public class ListaDuplamenteEncadeada {
    
    // Classe interna Nó
    private class No {
        int dado;          // valor armazenado
        No anterior;       // referência para o nó anterior
        No proximo;        // referência para o próximo nó
        
        // Construtor do nó
        No(int dado) {
            this.dado = dado;
            this.anterior = null;
            this.proximo = null;
        }
    }
    
    private No cabeca;      // primeiro nó da lista
    private No fim;         // último nó da lista
    private int tamanho;    // quantidade de elementos
    
    // Construtor - lista vazia
    public ListaDuplamenteEncadeada() {
        this.cabeca = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    // Verifica se a lista está vazia
    public boolean isEmpty() {
        return cabeca == null;
    }
    
    // Retorna o tamanho da lista
    public int getTamanho() {
        return tamanho;
    }
    
    // ============ INSERÇÕES ============
    
    // 1. Inserir no início - O(1)
    public void inserirInicio(int elemento) {
        No novoNo = new No(elemento);
        
        if (isEmpty()) {
            // Se vazia, o novo nó é cabeça e fim
            cabeca = novoNo;
            fim = novoNo;
        } else {
            // Novo nó aponta para a antiga cabeça
            novoNo.proximo = cabeca;
            // Antiga cabeça aponta para o novo nó (anterior)
            cabeca.anterior = novoNo;
            // Atualiza a cabeça
            cabeca = novoNo;
        }
        tamanho++;
        System.out.println("Inserido no início: " + elemento);
    }
    
    // 2. Inserir no final - O(1)
    public void inserirFim(int elemento) {
        No novoNo = new No(elemento);
        
        if (isEmpty()) {
            // Se vazia, o novo nó é cabeça e fim
            cabeca = novoNo;
            fim = novoNo;
        } else {
            // Fim atual aponta para o novo nó
            fim.proximo = novoNo;
            // Novo nó aponta para o fim atual (anterior)
            novoNo.anterior = fim;
            // Atualiza o fim
            fim = novoNo;
        }
        tamanho++;
        System.out.println("Inserido no final: " + elemento);
    }
    
    // 3. Inserir em posição específica - O(n)
    public void inserirPosicao(int elemento, int posicao) {
        // Valida posição
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida!");
            return;
        }
        
        // Se for no início
        if (posicao == 0) {
            inserirInicio(elemento);
            return;
        }
        
        // Se for no final
        if (posicao == tamanho) {
            inserirFim(elemento);
            return;
        }
        
        // Inserir no meio
        No novoNo = new No(elemento);
        No atual = cabeca;
        
        // Navega até a posição
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        
        // Ajusta os ponteiros
        novoNo.anterior = atual.anterior;
        novoNo.proximo = atual;
        atual.anterior.proximo = novoNo;
        atual.anterior = novoNo;
        
        tamanho++;
        System.out.println("Inserido na posição " + posicao + ": " + elemento);
    }
    
    // ============ REMOÇÕES ============
    
    // 1. Remover do início - O(1)
    public int removerInicio() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return -1;
        }
        
        int elemento = cabeca.dado;
        
        // Se só tem um elemento
        if (cabeca == fim) {
            cabeca = null;
            fim = null;
        } else {
            // Nova cabeça é o próximo
            cabeca = cabeca.proximo;
            // Nova cabeça não tem anterior
            cabeca.anterior = null;
        }
        
        tamanho--;
        System.out.println("Removido do início: " + elemento);
        return elemento;
    }
    
    // 2. Remover do final - O(1)
    public int removerFim() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return -1;
        }
        
        int elemento = fim.dado;
        
        // Se só tem um elemento
        if (cabeca == fim) {
            cabeca = null;
            fim = null;
        } else {
            // Novo fim é o anterior
            fim = fim.anterior;
            // Novo fim não tem próximo
            fim.proximo = null;
        }
        
        tamanho--;
        System.out.println("Removido do final: " + elemento);
        return elemento;
    }
    
    // 3. Remover elemento específico - O(n)
    public boolean removerElemento(int elemento) {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return false;
        }
        
        // Se for o primeiro
        if (cabeca.dado == elemento) {
            removerInicio();
            return true;
        }
        
        // Se for o último
        if (fim.dado == elemento) {
            removerFim();
            return true;
        }
        
        // Busca o elemento no meio
        No atual = cabeca;
        while (atual != null && atual.dado != elemento) {
            atual = atual.proximo;
        }
        
        // Se não encontrou
        if (atual == null) {
            System.out.println("Elemento " + elemento + " não encontrado!");
            return false;
        }
        
        // Remove o elemento do meio
        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;
        
        tamanho--;
        System.out.println("Removido: " + elemento);
        return true;
    }
    
    // ============ BUSCAS ============
    
    // Buscar elemento - O(n)
    public boolean buscar(int elemento) {
        No atual = cabeca;
        
        while (atual != null) {
            if (atual.dado == elemento) {
                System.out.println("Elemento " + elemento + " encontrado!");
                return true;
            }
            atual = atual.proximo;
        }
        
        System.out.println("Elemento " + elemento + " não encontrado!");
        return false;
    }
    
    // Buscar pela posição - O(n)
    public int buscarPorPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida!");
            return -1;
        }
        
        No atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        
        System.out.println("Elemento na posição " + posicao + ": " + atual.dado);
        return atual.dado;
    }
    
    // ============ PERCORRIMENTO ============
    
    // Percorrer do início para o fim
    public void percorrerFrente() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }
        
        System.out.print("Percorrendo (frente): [");
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado);
            if (atual.proximo != null) {
                System.out.print(" ↔ ");
            }
            atual = atual.proximo;
        }
        System.out.println("]");
    }
    
    // Percorrer do fim para o início
    public void percorrerTras() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }
        
        System.out.print("Percorrendo (trás): [");
        No atual = fim;
        while (atual != null) {
            System.out.print(atual.dado);
            if (atual.anterior != null) {
                System.out.print(" ↔ ");
            }
            atual = atual.anterior;
        }
        System.out.println("]");
    }
    
    // ============ MÉTODO MAIN PARA TESTES ============
    
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        
        System.out.println("=== TESTANDO LISTA DUPLAMENTE ENCADEADA ===\n");
        
        // Inserções
        lista.inserirFim(10);
        lista.inserirFim(20);
        lista.inserirFim(30);
        lista.inserirInicio(5);
        lista.inserirPosicao(15, 2);
        
        System.out.println("\nTamanho da lista: " + lista.getTamanho());
        
        // Percorrendo
        lista.percorrerFrente();
        lista.percorrerTras();
        
        // Buscas
        System.out.println("\n=== BUSCAS ===");
        lista.buscar(20);
        lista.buscar(100);
        lista.buscarPorPosicao(3);
        
        // Remoções
        System.out.println("\n=== REMOÇÕES ===");
        lista.removerInicio();
        lista.removerFim();
        lista.removerElemento(20);
        
        System.out.println("\nLista após remoções:");
        lista.percorrerFrente();
        System.out.println("Tamanho final: " + lista.getTamanho());
    }
}