// Juan Carlo Teles Martins

package EstruturaDeDados.Atividade02;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Lista Simples ---");
        ListaSimples ls = new ListaSimples();
        ls.inserirFinal(10);
        ls.inserirFinal(20);
        ls.inserirInicio(5);
        ls.inserirMeio(15, 2);  // posição 2
        ls.exibir(); // 5 10 15 20

        ls.removerInicio();    
        ls.exibir(); // 10 15 20

        ls.removerMeio(1);
        ls.exibir(); // 10 20

        ls.removerFinal();
        ls.exibir(); // 10

        System.out.println("Buscar 10: " + ls.buscar(10)); // true
        System.out.println("Buscar 99: " + ls.buscar(99)); // false

        System.out.println("\n--- Lista Duplamente Encadeada ---");
        ListaDupla ld = new ListaDupla();
        ld.inserirFinal(100);
        ld.inserirFinal(200);
        ld.inserirInicio(50);
        ld.inserirMeio(150, 2);
        ld.exibir(); // 50 100 150 200

        ld.removerInicio();
        ld.exibir(); // 100 150 200

        ld.removerMeio(1);
        ld.exibir(); // 100 200

        ld.removerFinal();
        ld.exibir(); // 100

        // Fazendo a busca de elementos
        System.out.println("Buscar 100: " + ld.buscar(100));
        System.out.println("Buscar 999: " + ld.buscar(999));
    }
}