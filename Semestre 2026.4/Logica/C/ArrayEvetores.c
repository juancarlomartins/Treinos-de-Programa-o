#include <stdio.h>

int main() {
    // Declarando e inicializando
    int numeros[5] = {10, 20, 30, 40, 50};
    
    // Acessando elementos
    printf("Primeiro elemento: %d\n", numeros[0]);
    printf("Último elemento: %d\n", numeros[4]);
    
    // Percorrendo o array
    printf("Todos os elementos: ");
    for(int i = 0; i < 5; i++) {
        printf("%d ", numeros[i]);
    }
    printf("\n");
    
    // Array de strings
    char frutas[3][10] = {"Maçã", "Banana", "Laranja"};
    
    for(int i = 0; i < 3; i++) {
        printf("Fruta %d: %s\n", i+1, frutas[i]);
    }
    
    return 0;
}