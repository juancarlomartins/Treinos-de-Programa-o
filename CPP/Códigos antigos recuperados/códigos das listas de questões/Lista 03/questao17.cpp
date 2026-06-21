#include <iostream>
#include <fstream>
#include <cmath>
#include <iomanip>
using namespace std;

int main() {
    ifstream arquivo("ataque.txt");
    double I, J, X, Y;
    arquivo >> I >> J >> X >> Y;
    arquivo.close();
    
    double distancia = sqrt(pow(I - X, 2) + pow(J - Y, 2));
    
    if (distancia < 300.0)
        cout << "ACERTOU" << endl;
    else
        cout << fixed << setprecision(6) << distancia << endl;
    
    return 0;
}