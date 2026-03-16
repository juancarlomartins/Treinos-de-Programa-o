#include <iostream>
#include <fstream>
#include <iomanip>
#include <cmath>
using namespace std;

int main() {
    ifstream entrada("venda.txt");
    float valor;
    int prestacoes;
    entrada >> valor >> prestacoes;
    entrada.close();
    
    float total_antes = valor * 1.1;
    float parcela_antes = total_antes / prestacoes;
    float parcela_atual = parcela_antes * 0.9;
    float total_atual = parcela_atual * prestacoes;
    
    ofstream saida("cliente.txt");
    saida << fixed << setprecision(2);
    saida << total_antes << endl;
    saida << parcela_antes << endl;
    saida << parcela_atual << endl;
    saida << total_atual << endl;
    
    saida.close();
    return 0;
}