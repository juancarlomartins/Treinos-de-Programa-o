# ArrayList

## 📖 Conceitos Fundamentais

### O que é um ArrayList?
Um **ArrayList** é uma estrutura de dados dinâmica que armazena elementos em um **array redimensionável**. Diferente de um array comum, o ArrayList:
- ✅ Cresce automaticamente quando necessário
- ✅ Mantém a ordem de inserção
- ✅ Permite acesso aleatório O(1)
- ✅ Implementa a interface List

### Como Funciona o Redimensionamento?
1. O ArrayList começa com uma capacidade inicial (ex: 10)
2. Quando atinge o limite, cria um novo array (1.5x maior)
3. Copia todos os elementos para o novo array
4. O array antigo é descartado

## 🔑 Características Importantes

| Característica | Descrição |
|----------------|-----------|
| **Acesso aleatório** | O(1) - muito rápido |
| **Inserção no fim** | O(1) amortizado |
| **Inserção no meio** | O(n) - desloca elementos |
| **Remoção do fim** | O(1) |
| **Remoção do meio** | O(n) - desloca elementos |
| **Ordenação** | Mantém a ordem de inserção |

## 📝 Exemplo Visual

### Estrutura Interna
ArrayList<String> nomes = new ArrayList<>();

Array interno: [null, null, null, null, null, null, null, null, null, null]
Capacidade: 10
Tamanho: 0

Após adicionar 5 elementos:
Array interno: ["Ana", "João", "Maria", "Pedro", "Carlos", null, null, null, null, null]
Capacidade: 10
Tamanho: 5

Após adicionar mais 5 elementos (total 10):
Array interno: ["Ana", "João", "Maria", "Pedro", "Carlos", "Lucas", "Julia", "Rafael", "Beatriz", "Felipe"]
Capacidade: 10
Tamanho: 10

Ao adicionar o 11º elemento:
Array interno: [Ana, João, Maria, Pedro, Carlos, Lucas, Julia, Rafael, Beatriz, Felipe, Thiago, null, null, null, null]
Capacidade: 15 (aumentou 1.5x)
Tamanho: 11


## 🔑 Operações Principais

| Método | Descrição | Complexidade |
|--------|-----------|--------------|
| **add(e)** | Adiciona no final | O(1)* |
| **add(pos, e)** | Adiciona na posição | O(n) |
| **get(pos)** | Obtém elemento | O(1) |
| **set(pos, e)** | Substitui elemento | O(1) |
| **remove(pos)** | Remove por posição | O(n) |
| **remove(e)** | Remove por elemento | O(n) |
| **contains(e)** | Verifica se existe | O(n) |
| **indexOf(e)** | Posição do elemento | O(n) |
| **size()** | Tamanho da lista | O(1) |
| **isEmpty()** | Está vazia? | O(1) |
| **clear()** | Limpa a lista | O(n) |

*O(1) amortizado (pode ter custo O(n) quando redimensiona)

## 🆚 ArrayList vs LinkedList

| Característica | ArrayList | LinkedList |
|----------------|-----------|------------|
| Implementação | Array dinâmico | Nós encadeados |
| Acesso aleatório | O(1) | O(n) |
| Inserção no fim | O(1)* | O(1) |
| Inserção no meio | O(n) | O(1) (com referência) |
| Remoção no meio | O(n) | O(1) (com referência) |
| Memória | Menos | Mais (ponteiros) |
| Cache | Melhor | Pior |
| Iteração | Rápida | Mais lenta |

*O(1) amortizado

## 🎯 Quando Usar ArrayList

### ✅ Bom para:
- Acesso aleatório frequente
- Poucas inserções/remoções no meio
- Iteração rápida
- Listas que precisam ser ordenadas

### ❌ Não é bom para:
- Muitas inserções/remoções no meio
- Listas muito grandes (muita memória)
- Operações no início da lista

## 📊 Análise de Complexidade

### Melhor Caso
- **add(e)**: O(1) - espaço disponível
- **get(pos)**: O(1) - acesso direto
- **remove(fim)**: O(1) - não desloca

### Pior Caso
- **add(e)**: O(n) - redimensionamento
- **add(pos, e)**: O(n) - desloca elementos
- **remove(pos)**: O(n) - desloca elementos

## 💻 Código

Veja o arquivo `ExemploArrayList.java` para a implementação e exemplos completos.