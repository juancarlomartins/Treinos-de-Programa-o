#include <iostream>
using namespace std; // Faltava ponto e vírgula
int main() { // Faltavam parênteses
    int numero; // Variável não declarada
    cout << "Digite um número inteiro"; // Faltavam aspas
    cin >> numero; // Operador errado: << em vez de >>
    cout << numero * 2 << endl; // Cálculo errado: deveria ser dobro, não quadrado
    return 0;
}