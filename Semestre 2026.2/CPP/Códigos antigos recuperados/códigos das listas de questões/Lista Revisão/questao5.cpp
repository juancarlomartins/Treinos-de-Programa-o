#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int popA, popB;
    cin >> popA >> popB;
    
    int anos = 0;
    double taxaA = 1.03;
    double taxaB = 1.015;
    
    double atualA = popA;
    double atualB = popB;
    
    while (atualA <= atualB) {
        atualA *= taxaA;
        atualB *= taxaB;
        anos++;
    }
    
    cout << "Anos necessarios: " << anos << " anos" << endl;
    return 0;
}