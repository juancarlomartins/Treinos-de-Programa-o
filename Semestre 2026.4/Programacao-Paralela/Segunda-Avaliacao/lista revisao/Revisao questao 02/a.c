// resolução da questão 2 da lista de revisão disponibilizada em sala...

#include <stdio.h> // ==> para usar o printf
#include <stdlib.h> // ==> para usar os numeros aleatórios brabos
#include <time.h>
#include <omp.h> // ==> para usar as diretivas do omp e funções

#define TAM_A 100

int main() {
    int v1[TAM_A], v2[TAM_A], vsoma[TAM_A];


    // preenchendo o vetor com números aleatórios entre 1 e 50.
    srand(42);
    for (int i = 0; i < TAM_A; i++){
        v1[i] = (rand() % 50 + 1);
        v2[i] = (rand() % 50 + 1);
    }

    printf("=== Resolução questão 2 item A - com 5 threads ===\n");
    // iniciando a região paralela do codigo...
    #pragma omp parallel for num_threads(5)
    for(int i = 0; i < TAM_A; i++){
        vsoma[i] = v1[i] + v2[i];
        int id  = omp_get_thread_num();
        printf("[Thread %d] Iteração: %2d | Calculando: %d + %d = %d.\n", id, i, v1[i], v2[i], vsoma[i]);

    } // ==> fim da região paralela braba

    printf("\n==== Fim do progama ====\n\n");

    return 0;
}