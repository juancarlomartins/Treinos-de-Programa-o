#include <stdio.h>
#include <omp.h>

int main(){
  // Esse pragma divide o código independentes entre threads distintas (modelo MIND)
  // cada bloco section é atribuído a uma thread. Possui barreira implícita no ence-
  // rramento. //

  #pragma omp parallel sections num_threads(2)
  {
    #pragma omp section
    {
      int id = omp_get_thread_num();
      printf("Secao 1 [Calculo A] executada pela thread %d\n", id);  
    }

    #pragma omp section
    {
      int id = omp_get_thread_num();
      printf("Secao 2 [Calculo B] executada pela thread %d\n", id);
    }
  } // Barreia implícita: ambas as secoes concluem aqui   

  return 0;
}
