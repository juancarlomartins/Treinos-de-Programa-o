package EstruturaDeDados.Atividade02;

class NoSimples {
    int dado;
    NoSimples proximo;

    NoSimples(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}

// Lista Encadeada Simples
class ListaSimples {
    private NoSimples inicio;

    public ListaSimples() {
        this.inicio = null;
    }

    // Inserir no início
    public void inserirInicio(int valor) {
        NoSimples novo = new NoSimples(valor);
        novo.proximo = inicio;
        inicio = novo;
    }

    // Inserir em posição intermediária
    public void inserirMeio(int valor, int posicao) {
        if (posicao < 0) return;
        if (posicao == 0) {
            inserirInicio(valor);
            return;
        }

        NoSimples novo = new NoSimples(valor);
        NoSimples atual = inicio;
        for (int i = 0; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null) return;
        novo.proximo = atual.proximo;
        atual.proximo = novo;
    }

    // Inserir no final
    public void inserirFinal(int valor) {
        NoSimples novo = new NoSimples(valor);
        if (inicio == null) {
            inicio = novo;
            return;
        }

        NoSimples atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = novo;
    }

    // Remover do início
    public void removerInicio() {
        if (inicio != null) {
            inicio = inicio.proximo;
        }
    }

    // Remover de posição intermediária
    public void removerMeio(int posicao) {
        if (inicio == null || posicao < 0) return;
        if (posicao == 0) {
            removerInicio();
            return;
        }

        NoSimples atual = inicio;
        for (int i = 0; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null || atual.proximo == null) return;
        atual.proximo = atual.proximo.proximo;
    }

    // Remover do final
    public void removerFinal() {
        if (inicio == null) return;
        if (inicio.proximo == null) {
            inicio = null;
            return;
        }

        NoSimples atual = inicio;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = null;
    }

    // Buscar elemento (retorna true se existir)
    public boolean buscar(int valor) {
        NoSimples atual = inicio;
        while (atual != null) {
            if (atual.dado == valor) return true;
            atual = atual.proximo;
        }
        return false;
    }

    // Exibir lista 
    public void exibir() {
        NoSimples atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}