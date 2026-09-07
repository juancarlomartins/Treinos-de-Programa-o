#include <stdio.h>

int main() {
    // FOR - quando sabemos quantas vezes repetir
    printf("FOR: ");
    for(int i = 0; i < 5; i++) {
        printf("%d ", i);
    }
    printf("\n");
    
    // WHILE - repete enquanto condição for verdadeira
    printf("WHILE: ");
    int j = 0;
    while(j < 5) {
        printf("%d ", j);
        j++;
    }
    printf("\n");
    
    // DO-WHILE - executa pelo menos uma vez
    printf("DO-WHILE: ");
    int k = 0;
    do {
        printf("%d ", k);
        k++;
    } while(k < 5);
    printf("\n");
    
    return 0;
}