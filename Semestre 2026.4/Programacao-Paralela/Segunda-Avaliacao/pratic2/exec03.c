#include <stdio.h>
#include <omp.h>

int main(){
    int numeros[6] = {5, 10, 15, 20, 25, 30};
    int soma = 0;

    #pragma omp parallel for num_threads(4) reduction(+:soma)
        for(int i = 0; i < 6; i++){
            int id = omp_get_thread_num();
            soma+= numeros[i]; // ==> somando todos os valores do array e acumulando...
            printf("=> Thread %d, soma atual: %d\n",id, soma);
        }

    printf("Soma total acumulada: %d\n", soma);
    return 0;
}

// ==> TREINAMENTO USANDO O #PRAGMA OMP PARALLEL FOR REDUCTION [CLÁUSULA] [CLÁUSULA]