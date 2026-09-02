public class PesquisaBinaria {
    public static int pesquisar(int[] array, int alvo) {
        int esquerda = 0;
        int direita = array.length - 1;
        
        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;  // encontra o meio
            
            if (array[meio] == alvo) {
                return meio;  // encontrou
            }
            
            if (array[meio] < alvo) {
                esquerda = meio + 1;  // busca na metade direita
            } else {
                direita = meio - 1;   // busca na metade esquerda
            }
        }
        return -1;  // não encontrou
    }
    
    // Versão recursiva
    public static int pesquisarRecursivo(int[] array, int alvo, int esquerda, int direita) {
        if (esquerda > direita) return -1;
        
        int meio = (esquerda + direita) / 2;
        
        if (array[meio] == alvo) return meio;
        
        if (array[meio] < alvo) {
            return pesquisarRecursivo(array, alvo, meio + 1, direita);
        } else {
            return pesquisarRecursivo(array, alvo, esquerda, meio - 1);
        }
    }
    
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13};  // já ordenado!
        int posicao = pesquisar(numeros, 7);
        System.out.println("Posição: " + posicao);
    }
}