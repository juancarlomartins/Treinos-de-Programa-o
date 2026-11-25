// codigo para distribuir um array para e threads
#include <stdio.h>
#include <omp.h>

#define N 12

int main(){
    int vetor[N];

    // vamos paralelizar esse vetor com 4 threads....
    printf("=== Esse codigo multiplica todos os indices por 10 ===\n");
    #pragma omp parallel for num_threads(4)
    for(int i = 0; i < N; i++){
        vetor[i] = i * 10;
        printf("Thread %d processou o indice %2d -> vetor[%d] %d\n", omp_get_thread_num(), i, i, vetor[i]);
    } // ==> fim da região paralela...

    return 0;
}