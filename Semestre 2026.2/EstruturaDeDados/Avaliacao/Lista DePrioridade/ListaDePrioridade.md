# Lista de Prioridade (Priority Queue)

## 📖 Conceitos Fundamentais

### O que é uma Lista de Prioridade?
Estrutura onde cada elemento tem uma **prioridade** e o de maior prioridade é removido primeiro.

### Implementação com Heap
- **Heap**: Árvore binária completa
- **Propriedade**: Pai sempre maior que os filhos (max-heap)
- **Inserção**: O(log n)
- **Remoção**: O(log n)
- **Consulta do máximo**: O(1)

## 🔑 Propriedades do Heap

1. **Árvore completa**: Todos os níveis preenchidos (exceto talvez o último)
2. **Propriedade do heap**: Pai ≥ filhos (max-heap) ou pai ≤ filhos (min-heap)
3. **Representação**: Normalmente implementado como array

## 📝 Exemplo Visual
Max-Heap (array: [50, 30, 40, 20, 10])

50 ← Prioridade máxima
/
30 40
/ \ /
20 10

Remover (50):
40
/
30 10
/
20


## 🎯 Quando Usar

- Escalonamento de tarefas (tarefas com maior prioridade primeiro)
- Algoritmos de caminho mínimo (Dijkstra)
- Eventos de simulação
- Algoritmos de ordenação (Heap Sort)

## 💻 Código

Veja o arquivo `ListaPrioridade.java` para a implementação completa.