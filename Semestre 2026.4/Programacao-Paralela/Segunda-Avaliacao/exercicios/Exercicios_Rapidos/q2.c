// código para trabalhar divisão de laço e Escopo de Variáveis.
#include <stdio.h>
#include <omp.h>

#define N 12

int main() {
    int i, id, resultado;
    int contador = 1;
    int vetor[N];

    // preenche o vetor com dados de 1 a até 12.
    for (int i = 0; i < N; i++){
        vetor[i] = contador;
        contador++;
        //printf("Atual:%d\n", vetor[i]); ==> teste para visualizar o vetor preenchendo.
    }

    // Iniciando a região paralela do codigo
    #pragma omp parallel for num_threads(4) shared(vetor)
    for(int i = 0; i < N; i++){
        vetor[i] = vetor[i] * 2;
        resultado = vetor[i];

        int id = omp_get_thread_num();
        printf("[Thread %d], calculou a posição %d, resultado: %d\n", id, vetor[i], resultado);

    } //==> barriera implícita da região paralela.


    printf("\n === Fim do programa ===\n");
    return 0;
}