#include <iostream>
#include <fstream>
#include <iomanip>
using namespace std;

int main() {
    ifstream arquivo("eleicao.txt");
    string chapa1, chapa2;
    arquivo >> chapa1 >> chapa2;
    string local;
    int votos1 = 0, votos2 = 0;
    while (arquivo >> local) {
        int v1, v2;
        arquivo >> v1 >> v2;
        votos1 += v1;
        votos2 += v2;
    }
    arquivo.close();
    cout << fixed << setprecision(2);
    if (votos1 > votos2) {
        float porcentagem = (float)votos1 / (votos1 + votos2) * 100;
        cout << chapa1 << " " << votos1 << " " << porcentagem << endl;
    } else {
        float porcentagem = (float)votos2 / (votos1 + votos2) * 100;
        cout << chapa2 << " " << votos2 << " " << porcentagem << endl;
    }
    return 0;
}