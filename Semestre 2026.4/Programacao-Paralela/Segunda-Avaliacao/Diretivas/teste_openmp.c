#include <stdio.h>
#include <omp.h>

int main(void) {
    #pragma omp parallel
    {
        int id = omp_get_thread_num();
        #pragma omp critical
        printf("Ola da thread %d\n", id);
    }
    return 0;
}