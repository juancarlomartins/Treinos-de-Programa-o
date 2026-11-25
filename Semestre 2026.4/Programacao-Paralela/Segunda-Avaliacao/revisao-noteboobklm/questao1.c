#include <stdio.h>
#include <omp.h>


//Questão 1 do treino básico de OpenMP criado pelo Gemini
// o foco é entender a sintaxe básica e como o código paraelo
// se comporta durante a execução de algoritmos.
int main(){
  
  // Definindo o número de threads que vamos utilizar nessa tarefa...
  omp_set_num_threads(6);
  #pragma omp parallel num_threads(6)
  {
    //printf("==== Exercício 01 da Lista ===\n mostrar o numero de Threads\n\n");

    int id = omp_get_thread_num(); // variável que cada thread vai usar em paralelo.

    printf("[Thread %d] chegou, de um total de %d\n", id, omp_get_num_threads());
    
    
  } // ===> Fim da região paralela barreira implícita para as threads;

  return 0;
}
