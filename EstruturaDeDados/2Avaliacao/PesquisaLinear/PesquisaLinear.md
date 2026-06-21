# Pesquisa Linear

## 📖 Conceitos Fundamentais

### O que é Pesquisa Linear?
O algoritmo percorre a lista **elemento por elemento** até encontrar o valor desejado.

### Complexidade: O(n)
No pior caso, precisa percorrer todos os elementos.

### Vantagens
- ✅ Funciona em listas não ordenadas
- ✅ Simples de implementar
- ✅ Não requer pré-processamento

### Desvantagens
- ❌ Lento para grandes conjuntos
- ❌ No pior caso O(n)

## 📝 Exemplo Visual
ista: [5, 2, 8, 1, 9, 3]
Buscar: 9

Passo 1: [5] ≠ 9
Passo 2: [2] ≠ 9
Passo 3: [8] ≠ 9
Passo 4: [1] ≠ 9
Passo 5: [9] = 9 ✓ Encontrado na posição 4


## 📊 Comparação com Pesquisa Binária

| Característica | Linear | Binária |
|----------------|--------|---------|
| Lista ordenada | Não precisa | Precisa |
| Complexidade | O(n) | O(log n) |
| Implementação | Simples | Moderada |

## 💻 Código

Veja o arquivo `PesquisaLinear.java` para a implementação completa.