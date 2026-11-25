// Exercicío sobre Região Paralela e Modelo SPMD

#include <stdio.h>
#include <omp.h>

// Exemplo rápido sobre a execução do modelo fork-join do OpenMP

int main (){
    printf("=== Questão 1 - SPMD e Fork-Join ===\n\n");

    // Iniciando a região paralela do código + a cláusula para definir threads.
    #pragma omp parallel num_threads(3)
    {
        int thread_id = omp_get_thread_num(); // pegando o número da Thread
        printf("[Thread %d] começou sua tarefa, %d de %d\n", thread_id, thread_id, omp_get_num_threads());
    }
    // Fim da região paralela

    printf("\n === fim do programa ==\n\n");

    return 0;
}

// omp_get_thread_num() ==> para pegar o número específico da thread.
// omp_get_num_threads() ==> para pegar o número TOTAL de threadsd da região.
// omp_set_thread_num() ==> definir numero de threads.
// num_threads()[Cláusula] ==> também defini o número de threads.