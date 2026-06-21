
---

### **03-fila-estatica/README.md**

```markdown
# Fila Estática

## 📖 Conceitos Fundamentais

### O que é uma Fila?
Uma fila segue o princípio **FIFO** (First In, First Out) - o primeiro elemento inserido é o primeiro a ser removido.

### Fila Estática
- Utiliza um array circular para melhor aproveitamento
- Mantém índices de início e fim
- O tamanho é fixo

## 🔑 Operações Principais

| Operação | Descrição | Complexidade |
|----------|-----------|--------------|
| **enqueue** | Insere no final da fila | O(1) |
| **dequeue** | Remove do início da fila | O(1) |
| **front** | Visualiza o início sem remover | O(1) |
| **isEmpty** | Verifica se está vazia | O(1) |
| **isFull** | Verifica se está cheia | O(1) |

## 📝 Exemplo Visual
Fila: [1, 2, 3]
↑ ↑
Início Fim

Enqueue(4): [1, 2, 3, 4]
↑ ↑
Início Fim

Dequeue(): [2, 3, 4]
↑ ↑
Início Fim


## 🎯 Quando Usar

- Filas de impressão
- Escalonamento de processos
- Buffer de dados
- Atendimento ao cliente (primeiro a chegar, primeiro a ser atendido)

## 💻 Código

Veja o arquivo `FilaEstatica.java` para a implementação completa.