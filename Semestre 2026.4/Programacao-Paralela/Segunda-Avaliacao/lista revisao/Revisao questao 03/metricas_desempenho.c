#include <stdio.h>
#include <omp.h>

#define N 50000000 // Tamanho da carga de trabalho

int main() {
    int p = 4; // Quantidade de threads a ser testada
    double t_inicio, t_fim;
    double T1, Tp;
    double speedup, eficiencia, desempenho;
    long long soma = 0;

    printf("=== AVALIACAO DE METRICAS DE DESEMPENHO NO CODIGO ===\n\n");

    // -------------------------------------------------------------------
    // ETAPA 1: MEDIR O TEMPO COM 1 THREAD (T1 - Base Sequencial)
    // -------------------------------------------------------------------
    printf("1. Executando carga de trabalho com 1 thread...\n");
    soma = 0;
    t_inicio = omp_get_wtime();

    #pragma omp parallel for reduction(+:soma) num_threads(1)
    for (int i = 0; i < N; i++) {
        soma += (i % 5);
    }

    t_fim = omp_get_wtime();
    T1 = t_fim - t_inicio;
    printf(" -> Tempo com 1 thread (T1): %.4f segundos\n\n", T1);

    // -------------------------------------------------------------------
    // ETAPA 2: MEDIR O TEMPO COM P THREADS (Tp - Versao Paralela)
    // -------------------------------------------------------------------
    printf("2. Executando a mesma carga com %d threads...\n", p);
    soma = 0;
    t_inicio = omp_get_wtime();

    #pragma omp parallel for reduction(+:soma) num_threads(p)
    for (int i = 0; i < N; i++) {
        soma += (i % 5);
    }

    t_fim = omp_get_wtime();
    Tp = t_fim - t_inicio;
    printf(" -> Tempo com %d threads (Tp): %.4f segundos\n\n", p, Tp);

    // -------------------------------------------------------------------
    // ETAPA 3: CALCULO DAS METRICAS NO PROPRIO CODIGO
    // -------------------------------------------------------------------
    speedup = T1 / Tp;                  // Formula: S_p = T1 / Tp
    eficiencia = speedup / (double)p;   // Formula: E_p = S_p / p
    desempenho = eficiencia * 100.0;    // Formula: D = E_p * 100%

    // -------------------------------------------------------------------
    // ETAPA 4: EXIBICAO DOS RESULTADOS FORMATADOS
    // -------------------------------------------------------------------
    printf("=== RESULTADOS FINAIS CALCULADOS ===\n");
    printf(" * Tempo Sequencial (T1) : %.4f s\n", T1);
    printf(" * Tempo Paralelo (T%d)  : %.4f s\n", p, Tp);
    printf(" * Speedup (S_%d)        : %.2fx (o codigo rodou %.2f vezes mais rapido)\n", p, speedup, speedup);
    printf(" * Eficiencia (E_%d)     : %.4f\n", p, eficiencia);
    printf(" * Desempenho Percentual : %.2f%%\n", desempenho);

    return 0;
}
