#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ifstream arquivo("inicio.txt");
    int valor;
    arquivo >> valor;
    arquivo.close();
    
    for (int i = valor; i >= 1; i--) {
        cout << i;
        if (i > 1) {
            cout << " ";
        }
    }
    
    cout << endl << "Fim da contagem" << endl;
    return 0;
}