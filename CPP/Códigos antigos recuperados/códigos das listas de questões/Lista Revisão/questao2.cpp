#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;
    
    for (int i = 1; i <= N; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            cout << "Z";
        } else if (i % 3 == 0) {
            cout << "X";
        } else if (i % 5 == 0) {
            cout << "Y";
        } else {
            cout << i;
        }
        
        if (i < N) cout << " ";
    }
    
    cout << endl;
    return 0;
}