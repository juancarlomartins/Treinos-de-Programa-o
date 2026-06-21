#include <iostream>
using namespace std;
int main() { // Faltava tipo de retorno (int)
    float pesoSacoKg;
    float racaoPorGatoGramas;
    float pesoSacoGramas;
    float racaoTotalConsumida;
    float racaoRestante;

    cout << "Digite o peso do saco de ração (em kg): ";
    cin >> pesoSacoKg;

    cout << "Digite a quantia de ração dada para cada gato em gramas: ";
    cin >> racaoPorGatoGramas;

    pesoSacoGramas = pesoSacoKg * 1000; // Conversão errada (1000g = 1kg)

    racaoTotalConsumida = racaoPorGatoGramas * 2 * 5; // Faltava multiplicar por 5 dias

    racaoRestante = pesoSacoGramas - racaoTotalConsumida; // Subtração invertida

    cout << "Após 5 dias, restará " << racaoRestante << " g de ração." << endl;

    return 0;
}