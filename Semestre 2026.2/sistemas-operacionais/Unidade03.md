# UNIDADE 03 - Processos e Threads

## Motivação
- Processo = abstração de um programa em execução
- Permitem operações concorrentes mesmo com 1 CPU
- Recursos são alocados ao processo quando criado ou durante execução
- SO modernos admitem processos com múltiplas threads

## Introdução
- Sistemas antigos: 1 programa por vez
- Sistemas modernos: vários programas carregados e executados concorrentemente
- **Processo**: unidade de trabalho em sistemas de tempo compartilhado

## Modelo de Processo
- Usuário tem impressão de possuir processador exclusivo
- Para concorrência, SO guarda todas as informações do programa interrompido

### Componentes do Processo
1. **Contexto de Hardware**
2. **Contexto de Software**
3. **Espaço de Endereçamento**

### Contexto de Hardware
- Armazenado nos registradores quando em execução
- Quando perde a CPU, SO salva no contexto de hardware
- Inclui:
  - Registradores gerais
  - **Contador de Programa (PC)**: endereço da próxima instrução
  - **Apontador de Pilha (SP)**: endereço do topo da pilha
- Fundamental em ambientes multiprogramáveis
- **Mudança de contexto**: troca de um processo por outro no processador

### Contexto de Software
- Especifica características e limites dos recursos alocados
- Composto por: Identificação, Quotas, Privilégios

#### Identificação
- **PID (Process ID)**: identificador único do processo
- **UID (User ID)**: identificação do usuário/dono
- UID permite implementar modelo de segurança

#### Quotas
- Limites de recursos que um processo pode alocar:
  - Máximo de arquivos abertos
  - Tamanho máximo de memória
  - Máximo de operações de E/S pendentes

#### Privilégios
- Definem ações que o processo pode fazer
- Sobre si mesmo, sobre outros processos, sobre o SO
- Níveis: root, administrator (mais amplos/poderosos)

### Espaço de Endereçamento
- Área de memória do processo (instruções + dados)
- Cada processo tem seu próprio espaço protegido

## Bloco de Controle de Processo (PCB)
- Estrutura de dados que implementa o processo
- Guarda: contexto de hardware, software e endereçamento
- PCBs residem em área exclusiva do SO na memória principal
- Tamanho limitado por parâmetro (máx. processos simultâneos)

## Estados do Processo (Ciclo de Vida)
| Estado | Descrição |
|--------|-----------|
| **Novo (New)** | Processo está sendo criado |
| **Execução (Running)** | Instruções sendo executadas (usando CPU) |
| **Pronto (Ready)** | Aguardando para ser executado |
| **Espera (Wait)** | Aguarda evento externo ou recurso |
| **Finalizado (Terminated)** | Processo terminou, PCB removido |

## Criação de Processo
### Três formas principais:
1. **Logon interativo**: usuário fornece nome e senha
2. **Linguagem de comandos**: comandos criam novos processos
3. **Rotina do SO**: a partir de programa executável

### Tipos de criação
- **Processos Independentes**: sem vínculo com criador, PCB próprio
- **Subprocessos (Processo filho)**: hierarquia, processo pai e filho
  - Se o pai termina, filhos são eliminados
  - Pai pode compartilhar recursos com filhos

## Tipos de Processo
- **Foreground**: comunicação direta com usuário durante processamento
- **Background**: sem comunicação com usuário (batch)
- **Processos Pipe**: saída de um processo ligada à entrada de outro

## Classificação por Comportamento
- **CPU-bound**: maior parte do tempo em execução (usando CPU)
- **I/O-bound**: maior parte do tempo esperando E/S

## Escalonamento de Processos
- Multiprogramação: manter processos executando o tempo todo
- Objetivos do escalonamento:
  - Manter processador ocupado
  - Balancear uso entre processos
  - Limitar tempo de CPU por processo

## Processos Monothread vs Multithread

