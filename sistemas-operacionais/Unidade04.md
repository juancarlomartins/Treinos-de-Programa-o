# UNIDADE 04 - Comunicação e Sincronização entre Processos

## Introdução
- Surge na década de 1960 com sistemas multiprogramáveis
- **Aplicações Concorrentes**: execução cooperativa de múltiplos processos ou threads
- Processo cooperativo: pode afetar ou ser afetado por outros processos
- Compartilhamento de recursos (arquivos, memória, E/S) pode causar problemas
- **Sincronização**: necessária para garantir processamento correto e acesso ordenado

## Mecanismos de Comunicação entre Processos
1. **Variáveis Compartilhadas**
2. **Troca de Mensagens**

## Problemas Clássicos de Compartilhamento

### 1. Produtor-Consumidor
- Dois processos compartilham um buffer para troca de informações
- Um produz dados, outro consome

### 2. Compartilhamento de Arquivo em Disco
- Dois processos atualizam o mesmo registro simultaneamente
- Resultado: dado gravado fica inconsistente (ex: saldo bancário)

### 3. Compartilhamento de Variável na Memória Principal
- Processos A e B compartilham a mesma variável X
- Operações concorrentes (X+1 e X-1) podem gerar resultados incorretos

## O Problema da Região Crítica

### Condição de Corrida (Race Condition)
- Vários processos acessam e manipulam os mesmos dados concorrentemente
- O resultado da execução depende da ordem em que o acesso ocorre

### Solução: Exclusão Mútua
- Evitar que dois ou mais processos acessem o mesmo recurso simultaneamente
- Exclusão Mútua deve afetar apenas quando houver acesso ao recurso compartilhado

### Região Crítica
- Parte do programa onde é feito o acesso ao recurso compartilhado
- Dois processos não podem executar suas regiões críticas ao mesmo tempo

### Protocolo da Região Crítica

BEGIN
Entra_Região_Crítica; (* Permissão de Entrada )
Região_Crítica;
Sai_Região_Crítica; ( Emite Aviso de Saída *)
END

## Problemas Relacionados à Exclusão Mútua

### 1. Starvation (Espera Indefinida)
- Processo nunca consegue executar sua região crítica
- **Causas**: critérios de seleção (aleatória, prioridades)
- **Solução**: fila FIFO para cada recurso

### 2. Processo impede fora da região crítica
- Recurso está livre, mas ainda alocado a um processo
- Processo finalizou o uso mas não liberou o recurso
- **Solução**:
  - Desabilitação de interrupções
  - Instrução TestAndSet-Lock (TSL)

## Soluções de Hardware para a Região Crítica

### A. Desabilitação de Interrupções
- Processo desabilita todas as interrupções antes de entrar na região crítica
- Reabilita após sair
- Mudança de contexto só ocorre via interrupções → acesso garantido
- **Limitações**:
  - Não viável em multiprocessadores (afeta apenas a CPU que executou)
  - Multiprogramação comprometida (eficiência diminui)
  - Risco de nunca reabilitar (sistema comprometido)

### B. Instrução TestAndSet-Lock (TSL)
- Instrução de máquina especial (atômica/indivisível)
- Testa e modifica o conteúdo de uma palavra (ou troca conteúdos)
- Trava o barramento de memória (impede outras CPUs de acessar)
- **Vantagens**:
  - Simples implementação em múltiplas regiões críticas
  - Funciona em arquiteturas multiprocessadores
- **Desvantagem**: pode causar starvation (seleção arbitrária)

## Soluções de Software para a Região Crítica

### Algoritmo de Peterson
- Menos complexo que o algoritmo de Dekker
- Utiliza variável VEZ para resolver conflitos gerados pela concorrência
- Não há garantias de funcionamento correto em arquiteturas modernas
- Boa descrição algorítmica para estudo

## Sincronização Condicional

### Espera Ocupada (Busy Wait)
- Processo não consegue entrar na região crítica (já existe outro)
- Processo permanece em looping, testando uma condição
- Consome tempo de processador desnecessariamente
- Pode ocasionar problemas de desempenho

### Solução
- Acesso ao recurso compartilhado exige sincronização vinculada a uma condição
- Caso recurso não esteja pronto, processo fica bloqueado até liberação
- Mecanismos: **Semáforos** e **Monitores**

## Semáforos

### Definição
- Mecanismo de sincronização que implementa exclusão mútua e sincronização condicional
- Variável inteira não-negativa
- Manipulada por duas instruções indivisíveis (execução não pode ser interrompida)

