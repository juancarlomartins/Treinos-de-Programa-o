#include <iostream>
#include <fstream>
using namespace std;

int main() {
    string nomeArquivo;
    cin >> nomeArquivo;
    
    ifstream arquivo(nomeArquivo.c_str());
    string palavra;
    arquivo >> palavra;
    
    cout << palavra << endl;
    
    arquivo.close();
    return 0;
}