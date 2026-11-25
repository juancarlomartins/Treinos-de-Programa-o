#include <stdio.h>
#include <omp.h>

int main(){
    printf("=== Resolução da questão 5 ===\n");

    int valor_config = 0;

    // dispara a região paralela com exatamente 4 threads 

    #pragma omp parallel num_threads(4) shared(valor_config)
    {
        int id = omp_get_thread_num(); // variável privada na pilha de cada thread

        // 1. Todas as threads imprimem o início da fase inicial [3,6]
        printf("Thread %d iniciou a fase inicial.\n", id);

        // 2. apenas uma única thread (a primeira que chegar) executa a leitura [2,3]
        #pragma omp single
        {
            printf("[Thread %d] Exclusivo: lendo valor de configuração...\n", id);

            printf("Digite um numero inteiro para a configuração: ");
            scanf("%d", &valor_config);
            printf("\n >>> [Thread %d] Leitura concluída! valor lido: %d\n\n", id, valor_config);
        } // ==> barreira implícita aqui...

        printf("[Thread %d] continuando o fluxo com valor_config = %d.\n", id, valor_config);

    } // ==> barreira implícita para o fim da região paralela.

    return 0;
} 