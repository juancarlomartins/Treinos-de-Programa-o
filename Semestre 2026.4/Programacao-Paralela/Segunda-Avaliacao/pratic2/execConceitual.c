#include <stdio.h>
#include <omp.h>


//  ========== APRENDENDO SOBRE O CICLO DE TRAVAS (LOCK) DO OPENMP! ================
int main() {
    int recurso_compartilhado = 0;

    // -------------------------------------------------------------------
    // ETAPA 1: INICIALIZAÇÃO (Sequencial, fora da região paralela)
    // -------------------------------------------------------------------
    omp_lock_t trava; // Declara a variável de travamento
    omp_init_lock(&trava); // Inicializa destrancada

    // -------------------------------------------------------------------
    // ETAPA 2: AQUISIÇÃO E LIBERAÇÃO (Dentro da região paralela)
    // -------------------------------------------------------------------
    #pragma omp parallel num_threads(4)
    {
        int id = omp_get_thread_num();

        // 1. Tenta pegar a chave (bloqueia se outra thread estiver com ela)
        omp_set_lock(&trava);

        // --- INÍCIO DA SEÇÃO PROTEGIDA ---
        // Apenas UMA thread por vez consegue estar executando aqui dentro!
        printf("[Thread %d] Pegou a chave e esta alterando o recurso...\n", id);
        recurso_compartilhado++;
        printf("[Thread %d] Devolveu a chave, liberado!\n\n", id);
        // --- FIM DA SEÇÃO PROTEGIDA ---

        // 2. Devolve a chave para a próxima thread da fila
        omp_unset_lock(&trava);
    } // Barreira implícita do parallel

    // -------------------------------------------------------------------
    // ETAPA 3: DESTRUIÇÃO (Sequencial, após o término do paralelismo)
    // -------------------------------------------------------------------
    omp_destroy_lock(&trava); // Libera os recursos do sistema

    printf("Valor final do recurso: %d\n", recurso_compartilhado);
    return 0;
}
