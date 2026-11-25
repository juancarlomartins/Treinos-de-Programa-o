#include <stdio.h>
#include <omp.h>
#include <unistd.h>

int main(){
    printf("=== Treinamento de uso do pragma omp single ===\n");
    // iniciando a região paralela com 4 threads
    #pragma omp parallel num_threads(4)
    {
        // apenas a primeira thread que chegar passa aqui
        #pragma omp single 
        {
            int id = omp_get_thread_num();
            printf("Thread %d AVISO UNICO: inicializando os recursos...\n", id);
            sleep(id + 2); // ==> simulando um processamento de dados...
            printf("Thread %d tarefa completa.\n\n", id);

        } // barrreira implícita

        printf("Thread %d liberada para a computação.\n", omp_get_thread_num());

    } // ==> fim da região paralela....

    return 0;
}