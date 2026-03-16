#include <iostream>
#include <fstream>
#include <cmath>
using namespace std;

int main() {
    ifstream arquivo("teatro.txt");
    float custo, preco;
    arquivo >> custo >> preco;
    arquivo.close();
    
    int convites = ceil(custo / preco);
    
    cout << convites << endl;
    
    ofstream saida("convite.txt");
    saida << convites;
    saida.close();
    
    return 0;
}