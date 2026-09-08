// Para esse algoritmo vamos solicitar ao usuário 3 números e devolver para ele qual é o maior dos 3;
#include <stdio.h>

int main(){
    // Declarando as variáveis que vamos utilizar;
    int a, b, c;

    printf("=== Comparador de três números ===\n");
    printf("Digite o valor do primeiro número: ");
    scanf("%s", &a);
    printf("Digite o valor do segundo número: ");
    scanf("%d", &b);
    printf("Digite o valor do terceiro número: ");
    scanf("%d", &c);

    printf("\n=== COMPARANDO OS NÚMEROS ===\n");
    int numeros[3] = {a, b, c};

    int maior = 0;

    for(int i = 0; i <= 3; i++){
        int numAtual = numeros[i];
        printf("%d ",numeros[i]);
        if (numAtual > maior){
            maior = numAtual;
        };
    }

    printf("\nO maior número digitado foi: %d\n", maior);

    return 0;
}