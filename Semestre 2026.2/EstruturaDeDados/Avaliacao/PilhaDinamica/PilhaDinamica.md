# Pilha Dinâmica

## 📖 Conceitos Fundamentais

### O que é uma Pilha Dinâmica?
Uma pilha dinâmica é implementada usando **nós encadeados**, onde cada elemento contém:
- O dado armazenado
- Uma referência para o próximo nó

### Vantagens sobre a Pilha Estática
- ✅ Tamanho ilimitado (cresce conforme necessário)
- ✅ Não desperdiça memória
- ✅ Inserção/remoção no topo em O(1)

### Desvantagens
- ❌ Mais complexa de implementar
- ❌ Cada nó ocupa espaço extra para o ponteiro

## 🔑 Estrutura de um Nó

```java
class No {
    int dado;        // valor armazenado
    No proximo;      // referência para o próximo nó
}

## Exemplo Visual

Inserindo: 1, 2, 3

null ← 1 ← 2 ← 3
              ↑
            Topo

Removendo (pop): 3

null ← 1 ← 2
          ↑
        Topo

## Quando usar
1- Quando não se sabe o tamanho máximo da pilha

2- Quando a pilha pode crescer muito

3- Em sistemas com memória limitada (aloca sob demanda)