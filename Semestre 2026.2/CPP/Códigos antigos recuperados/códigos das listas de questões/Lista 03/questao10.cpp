#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;

int main() {
    string nomeArquivo;
    cin >> nomeArquivo;
    
    ifstream arquivo(nomeArquivo.c_str());
    float precos[7] = {28.90, 19.90, 7.95, 2.99, 1.50, 1.85, 8.70};
    int quantidades[7];
    
    for (int i = 0; i < 7; i++)
        arquivo >> quantidades[i];
    
    arquivo.close();
    
    float total = 0;
    for (int i = 0; i < 7; i++)
        total += quantidades[i] * precos[i];
    
    float desconto;
    if (total <= 200.0)
        desconto = total * 0.05;
    else
        desconto = total * 0.1;
    
    cout << fixed << setprecision(2);
    cout << total << endl;
    cout << desconto << endl;
    cout << total - desconto << endl;
    
    return 0;
}