### Monothread
- Suporta apenas um programa no espaço de endereçamento
- Concorrência com múltiplos processos independentes
- Ex: MS-DOS, Windows iniciais
- **Desvantagens**:
  - Alto consumo de CPU (criação/desalocação)
  - Comunicação difícil e lenta (cada processo tem espaço próprio)

### Multithread
- Compartilha espaço de endereçamento com várias threads
- Concorrência dentro do mesmo processo
- Ex: maioria dos SO modernos

## Threads
- Introduzidas para reduzir tempo de criação, eliminação e troca de contexto
- Processo pode suportar múltiplas threads
- Cada thread associada a uma parte do código
- Possuem próprio contexto de hardware, mas compartilham contexto de software e espaço de endereçamento

### Motivação para criação de threads
1. **Projeto de software**: modularidade, segmentos independentes
2. **Desempenho**: execução paralela reduz tempo
3. **Cooperação**: comunicação via espaço de endereçamento compartilhado

### Vantagens das threads
- Minimiza alocação de recursos
- Diminui overhead de criação, troca e eliminação
- Resposta a múltiplas solicitações concorrentes
- Comunicação mais rápida (espaço compartilhado)
- Separa unidade de alocação de recursos da unidade de escalonamento

### Bloco de Controle de Thread (TCB)
| Por Processo | Por Thread |
|--------------|------------|
| Espaço de Endereçamento | Contador de Programa |
| Variáveis Globais | Registradores |
| Arquivos Abertos | Pilha |
| Processos Filhos | Estado |
| Alarmes Pendentes | - |
| Sinais | - |

## Arquiteturas de Threads

### Threads no Espaço do Usuário
- Pacote de threads dentro do modo usuário
- Kernel não sabe da existência
- Funciona em SO que não suporta threads
- Vantagem: chaveamento mais rápido
- Desvantagem: se uma thread bloqueia, bloqueia o processo inteiro

### Threads no Espaço do Kernel
- Kernel conhece e gerencia as threads
- Kernel mantém tabela de threads do sistema
- Vantagem: se uma thread bloqueia, kernel pode executar outra
- Desvantagem: maior custo de criação/destruição
- Permite uso de múltiplos processadores/núcleos

### Threads Híbridas
- Combinação de threads usuário + kernel
- Multiplexa threads de usuário sobre threads de kernel
- Programador decide quantos threads de kernel usar
- Máximo de flexibilidade

### Ativação do Escalonador
- Copia funcionalidade de threads de kernel com melhor desempenho
- Evita transições desnecessárias usuário ↔ kernel
- Sistema de tempo real pode bloquear thread e escalonar outro

## Sinais
- Interrupções geradas por software, SO ou processos
- **Sinal síncrono**: resultado direto de instrução executada
- **Sinal assíncrono**: evento não relacionado com instrução corrente

## Bibliotecas de Threads

### POSIX Pthreads
- Padrão IEEE 1003.1c
- Portável entre sistemas
- Implementada em Solaris, Linux, Mac OS X, Tru64 UNIX
- Chamadas principais:
  - `pthread_create` - cria thread
  - `pthread_exit` - conclui thread
  - `pthread_join` - espera thread finalizar
  - `pthread_yield` - libera CPU

### Win32
- API principal da Microsoft
- Biblioteca no nível do kernel
- Chamadas: `CreateThread()`, `TerminateThread()`, `WaitForSingleObject()`

### Java
- Threads são modelo fundamental
- Todo programa Java tem pelo menos uma thread
- API implementada usando biblioteca do sistema hospedeiro
- JVM executada sobre SO hospedeiro

## Conclusão
- Processo = programa em execução, muda de estado (ciclo de vida)
- SO fornece mecanismo para processos pai criarem filhos
- Thread = fluxo de controle dentro de um processo
- Multithread = processo com vários fluxos de controle
- Threads podem ser: nível usuário, kernel, híbridas, ativação por escalonador