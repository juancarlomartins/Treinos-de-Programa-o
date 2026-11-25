/* Questao 01 - Item B: 1, 2, 4, 6 e 8 threads (Speedup, Eficiencia e Desempenho) */
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
    long int i, n, total;
    int threads_list[] = {1, 2, 4, 6, 8};
    int num_testes = 5;
    double t_inicio, t_fim, tempo_1_thread = 0.0;

    if (argc < 2) {
        n = 5000000; 
    } else {
        n = strtol(argv[1], (char **) NULL, 10);
    }

    printf("Avaliando para N = %ld\n\n", n);
    printf("%-8s %-12s %-12s %-12s %-15s %-12s\n", 
           "Threads", "Tempo (s)", "Speedup", "Eficiencia", "Desempenho(N/s)", "Total Primos");

    for (int t = 0; t < num_testes; t++) {
        int num_t = threads_list[t];
        omp_set_num_threads(num_t);

        total = 0;
        t_inicio = omp_get_wtime();

        #pragma omp parallel for reduction(+:total) schedule(static)
        for (i = 3; i <= n; i += 2) {
            if (primo(i) == 1) total++;
        }

        total += 1;
        t_fim = omp_get_wtime();

        double tempo_atual = t_fim - t_inicio;
        if (num_t == 1) {
            tempo_1_thread = tempo_atual;
        }

        double speedup = tempo_1_thread / tempo_atual;
        double eficiencia = speedup / num_t;
        double desempenho = (double)n / tempo_atual;

        printf("%-8d %-12.6f %-12.4f %-11.2f%% %-15.2f %-12ld\n", 
               num_t, tempo_atual, speedup, eficiencia * 100.0, desempenho, total);
    }

    return 0;
}
