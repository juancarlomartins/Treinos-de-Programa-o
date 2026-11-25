#include <stdio.h>
#include <omp.h>

int main(){
    printf("=== Treinamento com a diretiva omp atomic update ===\n");
    float inicio, fim;
    // O objetivo desse codigo é incrementar variáveis compartilhadas com custo mínimo de sincronização
    inicio = omp_get_wtime();
    int contador = 0;
    #pragma omp parallel for num_threads(4)
    for(int i = 0; i < 1000; i++){
        // atualize o contador compartilhado de forma atômica via hardware...
        #pragma omp atomic update
        contador++;
    }
    fim = omp_get_wtime();
    printf("Valor final do contador: %d (valor esperado: 1000)\n", contador);
    printf("Tempo de execução: %.6f segundos.\n", fim - inicio);


    return 0;
}