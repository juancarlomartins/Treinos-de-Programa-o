#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int votos[7] = {0};
    int voto;
    int total = 0;
    while (cin >> voto) {
        if (voto == 0) break;
        if (voto >= 1 && voto <= 6) {
            votos[voto]++;
            total++;
        }
    }
    votos[7] = votos[1] + votos[2] + votos[3] + votos[4];
    cout << fixed << setprecision(11);
    for (int i = 1; i <= 7; i++) {
        float percentual = (total == 0) ? 0 : (float)votos[i] / total;
        cout << i << ": " << votos[i] << " " << percentual << endl;
    }
    return 0;
}