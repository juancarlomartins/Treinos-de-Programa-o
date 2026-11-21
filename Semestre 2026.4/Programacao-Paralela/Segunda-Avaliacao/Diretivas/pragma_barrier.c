// Sincronização de Fases com Barrier
#include <stdio.h>
#include <unistd.h> // Para sleep()
#include <omp.h>  

int main(void) {
 omp_set_num_threads(3);
 
 #pragma omp parallel
 {
   int id = omp_get_thread_num();
   printf("Thread %d: Iniciou Etapa 1\n", id);
   
   sleep(id + 1); // Simula tempos de processamento diferentes
   printf("Thread %d: Concluiu Etapa 1 e aguarda na barreira\n", id);
   
   #pragma omp barrier // Ponto de encontro sincronizado
   printf("Thread %d: Liberada! Iniciou Etapa 2 de forma sincrona\n",id);
 }
 return 0;
}
