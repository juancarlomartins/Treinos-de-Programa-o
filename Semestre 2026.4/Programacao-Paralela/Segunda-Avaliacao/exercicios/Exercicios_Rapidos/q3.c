// Acumulação Segura com redução - #pragma omp reduction.

#include <stdio.h>
#include <omp.h>
#include <stdlib.h>

#define N 10

// Conceitos importantes de uso do relógio
// omp_get_wtime() para iniciar e finalizar a contagem de tempo de execução.

int main(){
    // Construção da diretiva reduction com análise de tempo
    int i, id;
    double inicio, fim;
    int soma = 0;
    int vetor[N];

    // criando vetor com numero 10.
    for (int i = 0; i < N; i++){
        vetor[i] = 10;
        
        //printf("posição %d valor: %d\n", i, vetor[i]);
    }

    omp_set_num_threads(2); // ==> definindo o número de threads que vamos usar.

    // Iniciando a região parelela
    inicio = omp_get_wtime(); // ==> função para iniciar a contagem de tempo de execução.

    printf("=== Operações em tempo real ===\n");
    #pragma omp parallel for reduction(+:soma) shared(vetor)
    for(int i = 0; i < N; i++){
        id = omp_get_thread_num();
        printf("[Thread %d] pegou a posição %d\n", id,i);
        soma = soma + vetor[i]; // ==> somando todos os números do array.

    } // ==> fim da região paralela desse código

    fim = omp_get_wtime(); // ==> para pegar o tempo final da execução do código.

    //total = fim - inicio; // ==> calculando o tempo total de execução.

    printf("==== resultados ====\n");
    printf("Soma vetor: %d.\n", soma);
    printf("Tempo: %.6f segundos\n", fim - inicio);
    printf("precisão do relógio: %.9f segundos\n", omp_get_wtick());

    //free(vetor);

    return 0;
}
