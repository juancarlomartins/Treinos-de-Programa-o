// Segunda questão da lista de Exercicício de Revisão.
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <omp.h>

#define TAM_A 100
#define TAM_B 100000
#define NUM_THREADS 5

int main() {
    srand(time(NULL));
    omp_set_num_threads(NUM_THREADS);


    printf("QUESTAO 02 - ITEM A (100 posicoes, 5 threads)\n");
    int vet1_a[TAM_A], vet2_a[TAM_A], soma_a[TAM_A];

    for (int i = 0; i < TAM_A; i++) {
        vet1_a[i] = rand() % 100;
        vet2_a[i] = rand() % 100;
    }

    #pragma omp parallel num_threads(NUM_THREADS)
    {
        int id = omp_get_thread_num();

        #pragma omp for
        for (int i = 0; i < TAM_A; i++) {
            soma_a[i] = vet1_a[i] + vet2_a[i];
            printf("Thread ID: %d | Iteracao: %2d | Valor Calculado: %d + %d = %d\n",
                   id, i, vet1_a[i], vet2_a[i], soma_a[i]);
        }
    }

    printf("\nQUESTAO 02 - ITEM B (100.000 posicoes, reduction e single)\n");
    int *vet_pares = (int *) malloc(TAM_B * sizeof(int));
    int *vet_impares = (int *) malloc(TAM_B * sizeof(int));

    if (vet_pares == NULL || vet_impares == NULL) {
        printf("Erro ao alocar memoria.\n");
        return 1;
    }

    for (int i = 0; i < TAM_B; i++) {
        vet_pares[i]   = (rand() % 50) * 2;      
        vet_impares[i] = (rand() % 50) * 2 + 1;   
    }

    long long int soma_pares = 0;
    long long int soma_impares = 0;
    long long int produto_final = 0;

    #pragma omp parallel num_threads(NUM_THREADS)
    {

        #pragma omp for reduction(+:soma_pares)
        for (int i = 0; i < TAM_B; i++) {
            soma_pares += vet_pares[i];
        }

        #pragma omp for reduction(+:soma_impares)
        for (int i = 0; i < TAM_B; i++) {
            soma_impares += vet_impares[i];
        }

        #pragma omp single
        {
            produto_final = soma_pares * soma_impares;
            printf("Executado pela Thread %d (diretiva single):\n", omp_get_thread_num());
            printf(" -> Soma do vetor de pares:   %lld\n", soma_pares);
            printf(" -> Soma do vetor de impares: %lld\n", soma_impares);
            printf(" -> Produto final dos vetores: %lld\n", produto_final);
        }
    }

    free(vet_pares);
    free(vet_impares);

    return 0;
}