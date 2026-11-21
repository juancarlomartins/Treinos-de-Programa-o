#include <stdio.h>
#include <omp.h>
#define N 8

int main(){
  // testando a diretiva pragma for / papallel for
  //
  int i, id;
  float a[N], b[N], c[N];

  // Inicialização sequencial do programa.
  for (i = 0; i < N; i++){
    a[i] = i * 1.0;
    b[i] = i * 2.0;
  }

  //Iniciando a região paralela do código.
  #pragma omp parallel num_threads(4) shared(a, b, c) private(id, i)
  {
    id = omp_get_thread_num();
    #pragma omp for
    for(i = 0; i < N; i++){   
      c[i] = a[i] + b[i];
      printf("Thread %d executa interface %d (c[%d = %.1f])\n", id, i, i, c[i]);
    }
  }

