#include <iostream>
#include <fstream>
using namespace std;

int main() {
    float c;
    cin >> c;
    
    ofstream arquivo("temperatura.txt");
    float k = c + 273;
    float f = 1.8 * c + 32;
    
    arquivo << k << " K\n" << f << " F";
    
    arquivo.close();
    return 0;
}