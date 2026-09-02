#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int idades[3];
    cin >> idades[0] >> idades[1] >> idades[2];
    
    sort(idades, idades + 3);
    cout << idades[1] << endl;
    
    return 0;
}