package EstruturaDeDados.Atividade;

class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}




public class FilaDinamica {
    private No inicio;
    private No fim;

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
    }

    public void enfileirar(int valor) {
        No novoNo = new No(valor);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
            System.out.println("Inserido: " + valor);
            return;
        }

        if (valor <= inicio.valor) {
            novoNo.proximo = inicio;
            inicio = novoNo;
            System.out.println("Inserido: " + valor);
            return;
        }

        No atual = inicio;
        while (atual.proximo != null && atual.proximo.valor < valor) {
            atual = atual.proximo;
        }

        novoNo.proximo = atual.proximo;
        atual.proximo = novoNo;

        if (novoNo.proximo == null) {
            fim = novoNo;
        }

        System.out.println("Inserido: " + valor);
    }

    public Integer desenfileirar() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return null;
        }
        int valorRemovido = inicio.valor;
        inicio = inicio.proximo;
        
        if (inicio == null) {
            fim = null;
        }
        return valorRemovido;
    }

    public void exibir() {
        if (inicio == null) {
            System.out.println("Fila: [ ]");
            return;
        }
        No atual = inicio;
        System.out.print("Fila: [ ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        FilaDinamica fila = new FilaDinamica();

        fila.enfileirar(10);
        fila.exibir();

        fila.enfileirar(7);
        fila.exibir();

        fila.enfileirar(5);
        fila.exibir();

        fila.enfileirar(1);
        fila.exibir();

        fila.enfileirar(11);
        fila.exibir();
    }
}

