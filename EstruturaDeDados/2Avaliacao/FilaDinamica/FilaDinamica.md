# Fila Dinâmica

## 📖 Conceitos Fundamentais

### Fila Dinâmica
Implementada usando **nós encadeados** com referências para o **início** e o **fim** da fila.

### Características
- ✅ Tamanho ilimitado
- ✅ Inserção e remoção em O(1)
- ✅ Memória alocada sob demanda

### Estrutura
```java
class No {
    int dado;
    No proximo;
}

class FilaDinamica {
    No inicio;    // primeiro da fila
    No fim;       // último da fila
}

📝 Exemplo Visual

Fila: [1, 2, 3]

inicio → 1 → 2 → 3 → null
                  ↑
                 fim

Enqueue(4):
inicio → 1 → 2 → 3 → 4 → null
                        ↑
                       fim

Dequeue():
inicio → 2 → 3 → 4 → null
                 ↑
                fim

🎯 Vantagens da Fila Dinâmica
Crescimento dinâmico: Não precisa definir tamanho máximo

Eficiência: O(1) para inserção e remoção

Flexibilidade: Útil quando o número de elementos é imprevisível

