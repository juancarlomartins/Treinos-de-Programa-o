#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    float preco;
    int codigo;
    cin >> preco >> codigo;
    
    cout << fixed << setprecision(2);
    
    if (codigo == 1)
        cout << preco * 0.9 << endl;
    else if (codigo == 2)
        cout << preco * 0.95 << endl;
    else if (codigo == 3)
        cout << preco << endl;
    else if (codigo == 4)
        cout << preco * 1.1 << endl;
    
    return 0;
}