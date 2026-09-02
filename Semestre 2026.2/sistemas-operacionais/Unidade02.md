# UNIDADE 02 - Estrutura dos Sistemas Operacionais

## Visões de Análise de um SO
- Pelos serviços que oferece
- Pela interface que disponibiliza aos usuários
- Pelos seus componentes e suas interconexões

## Serviços e Funções do SO (para o usuário)

### Execução de Programas
- Carregar programa na memória e executá-lo
- Encerrar normalmente ou por erro

### Operações de E/S
- Leitura/escrita em arquivos ou dispositivos

### Manipulação do Sistema de Arquivos
- Criar, ler, gravar, excluir arquivos e diretórios
- Procurar e listar arquivos

### Comunicação entre Processos
- Troca de informações (mesmo computador ou rede)
- Formas: memória compartilhada ou troca de mensagens

### Detecção de Erros
- Hardware (CPU, memória, E/S) ou software do usuário
- SO deve tomar medidas apropriadas para cada erro

## Serviços para Eficiência do Sistema

### Alocação de Recursos
- Necessária quando há múltiplos usuários/tarefas ativos

### Contabilização
- Controlar qual usuário usa quais recursos
- Estatísticas de uso ou responsabilização

### Proteção e Segurança
- **Proteção**: controle de acesso a recursos
- **Segurança**: autenticação de usuários

## Interfaces de Usuário
- **Interface de linha de comando** (CLI)
- **Interface gráfica** (GUI)
- **Interface batch** (comandos em arquivos)

## Dispositivos de Hardware

### Placa-mãe
- Conjunto de circuitos eletrônicos interligados
- **Pistas**: canais de comunicação delgados de silício
- **Barramento (bus)**: conjunto de pistas (alta velocidade)
  - Tipos: controle/instrução, endereçamento, dados
- **BIOS**: armazena instruções para inicialização e gerenciamento básico

### Processador
- Executa fluxo de instruções em linguagem de máquina
- **ULA (ALU)**: unidade lógica e aritmética

#### Registradores
- **Propósito geral**: alta velocidade, guardam dados temporários
- **Dedicados (uso específico)**:
  - **Contador de Instruções (PC)**: endereço da próxima instrução
  - **Apontador de Pilha (SP)**: topo da pilha
  - **Registrador de Status**: informações sobre execução de instruções

### Hierarquia de Memória
- Compromisso custo/desempenho
- Do topo (mais rápida/cara) para a base (mais lenta/barata):
  - Registradores
  - Cache
  - Memória Principal (DRAM)
  - SSD/Flash
  - Disco Rígido (HD)

### Dispositivos de E/S
- **Armazenamento secundário**: grande capacidade, baixo custo
- **Interface Homem-Computador**: comunicação com o mundo externo

### Barramentos
- **Processador-memória**: curto, alta velocidade
- **E/S**: longo, mais lento, conecta dispositivos (ex: PCI Express)
- **Backplane**: integra barramento de E/S com processador-memória

### DMA (Direct Memory Access)
- Habilita dispositivos a transferir dados diretamente para memória
- Libera o processador para outras tarefas
- Melhora desempenho em operações de E/S
- **DVMA**: versão com endereços virtuais

## Suporte de Hardware para o SO

### Processadores
- Mecanismos de proteção (instruções privilegiadas, acesso à memória)

### Interrupções vs Exceções
- **Interrupção**: sinal de dispositivo ao processador
- **Exceção**: resposta a erro (falha de hardware, violação de proteção)

### Temporizador
- Gera interrupção periódica, impede monopólio do processador

### Relógio
- Segue horário normal (precisão de ms ou µs)

### Plug and Play
- Hardware se identifica, informa recursos e driver necessário
- Configuração automática sem interação do usuário

## Dispositivos de Software

### Tradutor
- Converte programa fonte para executável
- Tipos: Montador, Compilador, Interpretador

### Montador (Assembler)
- Traduz linguagem de montagem → linguagem de máquina
- Particular para cada processador (não portável)

### Interpretador
- Traduz e executa linha a linha durante a execução
- Mais lento, mas consome menos memória
- Ex: JavaScript, Python, PHP

### Linker
- Gera um único executável a partir de um ou mais módulos-objeto
- Resolve referências simbólicas
- Reserva memória para execução

### Loader
- Carrega programa na memória principal para execução
- **Absoluto**: conhece endereço inicial
- **Relocável**: pode carregar em qualquer posição

### Depurador (Debugger)
- Permite acompanhar execução para detectar erros lógicos

### Interpretador de Comandos (Shell)
- Permite comunicação do usuário com o SO

## Inicialização do Sistema (Boot)

### Bootstrap (Carregador Bootstrap)
- Pequeno bloco de código em firmware (ROM)
- Localiza o kernel, carrega na memória e inicia execução

### Processo de Boot
1. CPU recebe evento de inicialização
2. Registrador de instruções carregado com endereço pré-definido
3. Bootstrap executa diagnósticos
4. Lê bloco fixo do disco (ex: bloco zero)
5. Carrega e executa código desse bloco
6. Bootstrap percorre sistema de arquivos, encontra o kernel
7. Carrega kernel na memória e inicia execução

### Observações
- SO pequenos (celulares, consoles) podem estar inteiros em ROM
- SO grandes: bootstrap em firmware, SO em disco

### Termos técnicos
- **EEPROM**: memória somente leitura programável apagável eletronicamente
- **CMOS**: semiconductor de óxido metálico complementar
- **MBR**: registro mestre de inicialização
- **PRB**: partição de registro de inicialização

## Conclusão
- SO é primeiramente um gerenciador de recursos
- Projeto ligado aos recursos de software e hardware
- Placa-mãe concentra os componentes físicos
- Boot: CPU → firmware (bootstrap) → carrega kernel → SO em execução