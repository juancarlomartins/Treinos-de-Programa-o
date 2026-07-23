# UNIDADE 01 - Introdução aos Sistemas Operacionais

## O que é um SO?
- Programa que gerencia o hardware e atua como intermediário entre usuário e computador.
- **Kernel (núcleo)**: componente central com acesso total ao hardware.

## Funções Básicas
1. Facilidade de acesso aos recursos
2. Compartilhamento organizado e protegido dos recursos

## Metas do SO
- **Eficiência**: maximizar trabalho da CPU
- **Robustez**: tolerante a falhas
- **Escalabilidade**: usa recursos adicionais
- **Portabilidade**: opera em diferentes hardwares
- **Segurança**: impede acesso não autorizado
- **Interatividade**: resposta rápida ao usuário    
- **Usabilidade**: atende bem a base de usuários

## Evolução Histórica    
- 1940-50: Monoprogramáveis
- 1960: Sistemas em lote (batch)
- 1965: MULTICS (base do UNIX)
- 1969: UNIX (multitarefa, multiusuário)
- 1983: GNU
- 1987: MINIX
- 1991: LINUX
- 1984: Mac OS
- 2001: Mac OS X
- 1982: MS-DOS    
- 1990: Windows 3.0
- 2003: Android (baseado em Linux)

## Componentes do Kernel
- Escalonador de processos
- Gerenciador de memória
- Gerenciador de E/S
- Gerenciador de comunicação entre processos (IPC)
- Gerenciador de sistema de arquivos

## Tipos de SO
- **Monoprogramável**: uma tarefa por vez
- **Lote (batch)**: tarefas em lote, sem interação
- **Multiprogramável**: várias tarefas compartilham recursos
- **Tempo compartilhado**: CPU alterna entre tarefas (ex: PCs)
- **Tempo real**: requisitos rígidos de tempo (ex: aviação, usinas)
- **Embarcado**: dispositivos como TV, microondas
- **Multiprocessador**: 2+ CPUs (fortemente ou fracamente acoplado)

## Arquiteturas de SO
- **Monolítica**: todos componentes no núcleo. Vantagem: eficiência. Desvantagem: difícil isolar erros.
- **Híbrida (camadas)**: comunicação apenas entre camadas vizinhas. Vantagem: flexível. Desvantagem: desempenho inferior.
- **Micronúcleo**: núcleo pequeno, maioria dos serviços fora. Vantagem: tolerante a falhas. Desvantagem: mais comunicação.
- **Rede**: acessa recursos em outros computadores.
- **Distribuído**: vários computadores funcionam como um só.

## Visões do SO
- **Bottom-up (gerenciador de recursos)**: gerencia eficientemente o hardware.
- **Top-down (máquina estendida)**: oferece abstrações mais convenientes.