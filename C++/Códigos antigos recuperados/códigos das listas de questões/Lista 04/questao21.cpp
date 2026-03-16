#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;

int main() {
    ifstream arquivo("entrada");
    float salario;
    int filhos;
    float soma_salario = 0;
    int soma_filhos = 0;
    int cont = 0;
    float maior_salario = 0;
    int ate_mil = 0;
    while (arquivo >> salario >> filhos) {
        soma_salario += salario;
        soma_filhos += filhos;
        cont++;
        if (salario > maior_salario) maior_salario = salario;
        if (salario <= 1000.00) ate_mil++;
    }
    arquivo.close();
    cout << fixed << setprecision(2);
    if (cont > 0) {
        float media_salario = soma_salario / cont;
        float media_filhos = (float)soma_filhos / cont;
        float percentual = (float)ate_mil / cont * 100;
        cout << media_salario << " " << media_filhos << " " << maior_salario << " " << percentual << endl;
    }
    return 0;
}