public class ListaEncadeada {
    private class No {
        int dado;
        No proximo;
        
        No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }
    
    private No cabeca;  // primeiro nó da lista
    private int tamanho;
    
    public ListaEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }
    
    // Inserir no início
    public void inserirInicio(int elemento) {
        No novoNo = new No(elemento);
        novoNo.proximo = cabeca;  // novo aponta para a antiga cabeça
        cabeca = novoNo;          // atualiza a cabeça
        tamanho++;
    }
    
    // Inserir no final
    public void inserirFim(int elemento) {
        No novoNo = new No(elemento);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No atual = cabeca;
            while (atual.proximo != null) {  // percorre até o último
                atual = atual.proximo;
            }
            atual.proximo = novoNo;  // último aponta para o novo
        }
        tamanho++;
    }
    
    // Remover um elemento específico
    public void remover(int elemento) {
        if (cabeca == null) return;
        
        // Se for o primeiro elemento
        if (cabeca.dado == elemento) {
            cabeca = cabeca.proximo;
            tamanho--;
            return;
        }
        
        // Busca o elemento
        No atual = cabeca;
        while (atual.proximo != null && atual.proximo.dado != elemento) {
            atual = atual.proximo;
        }
        
        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;  // "pula" o nó a ser removido
            tamanho--;
        }
    }
    
    // Buscar elemento
    public boolean buscar(int elemento) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.dado == elemento) return true;
            atual = atual.proximo;
        }
        return false;
    }
}
