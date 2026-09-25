// Criar um algoritmo que calcule o fatorial de um numero;

#include <stdio.h>

int main() {
    // definindo as variáveis que vamos usar...
    int num;

    printf("Seja bem-vindo meu parceiro\n");
    printf("Vamos calcular o fatorial, digite um número: ");
    scanf("%d", &num);

    // variáveis de controle
    int contador = num;
    int fatorial = num;  
    int numAtual = num;
    int resultado = 0;
    int a;

    for(int i = 1; i < contador; i++){
        a = num * fatorial - 1;   
        resultado = resultado + a;
        num--;  
        fatorial--;
    }

    printf("\nResultado final: %d\n", resultado);
}