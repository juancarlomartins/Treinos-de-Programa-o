#include <stdio.h>

int main(){
    int num;

    printf("\n=== Seja bem-vindo ===\n");
    printf("Digite um número para saber se ele é par ou impar: ");
    scanf("%d", &num);

    if (num % 2 == 0){
        printf("O número %d é par\n", num);
    } else {
        printf("O número %d é ímpar.\n", num);
    }

    printf("Fim do programa.\n");
    //Concluído
    return 0;
}