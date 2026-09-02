#include <iostream>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    int quociente = 0;
    while (a >= b) {
        a -= b;
        quociente++;
    }
    cout << quociente << endl;
    return 0;
}