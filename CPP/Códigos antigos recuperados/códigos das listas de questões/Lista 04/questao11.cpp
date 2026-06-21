#include <iostream>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    if (a > b) {
        int temp = a;
        a = b;
        b = temp;
    }
    int soma_pares = 0;
    int mult_impares = 1;
    for (int i = a; i <= b; i++) {
        if (i % 2 == 0) soma_pares += i;
        else mult_impares *= i;
    }
    cout << "Soma: " << soma_pares << " Multiplicacao: " << mult_impares << endl;
    return 0;
}