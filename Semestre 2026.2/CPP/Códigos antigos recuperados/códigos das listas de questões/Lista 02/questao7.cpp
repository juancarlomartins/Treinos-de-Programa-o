#include <iostream>
#include <fstream>
#include <cmath>
using namespace std;

int main() {
    float decimal;
    cin >> decimal;
    
    int grau = int(decimal);
    float frac = abs(decimal - grau);
    int minuto = int(frac * 60);
    int segundo = round((frac * 60 - minuto) * 60);
    
    ofstream arquivo("coordenadas.txt");
    arquivo << grau << endl << minuto << endl << segundo << endl;
    
    arquivo.close();
    return 0;
}