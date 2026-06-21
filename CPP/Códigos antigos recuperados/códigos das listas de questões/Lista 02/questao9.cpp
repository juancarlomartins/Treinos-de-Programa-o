#include <iostream>
#include <fstream>
#include <cmath>
using namespace std;

int main() {
    ifstream entrada("entrada.txt");
    float altura_degrau_cm, altura_objetivo_m;
    entrada >> altura_degrau_cm >> altura_objetivo_m;
    entrada.close();
    
    float altura_objetivo_cm = altura_objetivo_m * 100;
    int degraus = ceil(altura_objetivo_cm / altura_degrau_cm);
    
    ofstream saida("degraus.txt");
    saida << degraus << endl;
    
    saida.close();
    return 0;
}