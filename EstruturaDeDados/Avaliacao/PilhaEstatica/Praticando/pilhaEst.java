package EstruturaDeDados.Avaliacao.PilhaEstatica.Praticando;
// Juan Carlo Teles Martins
import java.util.Scanner;

// Fazendo minha própria implementação de pilha estática.          


public class pilhaEst {
    //  Colocando os atributos principais dessa nova classe.
    private int[] dados;
    private int capacidade;   
    private int topo;

    public pilhaEst(int capacidade){
        this.capacidade = capacidade; // Instanciando essa nova pilha que vai ser criada.  
        this.dados = new int[capacidade]; // Defininddo o tamanho máximo da pilha.

        // Agora vamos iniciar o topo da pilha com -1 (para pilha vazia).
        this.topo = -1; // Isso significa que não tem nenhum elemento na pilha.

        System.out.println("Pilha Criada com a capacidade: " + capacidade);
    }

    // feito isso agora vamos para as funções que esse objeto vai ter.
    // ===== PARA VERIFICAR SE A PILHAR ESTÁ VAZIA =======
    public boolean isEmpty(){
        //(Significa que pilha está vazia stack UNDERFLOW);
        return topo == -1; // Isso vai retornar true se estiver vazia e false caso não esteja vazia.
    }
    // ===== PARA VERIFICAR SE A PILHA ESTÁ CHEIA ======
    public boolean isFull(){
        // Se o topo chegou no último indíce(Significa que pilha está vazia stack overflow);
        return topo == capacidade-1; // Isso vai retornar true se estiver cheia e false caso não esteja cheia.
    }

    // Criando método para inserir um elemento na pilha.
    public void push(int elemento){
        // Se estiver cheia.
        if(isFull()){
            System.out.println("Erro! a pilha está cheia, não é possível inserir um novo elemento.");
        }

        // Se não estiver cheia.
        topo++; //Incrementa um na posição.

        dados[topo] = elemento; // coloca o elemento na posição do topo.

        System.out.println("Inserido: " + elemento + ", Posição: " + topo); // Para visualizar o que aconteceu nesse passo.
    }

    // Para remover um elemento da lista.
    public int pop(){
        // Verificar se a pilha está vazia
        if(isEmpty()){
            System.out.println("Erro! não é possível remover, pois a pilha está vazia.");
        }

        // se não estiver vazia...
        // 1. guarda o elemnto que está no topo
        int elementoRemovido = dados[topo];

        // decrementa em 1 elemento o array.
        topo--; // remove um elemento logicamente.

        // Mostrando a mensagem de sucesso ao remover.
        System.out.println("Removido: " + elementoRemovido + " da posição: " + (topo + 1));

        return elementoRemovido;
    }
    // Método para ver o topo da lista.
    public int peek(){
        if(isEmpty()){
            System.out.println("A lista está vazia.");
            return -1;
        }

        // retornando o elemento sem remover da pilha
        System.out.println("Topo: " + dados[topo]);
        return dados[topo];
    }
    // Método para exibir a pilha completa.
    public void exibir(){
        if(isEmpty()){
            System.out.println("A pilha está vazia.");
        }

        System.out.print("Pilha: [");
        for (int i = 0; i <= topo; i++){
            System.out.print(dados[i]);
            if (i < topo){
                System.out.print(" -> ");
            }
        }
        System.out.print("] <- topo.\n");
    }

    public int size(){
        return topo+1;
    }

    public static void main(String[] args) {
        // Começando a treinar com a pilha estática.
        System.out.println("Seja bem-vindo.");
        System.out.println("Vamos trabalhar com Pilha estatica");
        System.out.println("Criando uma pilha...");
        pilhaEst pilha = new pilhaEst(5);

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println("Pilha Atual:");
        pilha.exibir();

        System.out.println("\nRemovendo dois elementos.");
        pilha.pop();
        pilha.pop();
        System.out.println("Pilha Atual:");
        pilha.exibir();

        System.out.println("\nMais operações:");
        pilha.push(4);
        pilha.exibir();
        pilha.peek();
    }
}