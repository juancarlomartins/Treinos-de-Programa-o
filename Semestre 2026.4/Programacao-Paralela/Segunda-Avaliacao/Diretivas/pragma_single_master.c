// Comparação Prática: Single vs Master.
#include <stdio.h>
#include <omp.h>

int main(void){
  int config = 0;
  omp_set_num_threads(3);

  #pragma omp parallel shared(config)
  {
    // 1- Exemplo com SINGLE (primeira thread que chegar)
    #pragma omp single
    {
      printf("{SINGLE} Thread %d inicializando recurso unico...\n", omp_get_thread_num());
    } // ===> Barreira implicita aqui! todos esperam.

    // 2- Exemplgo com MASTER (apenas a Thread 0)
    #pragma omp master
    {
      config = 100;
      printf("[MASTER] Thread 0 configurou config = %d\n", config);
    } // ==> SEM barreira implicita! Outras threads continuak direto.
  }

  return 0;
}