#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    cout << fixed << setprecision(2);
    for (int f = 50; f <= 150; f++) {
        float c = (5.0 / 9.0) * (f - 32);
        cout << f << " " << c << endl;
    }
    return 0;
}