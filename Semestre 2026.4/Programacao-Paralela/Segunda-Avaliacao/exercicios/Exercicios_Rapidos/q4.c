// tarefa heterogeneas (MIND)
// Trabalhando com #pragma omp sections...

#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

//#define N 10

int main() {
    int id, i;
    int A = 10;
    float inicio, fim;

    // iniciando a região paralela do código.
    inicio = omp_get_wtime();

    omp_set_num_threads(2);

    printf(" === resultados dos cálculos ===\n");

    #pragma omp parallel sections
    {
        // Primeira Thread
        #pragma omp section
        {
            id = omp_get_thread_num();
            A = A * 10;
            printf("[Thread %d], calculou a variavel A * 10, resultado: %d\n", id, A);
        }
        // Segunda Thread
        #pragma omp section
        {
            id = omp_get_thread_num();
            A = A * 10;
            printf("[Thread %d], calculou a variavel A * 100, resultado: %d\n", id, A);
        }
    }

    printf("Valor de A após a seçao paralela: %d\n", A);

    fim = omp_get_wtime();

    printf("\n=== Métricas de execução === \n");
    printf("tempo de execução: %.6f segundos.\n", fim - inicio);
    printf("Precisão do relógio: %.9f segundos.\n", omp_get_wtick());
    printf("\n === Fim do Programa ===\n");

    return 0;
}

