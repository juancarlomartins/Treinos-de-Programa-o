#include <stdio.h>
#include <omp.h>
#include <time.h>
#include <stdlib.h>

#define TAM 1000

int main(){
  printf("=== resolução questão 4 da lista de revisão ===.\n\n");

  double t_inicio, t_fim, t_total;

  int vetor[TAM];
  int maior, menor;

  //1. vamos criar o vetor e preencher com valores aleatórios
  // a ideia aqui é gerar numeros entre 1 e 1000
  srand(42);
  for(int i = 0; i < TAM; i++){
    vetor[i] = (rand() % 1000) + 1;
  }

  printf("=== executando tarefas heterogeneas com SECTIONS ===\n\n");

  //2. chamando a diretiva que vamos usar nessa questão
  //
  t_inicio =  omp_get_wtime();
  #pragma omp parallel sections num_threads(2)
  {
    #pragma omp section
    {
      maior = vetor[0];
      for (int i = 0; i < TAM; i++){
        if (vetor[i] > maior){
        maior = vetor[i];
        }
      }
       
      int id = omp_get_thread_num();
      printf("[Thread %d] calculou o MAIOR valor: %d\n", id, maior);
    }

    // 2, SEGUNDA SEÇÃO: Encontrar o menor valor do array
    #pragma omp section
    {
      menor = vetor[0];
      for(int i = 0; i < TAM; i++){
        if (vetor[i] < menor){
          menor = vetor[i];
        }
      }

      int id = omp_get_thread_num(); // ==> aqui vemos qual thread pegou essa tarefa.
      printf("[Thread %d] Calculou o MENOR valor: %d\n", id, menor);
    }
  } // ==> barreira implícita, ambas as sections fecham aqui.

  // calculo do tempo de execução
  //
  t_fim = omp_get_wtime();
  t_total = t_fim - t_inicio;

  printf("=== fim do processamento do array ===\n");
  printf("Maior encontrado: %d\n", maior);
  printf("Menor encontrado: %d\n", menor);
  printf("Tempo de execução do algoritmo: %f segundos\n", t_total);

  return 0;
}
