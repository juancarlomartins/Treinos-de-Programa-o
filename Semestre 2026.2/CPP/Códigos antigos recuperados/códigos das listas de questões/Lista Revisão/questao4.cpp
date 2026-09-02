#include <iostream>
using namespace std;

int main() {
    int numero;
    cin >> numero;
    
    while (numero >= 10) {
        int soma = 0;
        int temp = numero;
        
        while (temp > 0) {
            soma += temp % 10;
            temp /= 10;
        }
        
        numero = soma;
    }
    
    cout << "Valor final: " << numero << endl;
    return 0;
}