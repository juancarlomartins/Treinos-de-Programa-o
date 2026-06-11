#include <iostream>
using namespace std;

// Definição da estrutura do nó (em C++ pode usar struct ou class)
struct No {
    int valor;
    No* esquerdo;
    No* direito;
    
    // Construtor - função especial que inicializa o nó
    No(int val) : valor(val), esquerdo(nullptr), direito(nullptr) {}
};

int main() {
    // 1. Criando todos os nós (C++ usa new em vez de malloc)
    No* raiz = new No(50);
    No* no30 = new No(30);
    No* no70 = new No(70);
    No* no20 = new No(20);
    No* no40 = new No(40);
    No* no60 = new No(60);
    No* no80 = new No(80);
    
    // 2. Montando a árvore exatamente como na figura
    raiz->esquerdo = no30;
    raiz->direito = no70;
    
    no30->esquerdo = no20;
    no30->direito = no40;
    
    no70->esquerdo = no60;
    no70->direito = no80;
    
    // 3. Imprimindo os valores solicitados
    cout << "=== VALORES DA ÁRVORE (C++) ===" << endl;
    cout << "Raiz: " << raiz->valor << endl;
    cout << "Filho esquerdo da raiz: " << raiz->esquerdo->valor << endl;
    cout << "Filho direito da raiz: " << raiz->direito->valor << endl;
    cout << "Filho esquerdo de 30: " << no30->esquerdo->valor << endl;
    cout << "Filho direito de 30: " << no30->direito->valor << endl;
    cout << "Filho esquerdo de 70: " << no70->esquerdo->valor << endl;
    cout << "Filho direito de 70: " << no70->direito->valor << endl;
    
    // Liberando a memória (C++ usa delete em vez de free)
    delete no20;
    delete no40;
    delete no60;
    delete no80;
    delete no30;
    delete no70;
    delete raiz;
    
    return 0;
}