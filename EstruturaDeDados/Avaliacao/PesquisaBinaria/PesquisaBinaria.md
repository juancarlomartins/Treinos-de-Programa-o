# Pesquisa Binária

## 📖 Conceitos Fundamentais

### O que é Pesquisa Binária?
Algoritmo que **divide a lista ao meio repetidamente** para encontrar um elemento.

### Requisito: LISTA ORDENADA!
A lista deve estar em ordem crescente ou decrescente.

### Complexidade: O(log n)
Muito eficiente para grandes conjuntos de dados.

## 🔑 Como Funciona

1. Encontra o elemento do meio
2. Se é o alvo → retorna
3. Se o alvo é menor → busca na metade esquerda
4. Se o alvo é maior → busca na metade direita
5. Repete até encontrar ou sobrar nenhum elemento

## 📝 Exemplo Visual
Lista: [1, 3, 5, 7, 9, 11, 13]
Buscar: 7

1ª iteração: [1, 3, 5, 7, 9, 11, 13]
↑ ↑ ↑
esquerda meio direita
(7 > 5, buscar na direita)

2ª iteração: [7, 9, 11, 13]
↑ ↑ ↑
esq. meio dir.
(7 = 7) ✓ Encontrado!


## 📊 Vantagens e Desvantagens

| Vantagens | Desvantagens |
|-----------|--------------|
| ✅ Muito rápido | ❌ Lista precisa estar ordenada |
| ✅ O(log n) | ❌ Custo para ordenar |
| ✅ Eficiente para grandes dados | ❌ Não funciona em listas não ordenadas |

## 💻 Código

Veja o arquivo `PesquisaBinaria.java` para a implementação completa.