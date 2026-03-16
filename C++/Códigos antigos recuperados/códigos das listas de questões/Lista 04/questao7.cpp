#include <iostream>
using namespace std;

int main() {
    int inicio, fim;
    cin >> inicio >> fim;
    if (inicio > fim) {
        cout << "Intervalo de valores invalido" << endl;
        return 0;
    }
    int soma = 0;
    for (int i = inicio; i <= fim; i++) {
        if (i % 2 != 0) soma += i;
    }
    cout << "Soma dos Impares neste intervalo: " << soma << endl;
    return 0;
}