#include <iostream>
using namespace std;
int main () {
    float preco, novopreco; // Nome de variável com espaço
    cout << "Digite o preço do produto ";
    cin >> preco; // ci não existe (deveria ser cin)
    novopreco = preco - (preco * 0.12); // Fórmula do desconto invertida
    cout << "Seu novo preco: " << novopreco;
    return 0;
}