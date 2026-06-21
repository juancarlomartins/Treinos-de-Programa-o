#include <iostream>
using namespace std;

int main() {
    for (int d1 = 1; d1 <= 6; d1++) {
        for (int d2 = 1; d2 <= 6; d2++) {
            if (d1 + d2 == 7) {
                cout << d1 << " " << d2 << endl;
            }
        }
    }
    return 0;
}