#include <stdio.h>
#include <omp.h>
#include <unistd.h> // ==> biblioteca para usar a função sleep.

int main(){
    printf("=== Teste de Diretiva #pragma omp barrier ===\n\n");

    float fim, inicio;

    inicio = omp_get_wtime();

    // Criando o região paralela.
    #pragma omp parallel num_threads(4)
    {
        int id = omp_get_thread_num();

        // 1. cada thread dorme um tempo diferente (thread 0 dorme 1s, thread 2 dorme 2s).
        int tempo_espera = id + 2;
        printf("[Thread %d] Iniciou a fase 1 (vai trabalhar por %d segundos...\n", id, tempo_espera);
        sleep(tempo_espera); // ==> vai simular um processamento pesado....

        printf("[Thread %d] Concluiu a fase 1! aguardando os colegas na barreira...\n", id);

        //2. Barreira Explícita: ninguém passa daqui até que cheguem todos na barreira.
        #pragma omp barrier

        //3. Fase 2: só executa após a Thread 3 (a mais lenta terminar)

        printf(">>> Thread %d Liberada para a fase 2!\n", id);
    }

    fim = omp_get_wtime();

    printf("\n=== métricas de execução ===\n");
    printf("tempo de execução: %.6f segundos.\n", fim - inicio);
    printf("Precisão do relógio: %.9f segundos.\n", omp_get_wtick());

    printf("\n=== Fim do programa === \n");
    return 0;
}