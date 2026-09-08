#include <stdio.h>

int main(){
    int num, contador, resultado;
    printf("=== Tabuada ===\n");
    printf("Digite qual o número que você quer ver a tabuada: ");
    scanf("%d", &num);

    contador = 1;
    printf("\n=== Tabuada do %d ===", num);
    for(int i = 1; i <= 10; i++){
        resultado = num * contador;
        printf("\n%dx%d=%d", num, contador, resultado);
        contador++;
    }
    printf("\n=== fim ===\n");
    //concluído...
    return 0;
}