#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    float r;
    int n;
    cin >> r >> n;
    float termo = 1;
    cout << fixed << setprecision(3);
    for (int i = 1; i <= n; i++) {
        cout << termo << endl;
        termo *= r;
    }
    return 0;
}