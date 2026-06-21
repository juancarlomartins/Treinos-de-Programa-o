//criando um loop usando um contador.
#include <iostream>
using namespace std;

int main(){
    int numero, contador;
    cout << "Ola seja bem-vindo ao meu programa\n";
    cout << "Digite um numero para iniciar o contador de 1 ate n: ";
    cin >> numero;

    cout << "\nIniciando a contagem de 1 ate " << numero << ".\n";
    contador = 1;
    while (contador <= numero){
        cout << contador << endl;
        contador++;
    }
    cout << "Fim do programa.\n";
    return 0;
}