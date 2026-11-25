#include <stdio.h>
#include <omp.h>

int main(){
    // Iniciando a região paralela....
    #pragma omp parallel num_threads(3)
    {
        int id = omp_get_thread_num();
        int total = omp_get_num_threads();
        printf("Thread %d de %d ativa!\n", id, total);
    } // ==> fim da região paralela.

    return 0;
}