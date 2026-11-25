#include <stdio.h>
#include <omp.h>

#define N 100000

int main(){
    int contador = 0;

    double t_inicio, t_fim;

    printf("=== Teste da Diretiva #pragma omp atomic ===\n");

    printf("Esperado ao final: 4 threads x %d = %d\n\n", N, 4 * N);

    t_inicio = omp_get_wtime(); // ==> inicio da contagem de tempo de execução do algoritmo...

    //1. região paralela com 4 threads

    #pragma omp parallel num_threads(4) shared(contador) // => variável compartilhada
    {
        // 2. Cada thread faz seu próprio laço de 100.000 repetições
        for (int i = 0; i < N; i++){
            ///3. Aqui está a mágina dessa diretiva.
            #pragma omp atomic update
            contador++;
        }
    } // ==> barreira implícita, todas as threads esperam as outras terminarem seus laços...

    t_fim = omp_get_wtime();

    // 4\. Exibição do resultado consolidado 
    printf("Valor final do contador: %d\n", contador); 
    printf("Tempo total: %f segundos\n", t_fim - t_inicio);
    printf("Precisão do relógio: %.9f segundos\n", omp_get_wtick());

    if (contador == 4 * N){
        printf(">>> SUCESSO: nenhuma iteração foi perdida por condição de corrida.\n");
    } else {
        printf(">>> Falha: Ocorreu Data Race! valor esperado não atingido!\n");
    }

    return 0;
}