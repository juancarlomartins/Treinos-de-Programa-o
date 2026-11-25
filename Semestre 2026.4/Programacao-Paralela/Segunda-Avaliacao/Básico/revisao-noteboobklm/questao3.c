#include <stdio.h>
#include <omp.h>
#include <time.h>
#include <stdlib.h>

// programa para testar o uso e propriedades do pragma reduction na sua função do SOMA
#define TAM 10000

int main(){
  printf("=== Olá seja bem-vindo ao meu programa para testar a diretiva REDUCTION ===\n\n");

  int *vetor = (int*) malloc(TAM *sizeof(int));
  long long soma = 0;
  double media = 0.0;
  double t_inicio, t_fim, t_total;

  // 1. Vamos gerar numeros aleatorios para preecher o vetor que vamos usar.
  srand(42); // semente fixa para os testes
  for (int i = 0; i < TAM; i++){
    vetor[i] = (rand() % 10) + 1; // ==> para gerar valores entre 1 e 10 para preencher todo o vetor.
  }

  printf("=== Calculando a soma com OpenMP reduction ===\n");

  // 2. Agora vamos marcar o tempo inicial de alta precisão.
  t_inicio = omp_get_wtime();

  // 3. agora vamos entrar com a diretiva OpenMP Reduction...
  // aqui vamos combinar parallel for e definir a quantidade de threads que vamos usar
  // junto isso, também vamos chamar o reduction e dizer qual a função vamos usar.
  #pragma omp parallel for num_threads(4) reduction(+:soma)
  for (int i = 0; i < TAM; i++){
    soma += vetor[i];
  }

  //4. marca o tempo final
  t_fim = omp_get_wtime();
  t_total = t_fim - t_inicio;

  // calculando a media da soma.
  media = (double) soma / TAM;

  //5. agoras vamos mostrar os resultados das métricas obtidas ao fim do processo
  printf("Soma Total : %lld\n", soma);
  printf("Media      : %.2f\n", media);
  printf("Tempo gasto: %f segundos\n", t_total);

  free(vetor);
  return 0;

  // fim do programa.
}
