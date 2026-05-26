# LISTA 02 - SISTEMAS OPERACIONAIS

## QUESTÃO 01: Analise cuidadosamente as afirmações a seguir, relacionadas a conceitos fundamentais de Sistemas Operacionais. Para cada item, indique se a afirmação está correta ou incorreta. Caso esteja incorreta, reescreva-a de forma conceitualmente adequada, justificando brevemente a correção realizada.

**a) O Sistema Operacional pode ser compreendido tanto como uma máquina estendida, associada à visão top-down, quanto como um gerenciador de recursos, associada à visão bottom-up.**

**Resposta:** **CORRETA.** A visão top-down enxerga o SO como uma máquina estendida que oferece abstrações convenientes ao usuário. A visão bottom-up enxerga o SO como um gerenciador de recursos que aloca e controla o hardware de forma eficiente.

**b) As funções solicitadas por meio de chamadas de sistema podem ser executadas integralmente em modo usuário, sem comprometer a segurança ou a estabilidade do sistema computacional.**

**Resposta:** **INCORRETA.** A afirmação correta é: "As funções solicitadas por meio de chamadas de sistema são executadas em **modo kernel** (ou modo supervisor), pois envolvem operações privilegiadas (acesso a hardware, E/S, gerenciamento de memória) que, se executadas em modo usuário, comprometeriam a segurança e a estabilidade do sistema."

**c) Uma política de escalonamento é considerada preemptiva quando o processador pode ser retirado de um processo antes que ele termine sua execução ou libere voluntariamente a CPU.**

**Resposta:** **CORRETA.** No escalonamento preemptivo, o sistema operacional pode interromper um processo em execução e passá-lo para o estado de pronto, mesmo que ele não tenha terminado ou liberado a CPU voluntariamente.

**d) Variáveis do tipo trava, alternância obrigatória e semáforos são soluções de software para implementação de exclusão mútua e todas dependem, necessariamente, de espera ocupada.**

**Resposta:** **INCORRETA.** A afirmação correta é: "Variáveis do tipo trava e alternância obrigatória são soluções de software que utilizam **espera ocupada (busy wait)**. Já os **semáforos** são mecanismos mais avançados que **não dependem necessariamente de espera ocupada** — quando um processo não consegue acessar o recurso, ele é bloqueado e colocado em estado de espera, liberando a CPU para outros processos."

## QUESTÃO 02: Qual é a diferença entre um processo CPU-bound e um processo I/O-bound? É possível determinar qual é o tipo de um processo por meio de uma análise do seu código? E em tempo de execução? Processos I/O bound merecem prioridade mais alta nos algoritmos de escalonamento? Por quê?

**Resposta:**

**Diferença:**
- **CPU-bound**: Processo que passa a maior parte do tempo no estado de execução, utilizando intensamente o processador. Ex: cálculos científicos, renderização, compressão de arquivos.
- **I/O-bound**: Processo que passa a maior parte do tempo no estado de espera, aguardando operações de entrada/saída. Ex: editores de texto, navegadores web, aplicações interativas.

**Análise do código:** É possível ter uma boa estimativa analisando o código. Um programa com muitas operações matemáticas complexas e poucas chamadas de E/S tende a ser CPU-bound. Um programa com muitas chamadas a arquivos, rede ou entrada do usuário tende a ser I/O-bound.

**Tempo de execução:** Sim, o sistema operacional pode monitorar o comportamento do processo (relação entre tempo de CPU e tempo de espera) e classificá-lo dinamicamente.

**Prioridade mais alta para I/O-bound:** **SIM, processos I/O-bound merecem prioridade mais alta**. Motivo: eles tendem a usar a CPU por pouco tempo e logo entram em espera. Se tiverem prioridade baixa, podem demorar muito para executar e isso afeta a interatividade do sistema (ex: usuário esperando resposta do teclado). Dar prioridade alta permite que eles executem rapidamente e voltem a aguardar E/S, mantendo a CPU disponível para processos CPU-bound.

## QUESTÃO 03: Discorra sobre as semelhanças e diferenças entre semáforos e monitores.

**Resposta:**

**Semelhanças:**
1. Ambos são mecanismos de sincronização entre processos/threads
2. Ambos implementam exclusão mútua
3. Ambos permitem sincronização condicional (através de WAIT/SIGNAL nos monitores e DOWN/UP nos semáforos)
4. Ambos evitam a espera ocupada (bloqueiam processos quando necessário)

