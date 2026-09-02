#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ifstream arquivo("jazidas.txt");
    float valores[7];
    string dias[7] = {"domingo", "segunda-feira", "terca-feira", "quarta-feira", 
                      "quinta-feira", "sexta-feira", "sabado"};
    
    for (int i = 0; i < 7; i++)
        arquivo >> valores[i];
    
    arquivo.close();
    
    int maior = 0;
    for (int i = 1; i < 7; i++)
        if (valores[i] > valores[maior])
            maior = i;
    
    cout << dias[maior] << endl;
    cout << valores[maior] << endl;
    
    return 0;
}