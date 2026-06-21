public class PilhaDinamica {
    // Classe interna Nó
    private class No {
        int dado;
        No proximo;
        
        No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }
    
    private No topo;  // referência ao nó do topo
    
    public PilhaDinamica() {
        this.topo = null;  // pilha vazia
    }
    
    public boolean isEmpty() {
        return topo == null;
    }
    
    // Inserir - cria novo nó e coloca no topo
    public void push(int elemento) {
        No novoNo = new No(elemento);
        novoNo.proximo = topo;  // novo nó aponta para o antigo topo
        topo = novoNo;          // atualiza o topo
        System.out.println("Inserido: " + elemento);
    }
    
    // Remover - remove o nó do topo
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        int elemento = topo.dado;
        topo = topo.proximo;  // topo agora aponta para o próximo
        System.out.println("Removido: " + elemento);
        return elemento;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return topo.dado;
    }
}
