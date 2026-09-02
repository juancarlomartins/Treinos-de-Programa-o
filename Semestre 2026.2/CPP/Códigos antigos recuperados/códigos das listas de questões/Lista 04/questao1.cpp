#include <iostream>
using namespace std;

int main() {
    int soma = 0;
    for (int i = 0; i < 10; i++) {
        int valor;
        cin >> valor;
        soma += valor;
    }
    cout << soma << endl;
    return 0;
}