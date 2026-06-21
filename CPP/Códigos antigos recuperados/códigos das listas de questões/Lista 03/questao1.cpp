//Resolução da questão 01 da lista.
#include <iostream>
using namespace std;

int main(){
    int numero;
    int numero2;

    cout << "Digte o valor do primeiro numero: " << endl;
    cin >> numero;
    cout << "\n Digite o valor do segundo numero: " << endl;
    cin >> numero2;

    if (numero > numero2){
        cout << "\nO maior numero: " << numero << endl;
    } else{
        cout << "\nO maior numero: " << numero2 << endl;
    }

    return 0;
}