**Diferenças:**

| Característica | Semáforo | Monitor |
|----------------|----------|---------|
| Nível | Baixo nível | Alto nível |
| Estrutura | Não-estruturado | Estruturado |
| Implementação | Manual pelo programador | Automática pelo compilador |
| Variáveis | Variável inteira não-negativa | Variáveis globais + procedimentos |
| Exclusão mútua | Implementada explicitamente com semáforos binários | Automática (apenas um processo por vez no monitor) |
| Controle | O programador deve garantir uso correto | O compilador garante a exclusão |
| Portabilidade | Portável entre linguagens | Depende do suporte da linguagem/compilador |
| Exemplos | POSIX semaphores, System V semaphores | Monitores em Java (synchronized), Mesa, Concurrent Pascal |

## QUESTÃO 04: Na figura abaixo, pode-se visualizar as duas formas de se representar sistemas que utilizam threads. Diante disso, responda:

**a) Cite duas vantagens encontradas em sistemas operacionais que utilizam threads.**

**Resposta:**
1. **Minimização de alocação de recursos**: threads compartilham o mesmo espaço de endereçamento, reduzindo o overhead de criação e gerenciamento em comparação com processos.
2. **Comunicação mais rápida**: threads de um mesmo processo podem se comunicar diretamente através da memória compartilhada, sem necessidade de mecanismos complexos de IPC.

**b) Pela Figura, percebe-se que as threads são executadas apenas no espaço do usuário. Cite e comente duas vantagens e duas desvantagens na utilização de sistemas que utilizam threads apenas no espaço do usuário.**

**Resposta:**

**Vantagens:**
1. **Chaveamento mais rápido**: A troca entre threads não requer chamadas ao kernel, apenas a biblioteca de threads gerencia a mudança, resultando em menor overhead.
2. **Portabilidade**: Pode ser implementado em sistemas operacionais que não suportam threads nativamente, pois o kernel enxerga apenas um processo monothread.

**Desvantagens:**
1. **Bloqueio de todo o processo**: Se uma thread realiza uma operação de E/S bloqueante, o kernel bloqueia o processo inteiro, mesmo que outras threads do mesmo processo possam estar prontas para executar.
2. **Não aproveita múltiplos núcleos**: Como o kernel enxerga apenas um processo monothread, as threads não podem ser executadas em paralelo em processadores multicore.

## QUESTÃO 05: Explique a diferença entre modo usuário e modo núcleo (kernel) em um sistema operacional. Em seguida, analise as operações abaixo e indique quais exigem a intervenção do kernel, justificando cada resposta:

**a) Abrir um arquivo armazenado no disco.**

**b) Somar dois valores inteiros armazenados em variáveis locais.**

**c) Criar um novo processo.**

**d) Alterar uma posição de memória pertencente a outro processo.**

**e) Executar uma instrução de desvio condicional dentro do próprio programa.**

**f) Enviar dados para uma impressora.**

**Resposta:**

**Diferença entre modo usuário e modo kernel:**
- **Modo usuário**: Modo de execução restrito onde os programas aplicativos são executados. Não podem executar instruções privilegiadas (acesso direto a hardware, configuração de memória, etc.). Qualquer tentativa gera uma exceção/trap.
- **Modo kernel (supervisor)**: Modo de execução com acesso total ao hardware. O kernel do SO executa nesse modo, podendo executar qualquer instrução e acessar qualquer endereço de memória.

**Análise das operações:**

| Operação | Exige kernel? | Justificativa |
|----------|---------------|---------------|
| a) Abrir um arquivo | **SIM** | Envolve acesso ao sistema de arquivos, permissões, e chamada ao driver de dispositivo do disco |
| b) Somar dois inteiros em variáveis locais | **NÃO** | Operação aritmética simples realizada diretamente pelo processador no modo usuário |
| c) Criar um novo processo | **SIM** | Necessita alocar PCB, espaço de endereçamento, e configurar estruturas internas do SO |
| d) Alterar memória de outro processo | **SIM** | Necessita de proteção de memória. O kernel deve verificar permissões e realizar a operação via IPC ou chamada de sistema específica |
| e) Instrução de desvio condicional | **NÃO** | Instrução normal do programa, executada diretamente pelo processador no modo usuário |
| f) Enviar dados para impressora | **SIM** | Envolve acesso a dispositivo de E/S, que requer instruções privilegiadas e intervenção do driver |

