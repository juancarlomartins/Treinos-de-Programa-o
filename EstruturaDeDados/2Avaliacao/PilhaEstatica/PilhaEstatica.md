
---

### **01-pilha-estatica/README.md**

```markdown
# Pilha Estática

## 📖 Conceitos Fundamentais

### O que é uma Pilha?
Uma pilha é uma estrutura de dados que segue o princípio **LIFO** (Last In, First Out) - o último elemento inserido é o primeiro a ser removido.

### Pilha Estática vs Dinâmica
- **Estática**: Utiliza um array de tamanho fixo pré-definido
- **Dinâmica**: Utiliza nós encadeados que crescem conforme necessário

### Características da Pilha Estática
- ✅ Implementação simples
- ✅ Acesso rápido (O(1))
- ❌ Tamanho limitado
- ❌ Não cresce dinamicamente

## 🔑 Operações Principais

| Operação | Descrição | Complexidade |
|----------|-----------|--------------|
| **push** | Insere um elemento no topo | O(1) |
| **pop** | Remove o elemento do topo | O(1) |
| **peek** | Visualiza o topo sem remover | O(1) |
| **isEmpty** | Verifica se está vazia | O(1) |
| **isFull** | Verifica se está cheia | O(1) |

## 📝 Exemplo Visual



## 🎯 Quando Usar

- Algoritmos de desfazer/refazer (undo/redo)
- Navegação em páginas web (voltar/avançar)
- Avaliação de expressões matemáticas
- Verificação de parênteses balanceados

## 💻 Código

Veja o arquivo `PilhaEstatica.java` para a implementação completa.