### Instruções do Semáforo
| Instrução | Efeito |
|-----------|--------|
| **DOWN (Wait)** | Decrementa uma unidade do semáforo |
| **UP (Signal)** | Incrementa uma unidade do semáforo |

- Valores negativos não podem ser atribuídos
- Quando executa DOWN com valor 0, o processo entra em estado de espera

### Tipos de Semáforos
- **Binário (Mutex)**: valores 0 ou 1
- **Contador**: qualquer valor inteiro positivo (inclusive 0)

### Semáforo para Exclusão Mútua
- Semáforo binário associado ao recurso compartilhado
- **Vantagem**: não ocorre espera ocupada

```pascal
PROGRAM Semáforo_1;
VAR Semáforo Evento := 1;

PROCEDURE Processo_A;
BEGIN
    DOWN(Evento);
    Região_Crítica_A;
    UP(Evento);
END;

PROCEDURE Processo_B;
BEGIN
    DOWN(Evento);
    Região_Crítica_B;
    UP(Evento);
END;

# Mais alguns conteúdos - Síntese do material

Problemas Clássicos de Sincronização
1. Problema dos Filósofos (Dijkstra)
Mesa com 5 pratos e 5 garfos

Cada filósofo precisa de 2 garfos (esquerda e direita) para comer

Várias soluções podem gerar DEADLOCK

Soluções para evitar deadlock:

Permitir no máximo 4 filósofos à mesa simultaneamente

Filósofo pega ambos os garfos apenas se os dois estiverem disponíveis (em seção crítica)

Solução assimétrica: filósofo ímpar pega esquerda/direita; filósofo par pega direita/esquerda

2. Problema do Barbeiro Dorminhoco
Barbeiro corta cabelo. Se não há clientes, senta na cadeira e dorme

Barbearia: 1 cadeira de barbeiro + 5 cadeiras de espera

Cliente chega:

Se barbeiro trabalhando e há cadeira vazia → senta e espera

Se todas cadeiras ocupadas → vai embora

Se barbeiro dormindo → acorda o barbeiro

Monitores
Definição
Mecanismos de sincronização de alto nível

Mais simples para desenvolvimento de aplicações concorrentes

Considerados estruturados (diferente dos semáforos, considerados não-estruturados)

Manipulados pelo compilador (apesar de definidos pelo programador)

Estrutura do Monitor
Formado por: procedimentos, variáveis e estruturas de dados dentro de um módulo ou pacote

Característica mais importante: implementação automática da exclusão mútua entre os procedimentos declarados

Somente um processo pode executar um dos procedimentos do monitor por vez

Se outro processo chamar um procedimento, aguarda em uma fila

Variáveis globais do monitor são visíveis apenas aos procedimentos internos

Estrutura Básica
text
MONITOR <NomeMonitor>;
    Declaração dos dados compartilhados
    
    Entry Procedimento_1(...)
    BEGIN ... END;
    
    Entry Procedimento_N(...)
    BEGIN ... END;
    
BEGIN
    Inicialização das variáveis globais
END;
Variáveis de Condição
Permitem associar execução de um procedimento a uma condição

Garantem sincronização condicional

Manipuladas por duas instruções:

Instrução	Efeito
WAIT	Processo é colocado em estado de espera
SIGNAL	Libera apenas um processo da fila de espera da condição associada
Vários processos podem estar suspensos aguardando diferentes condições

Monitor organiza os processos em espera usando filas associadas às condições

Vantagens dos Monitores
Regiões críticas definidas como procedimentos

Compilador garante a exclusão mútua

Comunicação apenas via chamadas a procedimentos e parâmetros

Troca de Mensagens
Definição
Mecanismo de comunicação e sincronização entre processos

Requer um canal de comunicação (buffer ou link de rede)

Rotinas principais: SEND e RECEIVE

Tipos de Comunicação
Comunicação Direta
Processo endereça explicitamente o receptor ou transmissor

Permite troca apenas entre dois processos

Desvantagem: mudança de identificação exige alteração e recompilação do código

Comunicação Indireta
Utiliza área compartilhada (mailbox ou port)

Mensagens são colocadas pelo transmissor e retiradas pelo receptor

Características (identificação, capacidade) definidas na criação

Vários processos podem estar associados ao mesmo mailbox

Mais flexível

Conclusão
Exclusão mútua necessária apenas quando processos acessam dados modificáveis compartilhados

Quando acessa dados compartilhados, o processo está em seção (região) crítica

Sistema deve garantir que apenas um processo execute sua seção crítica

Mecanismos de hardware: desabilitação de interrupções, TSL

Mecanismos de software: Algoritmo de Peterson

Mecanismos estruturados: Semáforos e Monitores