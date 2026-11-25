/* Questao 01 - Item A: Versao Sequencial */
#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

int primo(long int n) {
    long int i;
    for (i = 3; i * i <= n; i += 2)
        if (n % i == 0)
            return 0;
    return 1;
}

int main(int argc, char *argv[]) {
    double t_inicio, t_fim;
    long int i, n, total;

    if (argc < 2) {
        n = 5000000; 
    } else {
        n = strtol(argv[1], (char **) NULL, 10);
    }

    total = 0;
    t_inicio = omp_get_wtime();

    for (i = 3; i <= n; i += 2) {
        if (primo(i) == 1) total++;
    }

    total += 1;
    t_fim = omp_get_wtime();

    printf("Quantidade de Primos entre 1 e %ld: %ld\n", n, total);
    printf("Tempo de execucao sequencial: %f s\n", (t_fim - t_inicio));

    return 0;
}