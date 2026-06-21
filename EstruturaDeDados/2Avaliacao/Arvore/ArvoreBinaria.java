public class ArvoreBinaria {
    private class No {
        int valor;
        No esquerda;
        No direita;
        
        No(int valor) {
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }
    }
    
    private No raiz;
    
    public ArvoreBinaria() {
        this.raiz = null;
    }
    
    // Inserir (árvore binária de busca)
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }
    
    private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);  // cria novo nó
        }
        
        if (valor < no.valor) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);  // vai para esquerda
        } else if (valor > no.valor) {
            no.direita = inserirRecursivo(no.direita, valor);    // vai para direita
        }
        // se igual, não insere (valores duplicados não permitidos)
        return no;
    }
    
    // Buscar
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }
    
    private boolean buscarRecursivo(No no, int valor) {
        if (no == null) return false;
        if (no.valor == valor) return true;
        
        if (valor < no.valor) {
            return buscarRecursivo(no.esquerda, valor);
        } else {
            return buscarRecursivo(no.direita, valor);
        }
    }
    
    // Percorrer em ordem (esquerda - raiz - direita)
    public void percorrerEmOrdem() {
        emOrdemRecursivo(raiz);
        System.out.println();
    }
    
    private void emOrdemRecursivo(No no) {
        if (no != null) {
            emOrdemRecursivo(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdemRecursivo(no.direita);
        }
    }
}
