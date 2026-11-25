#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

#define TAM_B 100000

int main() {
    // Alocação dinâmica para suportar 100.000 posições
    long long *pares = (long long*) malloc(TAM_B * sizeof(long long));
    long long *impares = (long long*) malloc(TAM_B * sizeof(long long));

    if (pares == NULL || impares == NULL) {
        printf("Erro ao alocar memoria!\n");
        return 1;
    }
    // -------------------------------------------------------------------
    // ETAPA 1: INICIALIZAÇÃO (Preenchimento dos vetores)
    // -------------------------------------------------------------------
    for (int i = 0; i < TAM_B; i++) {
        pares[i] = (long long)(i + 1) * 2;  // 2, 4, 6, 8...
        impares[i] = (long long)(i * 2) + 1; // 1, 3, 5, 7...
    }
    long long soma_pares = 0;
    long long soma_impares = 0;
    long double produto_final = 0.0;
    printf("=== Executando Questao 02 - Item (b) com 100.000 Posicoes ===\n\n");
    // -------------------------------------------------------------------
    // ETAPA 2: REGIÃO PARALELA (Processamento com OpenMP)
    // -------------------------------------------------------------------
    #pragma omp parallel num_threads(5)
    {
        // 1. Soma dos pares com reduction
        #pragma omp for reduction(+:soma_pares)
        for (int i = 0; i < TAM_B; i++) {
            soma_pares += pares[i];
        }
        // 2. Soma dos ímpares com reduction
        #pragma omp for reduction(+:soma_impares)
        for (int i = 0; i < TAM_B; i++) {
            soma_impares += impares[i];
        }
        // 3. Multiplicação final executada exclusivamente por UMA thread
        #pragma omp single
        {
            int id = omp_get_thread_num();
            produto_final = (long double)soma_pares * (long double)soma_impares;
            printf("[Thread %d executou a diretiva SINGLE]:\n", id);
            printf(" -> Soma Total dos Pares   : %lld\n", soma_pares);
            printf(" -> Soma Total dos Impares : %lld\n", soma_impares);
            printf(" -> Multiplicacao dos dois  : %.2Le (Notacao Cientifica)\n", produto_final);
        }
        // Barreira implícita: nenhuma thread sai daqui antes da multiplicação terminar
    }
    // -------------------------------------------------------------------
    // ETAPA 3: FINALIZAÇÃO E LIBERAÇÃO DE MEMÓRIA
    // -------------------------------------------------------------------
    free(pares);
    free(impares);

    return 0;
}