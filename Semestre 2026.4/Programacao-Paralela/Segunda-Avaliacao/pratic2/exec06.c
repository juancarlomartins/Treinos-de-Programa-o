#include <stdio.h>
#include <omp.h>

int main(){
    printf("=== Treinamento da diretiva omp master e omp barrier ===\n");

    int a = 0;

    #pragma omp parallel num_threads(4)
    {
        #pragma omp master
        {
            a = 100;
            printf("Thread Mestre (ID %d), configurou a = %d\n", omp_get_thread_num(), a);
        } // ==> as outras threads pulam esse bloco master....

        // Como master não tem barreira implícita, vamos usar o barrier.

       // printf("Teste sem segurança: a = %d na Thread %d\n", a, omp_get_thread_num());

        #pragma omp barrier // ==> todas as threads esperam a master nesse ponto do codigo...
        // desse modo, podemos proteger a integridade dos dados.
        //printf("\n");

        printf("Thread %d lendo com segurança: a = %d\n", omp_get_thread_num(), a);

    } // ==> fim da região paralela...

    return 0;
}