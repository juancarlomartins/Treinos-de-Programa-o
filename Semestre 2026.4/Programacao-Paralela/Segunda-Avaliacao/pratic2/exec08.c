#include <stdio.h>
#include <omp.h>

int main(){
    printf("=== Treinando o ciclo de vida das travas (Lock) ===\n");

    // modelo de como declarar a trava
    omp_lock_t trava;

    int recurso = 0;
    float inicio, fim;

    inicio = omp_get_wtime();

    // agora vamos iniciar a região paralela do codigo
    #pragma omp parallel num_threads(3)
    {
        // solicitação de uso da chave
        omp_set_lock(&trava);

        // Thread trabalhando sozinha no recurso, as outras sem a chave aguardam
        printf("[Thread %d] acessou o recurso! modificando...\n", omp_get_thread_num());
        recurso++;
        printf("[Thread %d] liberou o recurso!\n\n", omp_get_thread_num());
        // Fim da operação exclusiva individual...

        // Liberando a chave para a próxima thread.
        omp_unset_lock(&trava);
    }

    fim =  omp_get_wtime();

    printf("Resultado final do recurso compartilhado: %d\n", recurso);
    printf("Tempo de execução: %.6f segundos.\n", fim - inicio);
    printf("Precisão do Relógio: %.9f segundos.\n", omp_get_wtick());
    printf("Fim do programa.\n\n");

}