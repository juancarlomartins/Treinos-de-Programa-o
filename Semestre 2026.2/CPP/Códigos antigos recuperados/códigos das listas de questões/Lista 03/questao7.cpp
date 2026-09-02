#include <iostream>
#include <fstream>
using namespace std;

int main() {
    int idade;
    cin >> idade;
    
    ofstream arquivo("saida.txt");
    
    if (idade >= 5 && idade <= 7)
        arquivo << "Categoria: Infantil A" << endl;
    else if (idade >= 8 && idade <= 10)
        arquivo << "Categoria: Infantil B" << endl;
    else if (idade >= 11 && idade <= 13)
        arquivo << "Categoria: Juvenil A" << endl;
    else if (idade >= 14 && idade <= 17)
        arquivo << "Categoria: Juvenil B" << endl;
    else if (idade >= 18)
        arquivo << "Categoria: Adulto" << endl;
    
    arquivo << "Idade: " << idade << endl;
    arquivo.close();
    
    return 0;
}