#include <stdio.h>

// Protótipo da função (declaração)
int soma(int a, int b);
void saudacao(char nome[]);

int main() {
    int resultado = soma(5, 3);
    printf("Soma: %d\n", resultado);
    
    saudacao("João");
    
    return 0;
}

// Definição da função
int soma(int a, int b) {
    return a + b;
}

void saudacao(char nome[]) {
    printf("Olá, %s!\n", nome);
}