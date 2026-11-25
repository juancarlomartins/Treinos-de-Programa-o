#include <stdio.h>
#include <omp.h>
#define TAM 40

// código paralelo para trabalhar com a diretiva pragma for
//
int main(){
  printf("=== Programa do uso do #pragma for ===\n");

  int vetor[TAM];

  // passo 1: preencher o vetor com as 40 posições pedidas pela questão
  // 
  for (int i = 0; i < TAM; i++){
    vetor[i] = i;
  }

  printf("Criado o vetor agora vamos processar ele em paralelo!\n\n");

  // passo 2: dividir o laço for em 4 threads, cada uma com 10 posições.
  // vetor => é compartilhado "shared" por que todas precisam acessar o mesmo array
  // i ==> é a variável de controle do laço

  
  #pragma omp parallel for num_threads(4) shared(vetor) // aqui começa a região paralela do código.
  for (int i = 0; i < TAM; i++){

    // passo 3: o que cada trhead faz na sua fatia do array
    // 1. Calcula o quadrado: 
    vetor[i] = vetor[i] * vetor[i];


    // 2. descobre quem é ela:
    int id = omp_get_thread_num();

    //3. Imprime o resultado do cálculo daquela posição do array.
    printf("Thread %d calculou a posiçaõ %2d -> resultado: %d\n\n", id, i, vetor[i]);
  }

  return 0;
}
