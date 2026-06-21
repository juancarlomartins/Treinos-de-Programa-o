#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    float valor;
    cin >> valor;
    int dia;
    char categoria;
    float total = 0;
    while (true) {
        cin >> dia;
        if (dia == -1) break;
        cin >> categoria;
        float desconto;
        if (dia <= 13) {
            if (categoria == 'E') desconto = 0.20;
            else desconto = 0.10;
        } else {
            if (categoria == 'E') desconto = 0.10;
            else desconto = 0.05;
        }
        total += valor * (1 - desconto);
    }
    cout << fixed << setprecision(1) << total << endl;
    return 0;
}