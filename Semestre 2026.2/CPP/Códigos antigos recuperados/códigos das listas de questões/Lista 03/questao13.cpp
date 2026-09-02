#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    int pares = 0, impares = 0;
    
    cin >> a >> b >> c;
    
    if (a % 2 == 0) pares++; else impares++;
    if (b % 2 == 0) pares++; else impares++;
    if (c % 2 == 0) pares++; else impares++;
    
    cout << pares << " " << impares << endl;
    
    return 0;
}