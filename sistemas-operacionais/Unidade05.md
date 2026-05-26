# UNIDADE 05 - Gerência do Processador

## Conceitos Básicos
- Em sistema com 1 processador, apenas 1 processo executa por vez.
- Múltiplos processos ficam na memória (estado pronto).
- **Escalonador**: decide qual processo usará a CPU.
- **Dispatcher (despachante)**: faz a troca de contexto.
- **Latência do despacho**: tempo gasto na troca de contexto.

## Objetivos do Escalonamento
- Manter CPU ocupada
- Balancear uso da CPU
- Privilegiar aplicações críticas
- Maximizar **throughput** (processos concluídos por tempo)
- Minimizar:
  - Tempo de espera (fila de pronto)
  - Tempo de turnaround (criação → término)
  - Tempo de resposta (requisição → resposta)

## Tipos de Escalonamento
- **Não-preemptivo**: processo só libera CPU ao terminar ou esperar I/O. Ex: Windows 3.x
- **Preemptivo**: SO pode interromper o processo. Ex: Windows 95+, Mac OS X

## Principais Algoritmos

### FIFO (FCFS)
- Não-preemptivo
- Primeiro que chega, primeiro executado
- Desvantagem: tempo médio de espera alto
- Processos CPU-bound levam vantagem

### SJF (Shortest Job First)
- Escolhe processo com menor tempo de CPU restante
- Na prática usa média exponencial do passado

### Round-Robin (Circular)
- Preemptivo com **quantum** (10-100 ms)
- Processo que expira o quantum vai ao final da fila
- Vantagem: evita monopólio da CPU

### Circular Virtual
- Refinamento do Round-Robin
- Processos que saem de espera vão para fila auxiliar com prioridade

### Por Prioridade
- Pode ser preemptivo ou não
- Problema: **Starvation** (processos de baixa prioridade nunca executam)
- Solução: **Aging** (aumenta prioridade com o tempo de espera)

### Múltiplas Filas
- Várias filas com prioridades fixas
- Processos não trocam de fila

### Múltiplas Filas com Realimentação
- Processos podem trocar de fila
- Novo processo começa na fila de maior prioridade
- A cada preempção, vai para fila de menor prioridade

## Detalhes Importantes
- Throughput → maximizar
- Turnaround, espera, resposta → minimizar
- Threads são a unidade de escalonamento (não processos)
- Aging resolve starvation
- Quantum pequeno → muitas trocas de contexto (sobrecarga)
- Quantum grande → vira FIFO