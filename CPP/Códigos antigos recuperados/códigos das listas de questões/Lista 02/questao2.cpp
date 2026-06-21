#include <iostream>
#include <fstream>
using namespace std;

int main() {
    string nomeArquivo, palavra;
    cin >> nomeArquivo >> palavra;
    
    ofstream arquivo(nomeArquivo.c_str());
    arquivo << palavra;
    
    arquivo.close();
    return 0;
}