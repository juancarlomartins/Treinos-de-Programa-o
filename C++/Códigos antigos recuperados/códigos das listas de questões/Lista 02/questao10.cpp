#include <iostream>
#include <fstream>
using namespace std;

int main() {
    int horas, minutos;
    cin >> horas >> minutos;
    
    int horas_em_minutos = horas * 60;
    int total_minutos = horas_em_minutos + minutos;
    int total_segundos = total_minutos * 60;
    
    ofstream arquivo("saida.txt");
    arquivo << horas_em_minutos << endl;
    arquivo << total_minutos << endl;
    arquivo << total_segundos << endl;
    
    arquivo.close();
    return 0;
}