# Estrutura de Dados 1 - Revisão para Prova

## 📚 Conteúdo Programático

Este repositório contém a revisão completa dos seguintes tópicos:

1. **Pilhas Estáticas e Dinâmicas**
2. **Filas Estáticas e Dinâmicas**
3. **Listas Encadeadas**
4. **Árvore Binária**
5. **Pesquisa Linear**
6. **Pesquisa Binária**
7. **Lista de Prioridade (Heap)**
8. **Lista Duplamente Encadeada** ⭐ NOVO
9. **ArrayList** ⭐ NOVO

## 🎯 Como Estudar

1. Leia o README de cada pasta para entender os conceitos
2. Analise o código Java com os comentários
3. Execute os exemplos e faça testes
4. Pratique implementando pequenas variações

## 📋 Resumo Rápido

| Estrutura | Princípio | Complexidade (média) |
|-----------|-----------|---------------------|
| Pilha | LIFO | O(1) push/pop |
| Fila | FIFO | O(1) enqueue/dequeue |
| Lista Encadeada | Nós encadeados | O(n) busca |
| Lista Duplamente Encadeada | Nós com 2 ponteiros | O(n) busca |
| ArrayList | Array dinâmico | O(1) acesso, O(n) inserção meio |
| Árvore Binária | Hierárquica | O(log n) busca |
| Pesquisa Linear | Sequencial | O(n) |
| Pesquisa Binária | Divisão | O(log n) |
| Lista Prioridade | Heap | O(log n) inserção/remoção |

## 🆚 Comparações Importantes

### ArrayList vs Lista Encadeada
| Característica | ArrayList | Lista Encadeada |
|----------------|-----------|-----------------|
| Acesso | O(1) | O(n) |
| Inserção no meio | O(n) | O(1)* |
| Memória | Menos | Mais |

### Lista Simples vs Duplamente Encadeada
| Característica | Simples | Duplamente |
|----------------|---------|------------|
| Ponteiros | 1 | 2 |
| Navegação | Uma direção | Duas direções |
| Remoção | Precisa do anterior | Mais fácil |

## 💻 Como Compilar

```bash
# Para compilar um arquivo específico
javac NomeDaClasse.java

# Para executar
java NomeDaClasse