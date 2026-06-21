public class PesquisaLinear {
    public static int pesquisar(int[] array, int alvo) {
        // Percorre elemento por elemento
        for (int i = 0; i < array.length; i++) {
            if (array[i] == alvo) {
                return i;  // retorna a posição se encontrar
            }
        }
        return -1;  // retorna -1 se não encontrar
    }
    
    // Exemplo de uso
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 9, 3};
        int posicao = pesquisar(numeros, 8);
        if (posicao != -1) {
            System.out.println("Encontrado na posição: " + posicao);
        } else {
            System.out.println("Não encontrado");
        }
    }
}
