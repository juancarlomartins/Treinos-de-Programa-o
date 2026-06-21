#include <iostream>
using namespace std;
int main () {
    int numero;
    cin >> numero; // Faltava ler o número
    int dobro = numero * numero; // Nome enganoso (é quadrado)
    float quinto = numero / 5.0; // Tipo errado (string) e divisão inteira
    cout << dobro << " " << quinto << endl; // Operador errado e faltava espaço/endl
    return 0; // Faltava return
}