#include <iostream>
using namespace std; // "name space" deveria ser "namespace"
int main() { // Faltavam parênteses
    float nota1, nota2, nota3;
    int peso1, peso2, peso3; // Variáveis não declaradas

    cout << "Digite 3 notas ";
    cin >> nota1 >> nota2 >> nota3; // n3 não declarado
    cout << "Digite 3 pesos inteiros ";
    cin >> peso1 >> peso2 >> peso3; // Faltava ler peso3

    float media = (nota1*peso1 + nota2*peso2 + nota3*peso3) / float(peso1 + peso2 + peso3); // Fórmula errada
    cout << media;
    return 0; // Faltava valor de retorno
}