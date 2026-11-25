// Execução única com Barreira Implícita....
// Trabalhando #pragma omp single, master e barrier

#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

int main (){
    int config = 0;
    int id;
    float inicio, fim;

    inicio = omp_get_wtime();

    omp_set_num_threads(3);

    // SINGLE: qualquer thread disponível executa o bloco.
    // MASTER: apenas a thread 0 executa essa bloco, o resto das threads segue.

    #pragma omp parallel shared(config)
    {

        id = omp_get_thread_num();
        printf("[SINGLE] - Thread %d inicializando tarefa...\n", id);
        sleep(id + 1);

        #pragma omp master
        {
            id = omp_get_thread_num();
            printf("[MASTER] - Thread %d inicializando tarefa...\n", id);
        } // outras threads pulam esse seção.
        sleep( id + 1);

        printf("[Thread %d] Finalizou a tarefa...\n", id);

        #pragma omp barrier // ponto de encontro sincronizado.

        printf("Thread %d disponível para uso...\n",id);

    } // ==> fim da região paralela.

    fim = omp_get_wtime();

    printf("\n=== métricas de execução ===\n");
    printf("tempo de execução: %.6f segundos.\n", fim - inicio);
    printf("Precisão do relógio: %.9f segundos.\n", omp_get_wtick());
    printf("\n === Fim do Programa ===\n");

    return 0;
}