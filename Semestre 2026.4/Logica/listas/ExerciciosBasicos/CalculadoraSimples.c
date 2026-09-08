#include <stdio.h>

int main(){
    int a, b, c;

    printf("\n=== Calculadora Básica ===\n");
    printf("Escolha a operação:\n1- soma\n2- Subtração\n3- Divisão\n4- Multiplicação\n");
    scanf("%d", &c);

    if(c == 1){
        printf("\n=== Operação soma ===\n");
        printf("Digite o valor do primeiro número: ");
        scanf("%d", &a);
        printf("Digite valor do seguno número: ");
        scanf("%d", &b);
        int resultado = a + b;
        printf("Resultado: %d\n", resultado);
    }
    if(c == 2){
        printf("\n=== Operação Subtração ===\n");
        printf("Digite o valor do primeiro número: ");
        scanf("%d", &a);
        printf("Digite valor do seguno número: ");
        scanf("%d", &b);
        int resultado = a - b;
        printf("Resultado: %d\n", resultado);
    }
    if(c == 3){
        printf("\n=== Operação Divisão ===\n");
        printf("Digite o valor do primeiro número: ");
        scanf("%d", &a);
        printf("Digite valor do seguno número: ");
        scanf("%d", &b);
        float resultado = a / b;
        printf("Resultado: %2.f\n", resultado);
    }
    if(c == 4){
        printf("\n=== Operação Multiplicação ===\n");
        printf("Digite o valor do primeiro número: ");
        scanf("%d", &a);
        printf("Digite valor do seguno número: ");
        scanf("%d", &b);
        int resultado = a * b;
        printf("Resultado: %d\n", resultado);
    }

    return 0;
}