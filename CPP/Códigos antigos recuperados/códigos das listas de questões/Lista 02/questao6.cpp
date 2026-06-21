#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;

int main() {
    string nomeArquivo;
    cin >> nomeArquivo;
    
    ifstream arquivo(nomeArquivo.c_str());
    float salario;
    arquivo >> salario;
    arquivo.close();
    
    float novo = salario * 1.25;
    
    cout << fixed << setprecision(2) << novo << endl;
    
    return 0;
}