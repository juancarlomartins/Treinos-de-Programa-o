# Árvore Binária

## 📖 Conceitos Fundamentais

### O que é uma Árvore Binária?
Uma estrutura hierárquica onde cada nó tem **no máximo dois filhos**:
- Filho esquerdo (menor que o pai)
- Filho direito (maior que o pai)

### Terminologia
- **Raiz**: Nó principal (topo)
- **Folha**: Nó sem filhos
- **Altura**: Número de níveis
- **Subárvore**: Árvore dentro de um nó

## 🔑 Propriedades da Árvore Binária de Busca

1. **Esquerda < Pai**: Todos os elementos à esquerda são menores que o pai
2. **Direita > Pai**: Todos os elementos à direita são maiores que o pai
3. **Subárvores**: Cada subárvore também é uma árvore binária de busca

## 📝 Exemplo Visual
[50] ← Raiz
/
[30] [70]
/ \ /
[20] [40][60] [80]

Em ordem (esquerda-raiz-direita): 20, 30, 40, 50, 60, 70, 80


## 🎯 Quando Usar

- Busca eficiente (O(log n) em árvores balanceadas)
- Sistemas de arquivos
- Expressões matemáticas
- Organização de dados hierárquicos

## 💻 Código

Veja o arquivo `ArvoreBinaria.java` para a implementação completa.