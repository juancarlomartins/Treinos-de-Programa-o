#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int mult = 1;
    for (int i = 1; i <= n; i++) {
        mult *= i;
    }
    cout << mult << endl;
    return 0;
}