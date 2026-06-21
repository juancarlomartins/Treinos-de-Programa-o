#include <iostream>
#include <cmath> // include escrito errado
using namespace std;
int main() {
    double cateto1, cateto2; // Tipos e nomes errados
    double hipotenusa; // Tipo errado (char)

    cout << "Digite o valor do primeiro cateto: ";
    cin >> cateto1; // Nome errado

    cout << "Digite o valor do segundo cateto: ";
    cin >> cateto2;

    hipotenusa = sqrt(pow(cateto1, 2) + pow(cateto2, 2)); // Fórmula errada
    cout << "A medida da hipotenusa é: " << hipotenusa << endl;
    return 0;
}