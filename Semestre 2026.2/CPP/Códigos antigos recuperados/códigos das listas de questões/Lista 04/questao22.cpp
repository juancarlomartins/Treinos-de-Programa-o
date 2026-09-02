#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    string nomeArquivo;
    cin >> nomeArquivo;
    ifstream arquivo(nomeArquivo.c_str());
    char c;
    int vogais = 0;
    while (arquivo.get(c)) {
        c = tolower(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vogais++;
        }
    }
    arquivo.close();
    cout << vogais << endl;
    return 0;
}