
---

### **05-lista-encadeada/README.md**

```markdown
# Lista Encadeada

## 📖 Conceitos Fundamentais

### O que é uma Lista Encadeada?
Uma estrutura de dados onde cada elemento (nó) contém:
1. O dado armazenado
2. Uma referência para o próximo nó

### Características
- ✅ Inserção e remoção eficiente em qualquer posição (O(1) quando se tem a referência)
- ✅ Crescimento dinâmico
- ❌ Acesso sequencial (O(n) para encontrar um elemento)

## 🔑 Tipos de Listas Encadeadas

| Tipo | Descrição |
|------|-----------|
| **Simples** | Cada nó aponta apenas para o próximo |
| **Duplamente** | Cada nó aponta para o próximo e para o anterior |
| **Circular** | O último nó aponta para o primeiro |

## 📝 Exemplo Visual
Lista: [10] → [20] → [30] → null
↑ ↑ ↑
Cabeça Nó2 Nó3

Inserir no início: [5] → [10] → [20] → [30] → null
↑
Cabeça

Remover 20: [5] → [10] → [30] → null

## 🎯 Quando Usar

- Inserções/remoções frequentes no meio da lista
- Tamanho variável e imprevisível
- Implementação de pilhas e filas dinâmicas

## 💻 Código

Veja o arquivo `ListaEncadeada.java` para a implementação completa.