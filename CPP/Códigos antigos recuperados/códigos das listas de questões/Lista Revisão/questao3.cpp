#include <iostream>
using namespace std;

int main() {
    int inicio, incremento;
    cin >> inicio >> incremento;
    
    int termo = inicio;
    int cont = 0;
    
    while (cont < 10 && termo <= 100) {
        cout << termo;
        if (cont < 9 && termo + incremento <= 100) {
            cout << " ";
        }
        termo += incremento;
        cont++;
    }
    
    cout << endl;
    return 0;
}