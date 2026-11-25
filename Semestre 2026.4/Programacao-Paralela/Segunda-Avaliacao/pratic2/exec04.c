#include <stdio.h>
#include <omp.h>

int main(){
    printf("=== Treinamento da diretiva section e sections ===\n\n");

    #pragma omp parallel sections num_threads(4)
    {
        // Primeira atividade.
        #pragma omp section
        {
            printf("[Thread %d] começou a tarefa A.\n", omp_get_thread_num());
        }
        // Segunda Atividade
        #pragma omp section
        {
            printf("[Thread %d] começou a tarefa B.\n", omp_get_thread_num());
        }
        // Terceira Atividade
        #pragma omp section
        {
            printf("[Thread %d] começou a tarefa C.\n", omp_get_thread_num());
        }
        // Quarta Atividade
        #pragma omp section
        {
            printf("[Thread %d] começou a tarefa D.\n", omp_get_thread_num());
        }
    } // ==> Fim da região paralela

    return 0;
}