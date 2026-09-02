//Resolução da questão 4 da lista.
#include <iostream>
#include <cmath>
using namespace std;

int main() {

    int numero;
    int numero2;
    int resultado;
    int operacao;

    cout << "\nEscolha uma operacao: 1- numero elevado, 2- Raiz quadrada, 3- Raiz cubica. " << endl;
    cin >> operacao;
    if (operacao == 1){
        cout << "Digite o valor do numero: " << endl;
        cin >> numero;
        cout << "\nDigite o valor do numero, o qual deseja elevar o primeiro: " << endl;
        cin >> numero2;

        resultado = pow(numero, numero2);
        cout << "\nO resultado foi: " << resultado << endl;
    }
    if (operacao == 2){
        cout << "Digite o valor do numero: " << endl;
        cin >> numero;
        resultado = sqrt(numero);
        cout << "\nO resultado foi: " << resultado << endl;
    }
    if (operacao == 3){
        cout << "\nDigite o valor do numero: " << endl;
        cin >> numero;
        double resultado = pow(numero, 1.0/3.0);
        cout << "\nO resultado foi: " <<  resultado << endl;
    }
    if ((operacao < 1) and (operacao > 3)){
        cout << "Opcao invalida." << endl;
    }
    cout << "\nFim do programa." << endl;
    return 0;
}