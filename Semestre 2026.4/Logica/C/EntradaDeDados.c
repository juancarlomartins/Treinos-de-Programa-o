#include <stdio.h>

int main() {
    int numero;
    float preco;
    char nome[50];
    
    printf("Digite um número inteiro: ");
    scanf("%d", &numero);  // & é importante!
    
    printf("Digite um preço: ");
    scanf("%f", &preco);
    
    printf("Digite seu nome: ");
    scanf("%s", nome);  // strings não precisam de &
    
    printf("\nVocê digitou: %d, R$%.2f e %s\n", numero, preco, nome);
    
    return 0;
}