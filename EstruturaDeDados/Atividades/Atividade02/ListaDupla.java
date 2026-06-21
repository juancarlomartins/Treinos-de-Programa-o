// Juan Carlo Teles Martins

class NoDuplo {
    int dado;
    NoDuplo anterior;
    NoDuplo proximo;

    NoDuplo(int dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}

// Lista Duplamente Encadeada
class ListaDupla {
    private NoDuplo inicio;
    private NoDuplo fim;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
    }

    // Inserir no início
    public void inserirInicio(int valor) {
        NoDuplo novo = new NoDuplo(valor);
        if (inicio == null) {
            inicio = fim = novo;
            return;
        }
        novo.proximo = inicio;
        inicio.anterior = novo;
        inicio = novo;
    }

    // Inserir em posição intermediária
    public void inserirMeio(int valor, int posicao) {
        if (posicao < 0) return;
        if (posicao == 0) {
            inserirInicio(valor);
            return;
        }

        NoDuplo novo = new NoDuplo(valor);
        NoDuplo atual = inicio;
        for (int i = 0; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null) return;
        novo.proximo = atual.proximo;
        if (atual.proximo != null) {
            atual.proximo.anterior = novo;
        } else {
            fim = novo; // se inseriu no final
        }
        atual.proximo = novo;
        novo.anterior = atual;
    }

    // Inserir no final
    public void inserirFinal(int valor) {
        NoDuplo novo = new NoDuplo(valor);
        if (fim == null) {
            inicio = fim = novo;
            return;
        }
        fim.proximo = novo;
        novo.anterior = fim;
        fim = novo;
    }

    // Remover do início
    public void removerInicio() {
        if (inicio == null) return;
        if (inicio == fim) {
            inicio = fim = null;
            return;
        }
        inicio = inicio.proximo;
        inicio.anterior = null;
    }

    // Remover de posição intermediária
    public void removerMeio(int posicao) {
        if (inicio == null || posicao < 0) return;
        if (posicao == 0) {
            removerInicio();
            return;
        }

        NoDuplo atual = inicio;
        for (int i = 0; i < posicao && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null) return;
        if (atual == fim) {
            removerFinal();
            return;
        }

        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;
    }

    // Remover do final
    public void removerFinal() {
        if (fim == null) return;
        if (inicio == fim) {
            inicio = fim = null;
            return;
        }
        fim = fim.anterior;
        fim.proximo = null;
    }

    // Buscar elemento
    public boolean buscar(int valor) {
        NoDuplo atual = inicio;
        while (atual != null) {
            if (atual.dado == valor) return true;
            atual = atual.proximo;
        }
        return false;
    }

    // Exibir lista 
    public void exibir() {
        NoDuplo atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}