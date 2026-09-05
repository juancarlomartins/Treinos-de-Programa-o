#include <stdio.h>
// Começando o treino de lógica e sintaxe na linguagem de programação C
// com o foco na disciplina a de programação paralela e CAD.

int main(){
    // Definindo os tipos de variaveis...
    // Tipos básicos.
    int idade = 24;
    float altura = 1.83;
    double peso = 60.1;
    char inicial = "J";
    char nome[20] = "juan"; // -> String (Array de caracteres).

    //Print dos resultados dos dados que foram atribuídos
    printf("===== Imprimindo os dados que foram coletados do usuário ===== \n");
    printf("A idade é: %d\n", idade);
    printf("A altura é: %.2f\n", altura);
    printf("O peso definido foi:%.1f", peso);   
    printf("A inicial do nome: %c\n", inicial);
    printf("E o nome: %s\n", nome);   

    
    return 0;
}