#include <stdio.h>

int main() {
    int idade;
    
    printf("Digite sua idade: ");
    scanf("%d", &idade);
    
    // if/else
    if (idade >= 18) {
        printf("Você é maior de idade!\n");
    } else {
        printf("Você é menor de idade!\n");
    }
    
    // else if
    if (idade < 12) {
        printf("Criança\n");
    } else if (idade < 18) {
        printf("Adolescente\n");
    } else if (idade < 60) {
        printf("Adulto\n");
    } else {
        printf("Idoso\n");
    }
    
    // Switch
    int opcao;
    printf("\nEscolha 1, 2 ou 3: ");
    scanf("%d", &opcao);
    
    switch(opcao) {
        case 1:
            printf("Você escolheu 1\n");
            break;
        case 2:
            printf("Você escolheu 2\n");
            break;
        case 3:
            printf("Você escolheu 3\n");
            break;
        default:
            printf("Opção inválida\n");
    }
    
    return 0;
}