#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int valor;
    int soma = 0, cont = 0, positivos = 0, negativos = 0;
    while (true) {
        cin >> valor;
        if (valor == 0) break;
        soma += valor;
        cont++;
        if (valor > 0) positivos++;
        else if (valor < 0) negativos++;
    }
    cout << fixed << setprecision(1);
    if (cont > 0) {
        float media = (float)soma / cont;
        float perc_pos = (float)positivos / cont * 100;
        float perc_neg = (float)negativos / cont * 100;
        cout << media << endl;
        cout << positivos << endl;
        cout << negativos << endl;
        cout << perc_pos << endl;
        cout << perc_neg << endl;
    } else {
        cout << "0.0\n0\n0\n0.0\n0.0" << endl;
    }
    return 0;
}