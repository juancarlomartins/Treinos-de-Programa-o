#include <iostream>
#include <string>
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    
    if (a >= b + c || b >= a + c || c >= a + b)
        cout << "inexistente" << endl;
    else if (a == b && b == c)
        cout << "equilatero" << endl;
    else if (a == b || b == c || a == c)
        cout << "isosceles" << endl;
    else
        cout << "escaleno" << endl;
    
    return 0;
}