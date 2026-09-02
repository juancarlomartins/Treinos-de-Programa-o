#include <stdio.h>
#include <stdlib.h>

// Definição da estrutura do nó
typedef struct No {
    int valor;
    struct No* esquerdo;
    struct No* direito;
} No;

// Função para criar um novo nó
No* criarNo(int valor) {
    No* novoNo = (No*)malloc(sizeof(No));
    if (novoNo == NULL) {
        printf("Erro ao alocar memória!\n");
        exit(1);
    }
    novoNo->valor = valor;
    novoNo->esquerdo = NULL;
    novoNo->direito = NULL;
    return novoNo;
}

int main() {
    // 1. Criando todos os nós usando a função criarNo()
    No* raiz = criarNo(50);
    No* no30 = criarNo(30);
    No* no70 = criarNo(70);
    No* no20 = criarNo(20);
    No* no40 = criarNo(40);
    No* no60 = criarNo(60);
    No* no80 = criarNo(80);
    
    // 2. Montando a árvore exatamente como na figura
    // Conectando os nós
    raiz->esquerdo = no30;
    raiz->direito = no70;
    
    no30->esquerdo = no20;
    no30->direito = no40;
    
    no70->esquerdo = no60;
    no70->direito = no80;
    
    // 3. Imprimindo os valores solicitados
    printf("=== VALORES DA ÁRVORE ===\n");
    printf("Raiz: %d\n", raiz->valor);
    printf("Filho esquerdo da raiz: %d\n", raiz->esquerdo->valor);
    printf("Filho direito da raiz: %d\n", raiz->direito->valor);
    printf("Filho esquerdo de 30: %d\n", no30->esquerdo->valor);
    printf("Filho direito de 30: %d\n", no30->direito->valor);
    printf("Filho esquerdo de 70: %d\n", no70->esquerdo->valor);
    printf("Filho direito de 70: %d\n", no70->direito->valor);
    
    // Liberando a memória alocada (boa prática)
    free(no20);
    free(no40);
    free(no60);
    free(no80);
    free(no30);
    free(no70);
    free(raiz);
    
    return 0;
}