// questão 3 da lista de exercicios de revisao para a prova.
#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

#define N 8

int main() {
    int i, j;
    double media;
    double T_antigo[N][N];
    double T_novo[N][N];

    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) {
            if (i == 0 || i == N - 1 || j == 0 || j == N - 1)
                T_antigo[i][j] = 100.0;
            else
                T_antigo[i][j] = 0.0;

            T_novo[i][j] = T_antigo[i][j];
        }
    }

    #pragma omp parallel for default(none) private(i, j, media) shared(T_antigo, T_novo)
    for (i = 1; i < N - 1; i++) {
        for (j = 1; j < N - 1; j++) {
            media = (T_antigo[i-1][j] + T_antigo[i+1][j] +
                     T_antigo[i][j-1] + T_antigo[i][j+1]) / 4.0;
            T_novo[i][j] = media;
        }
    }

    printf("Matriz T_novo atualizada (deterministica e sem condicao de corrida):\n\n");
    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) {
            printf("%6.2f ", T_novo[i][j]);
        }
        printf("\n");
    }

    return 0;
}