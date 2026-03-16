//Resolução da questão 2 da lista
#include <iostream>
using namespace std;

int main(){
    int salario;
    int emprestimo;
    int portacentagem;

    cout << "Digite o valor do seu salario: " << endl;
    cin >> salario;
    cout << "Digite o valor do emprestimo que voce deseja: " << endl;
    cin >> emprestimo;
    portacentagem = salario * 0.20;

    if (emprestimo < portacentagem){
        cout << "Voce pode realizar o emprestimo" << endl;
    }else{
        cout << "Voce nao pode realizar um emprestimo." << endl;    
    }

    return 0;
}