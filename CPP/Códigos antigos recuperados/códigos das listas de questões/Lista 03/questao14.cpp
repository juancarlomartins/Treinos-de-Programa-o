#include <iostream>
using namespace std;

int main() {
    int op;
    float n1, n2;
    
    cout << "1- Soma de 2 numeros." << endl;
    cout << "2- Diferenca entre 2 numeros (maior pelo menor)." << endl;
    cout << "3- Produto entre 2 numeros." << endl;
    cout << "4- Divisao entre 2 numeros." << endl;
    cout << "Escolha a opcao: ";
    cin >> op;
    cout << "Digite dois numeros: ";
    cin >> n1 >> n2;
    
    switch (op) {
        case 1:
            cout << n1 + n2 << endl;
            break;
        case 2:
            if (n1 > n2) cout << n1 - n2 << endl;
            else cout << n2 - n1 << endl;
            break;
        case 3:
            cout << n1 * n2 << endl;
            break;
        case 4:
            if (n2 != 0) cout << n1 / n2 << endl;
            else cout << "ERRO: denominador zero" << endl;
            break;
        default:
            cout << "Opcao invalida" << endl;
    }
    
    return 0;
}