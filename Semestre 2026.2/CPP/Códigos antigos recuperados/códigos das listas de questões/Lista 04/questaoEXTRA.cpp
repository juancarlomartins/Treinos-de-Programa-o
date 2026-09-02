#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    string nomeArquivo;
    cin >> nomeArquivo;
    ifstream arquivo(nomeArquivo.c_str());
    string candidatos[3];
    for (int i = 0; i < 3; i++) {
        arquivo >> candidatos[i];
    }
    int n;
    arquivo >> n;
    int votos[3] = {0};
    for (int i = 0; i < n; i++) {
        string voto;
        arquivo >> voto;
        for (int j = 0; j < 3; j++) {
            if (voto == candidatos[j]) {
                votos[j]++;
                break;
            }
        }
    }
    arquivo.close();
    int maior = votos[0];
    for (int i = 1; i < 3; i++) {
        if (votos[i] > maior) maior = votos[i];
    }
    cout << maior << endl;
    return 0;
}