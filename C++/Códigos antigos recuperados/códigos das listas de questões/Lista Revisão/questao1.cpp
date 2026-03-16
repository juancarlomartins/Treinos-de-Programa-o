#include <iostream>
#include <iomanip>
#include <vector>
using namespace std;

int main() {
    vector<int> consumos;
    int consumo;
    
    while (cin >> consumo && consumo >= 0) {
        consumos.push_back(consumo);
    }
    
    int dias = consumos.size();
    if (dias > 0) {
        int soma = 0;
        for (int i = 0; i < dias; i++) {
            soma += consumos[i];
        }
        
        double media = (double)soma / dias;
        int acima = 0;
        
        for (int i = 0; i < dias; i++) {
            if (consumos[i] > media) {
                acima++;
            }
        }
        
        cout << "Dias registrados: " << dias << endl;
        cout << fixed << setprecision(2);
        cout << "Consumo medio: " << media << endl;
        cout << "Dias acima da media: " << acima << endl;
    }
    
    return 0;
}