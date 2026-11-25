#include <stdio.h>
#include <omp.h>


int main(void) {
  
  omp_set_num_threads(4); // Precedência intermediária
  #pragma omp parallel num_threads(4) shared(2) private(id)
  {
    int id = omp_get_thread_num();
    printf("Thread %d de %d ativa\n", id, omp_get_num_threads());
  }
  return 0;
}
