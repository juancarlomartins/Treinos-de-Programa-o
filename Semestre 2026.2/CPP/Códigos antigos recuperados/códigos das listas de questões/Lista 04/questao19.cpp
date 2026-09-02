#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int valor;
    cin >> valor;
    int menor = valor;
    int maior = valor;
    for (int i = 1; i < n; i++) {
        cin >> valor;
        if (valor < menor) menor = valor;
        if (valor > maior) maior = valor;
    }
    cout << menor << " " << maior << endl;
    return 0;
}