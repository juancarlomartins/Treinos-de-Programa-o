# 🚀 ESTRATÉGIA RELÂMPAGO - Estrutura de Dados 1

## ⚡ GUIA DE ESTUDO PARA ÚLTIMA HORA

### 📊 Tempo Estimado: 6-8 horas
### 🎯 Objetivo: Aprender o ESSENCIAL para a prova

---

## 📋 PRIORIDADES DE ESTUDO

| Prioridade | Conteúdo | Motivo | Chance de Cair |
|------------|----------|--------|----------------|
| 🔴 **URGENTE** | Pilhas + Filas | Sempre cai! | 90% |
| 🔴 **URGENTE** | Pesquisa Linear e Binária | Simples e fácil | 85% |
| 🟡 **IMPORTANTE** | Lista Encadeada | Base para outras | 70% |
| 🟡 **IMPORTANTE** | ArrayList | Muito usado | 65% |
| 🟢 **BÔNUS** | Árvore + Lista Prioridade | Cai menos | 40% |

---

## 📝 MÉTODO DE ESTUDO - PASSO A PASSO

### ⏰ PRIMEIRA HORA: Teoria Básica

#### 0:00 - 0:15: Conceitos Fundamentais

**DECORE ISSO AGORA:**

```java
// PILHA = LIFO (Last In, First Out)
// Último a entrar, primeiro a sair

push(1) → push(2) → push(3) → pop() = 3
// [1] → [1,2] → [1,2,3] → [1,2]

// FILA = FIFO (First In, First Out)
// Primeiro a entrar, primeiro a sair

enqueue(1) → enqueue(2) → enqueue(3) → dequeue() = 1
// [1] → [1,2] → [1,2,3] → [2,3]

// PESQUISA LINEAR = Varre tudo
[1,3,5,7,9] → acha o 7? → 1,3,5,7 ✓ (4 passos)
// Complexidade: O(n)

// PESQUISA BINÁRIA = Divide ao meio (precisa de lista ORDENADA)
[1,3,5,7,9] → acha o 7? → [1,3,5,7,9] → meio=5 → [7,9] → meio=7 ✓ (2 passos)
// Complexidade: O(log n)


----

# 0:15 - 0:30: Desenhe no Papel

----

PILHA (LIFO):
┌─────┐
│  3  │ ← TOPO (último a entrar)
├─────┤
│  2  │
├─────┤
│  1  │ ← BASE (primeiro a entrar)
└─────┘

FILA (FIFO):
┌─────┬─────┬─────┐
│  1  │  2  │  3  │ ← FIM (último a entrar)
└─────┴─────┴─────┘
  ↑
INÍCIO (primeiro a entrar)

LISTA ENCADEADA:
[10] → [20] → [30] → null
 ↑              ↑
CABEÇA         FIM


----

0:30 - 1:00: Decore as Complexidades

TABELA DE COMPLEXIDADES (DECORE!):

Estrutura	            Operação	            Complexidade
Pilha	                push/pop	            O(1)
Fila	                enqueue/dequeue	        O(1)
Lista                   Encadeada	busca	    O(n)
Lista                   Duplamente	busca	    O(n)
ArrayList	            acesso get/set	        O(1)
ArrayList	            inserção/remoção meio	O(n)
Pesquisa Linear	        busca	                O(n)
Pesquisa Binária	    busca	                O(log n)
Árvore Binária	        busca	                O(log n)
Lista Prioridade	    inserção/remoção	    O(log n)

#########################################################################

⏰ SEGUNDA HORA: Mão na Massa (Código Básico)
Escreva à mão as versões SIMPLIFICADAS:
PILHA (versão mínima):
class Pilha {
    int[] dados = new int[100];  // vetor para armazenar
    int topo = -1;               // índice do topo
    
    // Inserir no topo
    void push(int x) { 
        dados[++topo] = x;       // incrementa topo e insere
    }
    
    // Remover do topo
    int pop() { 
        return dados[topo--];    // retorna e decrementa topo
    }
    
    // Verificar se está vazia
    boolean vazia() { 
        return topo == -1;       // topo = -1 significa vazia
    }
}
########################################################################

FILA (versão mínima):
class Fila {
    int[] dados = new int[100];  // vetor para armazenar
    int inicio = 0;              // índice do início
    int fim = -1;                // índice do fim
    int tamanho = 0;            // quantidade de elementos
    
    // Inserir no final
    void enqueue(int x) { 
        dados[++fim] = x;        // incrementa fim e insere
        tamanho++;
    }
    
    // Remover do início
    int dequeue() { 
        tamanho--;
        return dados[inicio++];  // retorna e incrementa início
    }
    
    // Verificar se está vazia
    boolean vazia() { 
        return tamanho == 0;     // tamanho = 0 significa vazia
    }
}

#############################################################################

LISTA ENCADEADA (versão mínima):
class No {
    int valor;          // dado armazenado
    No proximo;         // referência para o próximo nó
    
    No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class Lista {
    No cabeca;          // primeiro nó da lista
    
    // Inserir no início
    void inserir(int valor) {
        No novo = new No(valor);
        novo.proximo = cabeca;   // novo aponta para a antiga cabeça
        cabeca = novo;           // atualiza a cabeça
    }
    
    // Buscar elemento
    boolean buscar(int valor) {
        No atual = cabeca;
        while(atual != null) {
            if(atual.valor == valor) return true;
            atual = atual.proximo;
        }
        return false;
    }
}

################################################################################

⏰ QUINTA HORA: Macetes e Dicas
📌 MACETES PARA DECORAR
Estrutura	        Palavra-chave	    Lembrete Visual
Pilha	            LIFO	            Last In First Out = "Último a entrar"
Fila	            FIFO	            First In First Out = "Primeiro a entrar"
Lista	            Nó → Nó	            Pense em um trem (vagões encadeados)
Árvore	            Pai → Filhos	    Pense em genealogia/árvore genealógica
Busca Binária	    Divide	            Pense em achar palavra no dicionário

################################################################################

O QUE MAIS CAI EM PROVA
1. Implementar Pilha/Fila (80% de chance)
2. Qual a diferença entre estática e dinâmica? (70%)
3. Explicar LIFO e FIFO (90%)
4. Complexidade das operações (85%)
5. Pesquisa binária vs linear (75%)
6. ArrayList vs Lista Encadeada (60%)

################################################################################

📋 RESUMÃO PARA ÚLTIMA HORA
╔══════════════════════════════════════════════════════╗
║              RESUMÃO ESTRUTURA DE DADOS              ║
╠══════════════════════════════════════════════════════╣
║                                                      ║
║  PILHA:  LIFO - push/pop - O(1)                      ║
║  FILA:   FIFO - enqueue/dequeue - O(1)               ║
║  LISTA:  Nó → Nó → null - O(n) busca                 ║
║  ARRAY:  Acesso O(1) - insere/remove meio O(n)       ║
║  BINÁRIA: Lista ORDENADA - O(log n)                  ║
║  LINEAR: Qualquer lista - O(n)                       ║
║  ÁRVORE: Hierárquica - Busca O(log n)                ║
║  HEAP:   Pai > filhos - O(log n)                     ║
║                                                      ║
║  PILHA = EMPILHAR PRATOS (último em cima)            ║
║  FILA  = FILA DE BANCO (primeiro da fila)            ║
║  LISTA = VAGÕES DE TREM (um atrás do outro)          ║
║                                                      ║
╚══════════════════════════════════════════════════════╝

O MÍNIMO QUE VOCÊ PRECISA SABER:

// 1. PILHA (LIFO)
push(1) → [1]
push(2) → [1,2]
pop()   → 2

// 2. FILA (FIFO)
enqueue(1) → [1]
enqueue(2) → [1,2]
dequeue()  → 1

// 3. PESQUISA BINÁRIA
// Lista PRECISA estar ordenada!
[1,3,5,7,9] → buscar 7 → 2 passos (O(log n))

// 4. PESQUISA LINEAR
// Qualquer lista
[5,2,8,1,9] → buscar 8 → 3 passos (O(n))
