#include <iostream>
using namespace std;

int main() {
    int valor;
    cin >> valor;
    int menor = valor;
    int maior = valor;
    while (true) {
        cin >> valor;
        if (valor == -1) break;
        if (valor < menor) menor = valor;
        if (valor > maior) maior = valor;
    }
    cout << menor << " " << maior << endl;
    return 0;
}