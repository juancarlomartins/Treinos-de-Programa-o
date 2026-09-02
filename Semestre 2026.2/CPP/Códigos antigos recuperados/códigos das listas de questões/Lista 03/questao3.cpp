//Resolução da questão 3 da lista.
#include <iostream>
using namespace std;

int main() {
    int numerador;
    int denominador;

    cout << "Digite o valor do numerador: " << endl;
    cin >> numerador;
    cout << "\nDigite o valor do denominador: " << endl;
    cin >> denominador;

    if (denominador != 0){
        int quociente = numerador / denominador;
        int resto = numerador % denominador;

        cout << "O quociente: " << quociente << "\nO resto: " << resto << endl;

    } else {
        cout << "\nErro" << endl;
    }

    return 0;
}
