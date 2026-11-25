// Execução única com Barreira Implícita....
// Trabalhando #pragma omp single

#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

int main (){
    int config = 0;
    float inicio, fim;

    inicio = omp_get_wtime();

    omp_set_num_threads(4);

    // SINGLE: qualquer thread disponível executa o bloco.
    // MASTER: apenas a thread 0 executa essa bloco, o resto das threads segue.

    #pragma omp parallel shared(config)
    {
        // exemplo usando o single para as threads.
        #pragma omp single
        {
            printf("[SINGLE] - Thread %d inicializando...\n", omp_get_thread_num());
        } // barreira implícita aqui
        #pragma omp master
        {
            printf("[MASTER] - Thread %d inicializando...\n", omp_get_thread_num());
        } // barreira implícita aqui
        #pragma omp single
        {
            printf("[SINGLE] - Thread %d inicializando...\n", omp_get_thread_num());
        } // barreira implícita aqui
    } // ==> fim da região paralela.

    fim = omp_get_wtime();

    printf("\n=== métricas de execução ===\n");
    printf("tempo de execução: %.6f segundos.\n", fim - inicio);
    printf("Precisão do relógio: %.9f segundos.\n", omp_get_wtick());
    printf("\n === Fim do Programa ===\n");

    return 0;
}