#include <iostream>
#include <fstream>
using namespace std;

int main() {
    string nome1, nome2, nome3;
    cin >> nome1 >> nome2 >> nome3;
    
    ifstream arq1(nome1.c_str());
    ifstream arq2(nome2.c_str());
    string palavra1, palavra2;
    arq1 >> palavra1;
    arq2 >> palavra2;
    
    ofstream arq3(nome3.c_str());
    arq3 << palavra1 << " " << palavra2;
    
    arq1.close();
    arq2.close();
    arq3.close();
    
    return 0;
}