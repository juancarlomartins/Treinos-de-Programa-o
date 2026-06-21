# Lista Duplamente Encadeada

## 📖 Conceitos Fundamentais

### O que é uma Lista Duplamente Encadeada?
Uma lista onde cada nó possui **duas referências**:
- **Próximo**: Aponta para o próximo nó
- **Anterior**: Aponta para o nó anterior

### Diferença para Lista Simplesmente Encadeada

| Característica | Simplesmente | Duplamente |
|----------------|--------------|------------|
| Ponteiros por nó | 1 (próximo) | 2 (próximo e anterior) |
| Navegação | Apenas para frente | Frente e trás |
| Remoção | Precisa do anterior | Mais fácil |
| Memória | Menos | Mais (2 ponteiros) |

### Vantagens
- ✅ Navegação bidirecional
- ✅ Remoção mais eficiente (não precisa buscar o anterior)
- ✅ Inserção no início e fim em O(1)
- ✅ Pode percorrer em ambas as direções

### Desvantagens
- ❌ Mais memória (cada nó guarda 2 referências)
- ❌ Mais complexa de implementar
- ❌ Mais operações para manter os ponteiros

## 🔑 Estrutura do Nó

```java
class No {
    int dado;           // valor armazenado
    No anterior;        // referência para o nó anterior
    No proximo;         // referência para o próximo nó
}


📝 Exemplo Visual

Lista: [10] ↔ [20] ↔ [30] ↔ [40]

null ← 10 ↔ 20 ↔ 30 ↔ 40 → null
       ↑    ↑    ↑    ↑
   anterior anterior anterior anterior
   (null)  (10)  (20)  (30)
        proximo proximo proximo proximo
        (20)   (30)   (40)   (null)

Inserir 5 no início:
null ← 5 ↔ 10 ↔ 20 ↔ 30 ↔ 40 → null

Remover 20:
null ← 5 ↔ 10 ↔ 30 ↔ 40 → null
            ↑       ↑
         (10)    (30)
      anterior  anterior

Comparação de Métodos
1. Criar novo nó
2. novo.anterior = null
3. novo.proximo = cabeca
4. Se cabeca != null: cabeca.anterior = novo
5. cabeca = novo
6. Se lista vazia: fim = novo
