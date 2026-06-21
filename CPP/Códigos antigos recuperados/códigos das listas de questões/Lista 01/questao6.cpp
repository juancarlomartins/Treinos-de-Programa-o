#include <iostream>
using namespace std;
int main () {
    int a, b; // Valores inicializados sem leitura
    cin >> a >> b; // Faltava ler valores
    cout << "Valor de a " << a << endl;
    cout << "Valor de b " << b << endl;
    
    int temp = a; // Falta variável temporária para troca
    a = b;
    b = temp;
    
    cout << "Valor de a " << a << endl;
    cout << "Valor de b " << b << endl;
    return 0;
}