#include <stdio.h>

int main() {
    int a = 10, b = 3;
    
    // Aritméticos
    printf("Soma: %d\n", a + b);
    printf("Subtração: %d\n", a - b);
    printf("Multiplicação: %d\n", a * b);
    printf("Divisão: %d\n", a / b);      // Divisão inteira
    printf("Resto: %d\n", a % b);        // Módulo
    
    // Incremento/Decremento
    int c = 5;
    c++;  // c = 6
    c--;  // c = 5
    printf("c: %d\n", c);
    
    // Atribuição composta
    int d = 10;
    d += 5;  // d = 15
    d *= 2;  // d = 30
    printf("d: %d\n", d);
    
    return 0;
}