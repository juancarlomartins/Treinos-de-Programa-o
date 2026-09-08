#include <stdio.h>

int main(){
    int a, b;

    printf("=== Soma de dois Números ===\n");
    printf("Digite aqui o valor do primeiro número: ");
    scanf("%d", &a);

    printf("Digite agora o valor do segundo número: ");
    scanf("%d", &b);

    int soma = a + b;

    printf("=== RESULTADO ===");
    printf("\nO resultado da soma de %d + %d é: %d: ", a, b, soma);

    //concluído.
    return 0;
}