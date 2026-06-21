#include <iostream>
#include <fstream>
using namespace std;

int main() {
    int populacao;
    cin >> populacao;
    
    int silvestres_biologos = populacao * 0.11;
    int silvestres_registros = silvestres_biologos * 0.73;
    int idosos_biologos = silvestres_biologos / 3;
    int idosos_registros = silvestres_registros / 4;
    
    ofstream arquivo("saida.txt");
    arquivo << silvestres_biologos << endl;
    arquivo << silvestres_registros << endl;
    arquivo << idosos_biologos << endl;
    arquivo << idosos_registros << endl;
    
    arquivo.close();
    return 0;
}