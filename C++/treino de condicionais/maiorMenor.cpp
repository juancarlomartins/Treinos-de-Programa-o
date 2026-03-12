//Código que vai verificar se uma pessoa é menor ou maior de idade.
#include <iostream>
#include <string>
using namespace std;

int main(){
    int idade;
    string nome;
    cout << "Ola seja bem-vindo ao meu programa.\n";
    cout << "Vamos verificar se voce e maior ou menor de idade\n";
    cout << "Qual o seu nome? ";
    getline(cin, nome);
    cout << "Digite a sua idade: ";
    cin >> idade;

    cout << "\n\n";

    if (idade >= 18){
        cout << "Certo " << nome << ", Voce e maior de idade.\n";
    } else {
        cout << "Certo " << nome << ", Voce e menor de idade.\n";
    }

    return 0;
}