## QUESTÃO 06: Algoritmos de escalonamento de CPU podem ser definidos por diferentes critérios, como ordem de chegada, tempo estimado de execução, prioridade, preempção e fatia de tempo. Além disso, alguns algoritmos podem ser considerados casos particulares de outros, dependendo dos parâmetros adotados.

**Com base nessa ideia, analise os pares de algoritmos a seguir e responda, em cada caso:**
1. há relação entre os dois algoritmos?
2. um pode ser considerado caso particular do outro?
3. quais parâmetros ou critérios justificam essa relação?

**a) Prioridade e SJF (Shortest Job First).**

**Resposta:**
1. **Há relação?** SIM.
2. **Caso particular?** SJF é um caso particular de escalonamento por prioridade.
3. **Parâmetros:** No SJF, a **prioridade é inversamente proporcional ao tempo de CPU estimado** do processo (quanto menor o tempo, maior a prioridade). Ou seja, SJF = escalonamento por prioridade onde a prioridade = 1 / (tempo de CPU estimado).

**b) Múltiplas Filas com Realimentação e FIFO (First In, First Out).**

**Resposta:**
1. **Há relação?** SIM.
2. **Caso particular?** FIFO é um caso particular de Múltiplas Filas com Realimentação.
3. **Parâmetros:** Se o sistema de múltiplas filas com realimentação tiver **apenas uma fila**, com **uma única prioridade**, **sem realimentação** (processos não trocam de fila) e **sem preempção** (ou com quantum infinito), o comportamento se reduz ao FIFO.

**c) Circular (Round Robin) e FIFO (First In, First Out).**

**Resposta:**
1. **Há relação?** SIM.
2. **Caso particular?** FIFO é um caso particular do Round Robin.
3. **Parâmetros:** Round Robin com **quantum de tempo infinito** (ou maior que o tempo de execução de todos os processos) se comporta exatamente como FIFO, pois nenhum processo será interrompido antes de terminar.

## QUESTÃO 07: Dois processos, P1 e P2, compartilham uma variável global saldo, inicialmente igual a 100. O processo P1 executa uma operação de depósito de 50 unidades, enquanto o processo P2 executa uma operação de saque de 30 unidades. Ambas as operações seguem a lógica: ler o valor de saldo, calcular o novo valor e gravar o resultado em saldo.

**a) Explique como pode ocorrer uma condição de corrida nesse cenário.**

**Resposta:** A condição de corrida ocorre quando os dois processos acessam e manipulam a variável compartilhada `saldo` concorrentemente, e o resultado final depende da ordem em que as operações são executadas. Como as operações não são atômicas (lê, calcula, escreve), um processo pode ler o valor antigo enquanto o outro ainda não terminou de escrever, resultando em perda de atualização.

**b) Apresente uma possível intercalação de execução que gere um valor final incorreto para saldo.**

**Resposta:**
| Passo | Processo | Operação | Saldo (memória) | Valor lido | Cálculo |
|-------|----------|----------|-----------------|------------|---------|
| 1 | P1 | Lê saldo | 100 | 100 | - |
| 2 | P2 | Lê saldo | 100 | 100 | - |
| 3 | P1 | Calcula (100+50) | 100 | - | 150 |
| 4 | P2 | Calcula (100-30) | 100 | - | 70 |
| 5 | P1 | Escreve 150 | 150 | - | - |
| 6 | P2 | Escreve 70 | 70 | - | - |

**Resultado final incorreto: 70** (em vez de 120)

**c) Informe qual deveria ser o valor correto de saldo após as duas operações.**

**Resposta:** O valor correto é **120** (100 + 50 - 30 = 120), independentemente da ordem de execução.

**d) Explique como um semáforo binário poderia ser utilizado para evitar o problema.**

**Resposta:** Um semáforo binário (mutex) inicializado com 1 é associado à variável compartilhada `saldo`. Cada processo deve executar `DOWN(mutex)` antes de acessar a região crítica (leitura, cálculo e escrita do saldo) e `UP(mutex)` após terminar. Isso garante que apenas um processo por vez execute a operação completa, evitando a condição de corrida.

```pascal
VAR mutex: Semáforo := 1;

PROCESSO P1:
BEGIN
    DOWN(mutex);
    saldo := saldo + 50;  (* região crítica *)
    UP(mutex);
END;

PROCESSO P2:
BEGIN
    DOWN(mutex);
    saldo := saldo - 30;  (* região crítica *)
    UP(mutex);
END;