import random  # Biblioteca para gerar números aleatórios

def merge_sort(vetor):
    """
    Função principal do Merge Sort
    Divide o vetor recursivamente até ter subvetores de tamanho 1,
    depois mescla de forma ordenada.
    
    Parâmetro:
    vetor - lista de números a ser ordenada
    
    Retorno:
    lista ordenada
    """
    
    # CASO BASE: se o vetor tem 0 ou 1 elemento, já está ordenado
    # Esta é a condição de parada da recursão
    if len(vetor) <= 1:
        return vetor
    
    # PASSO 1: DIVIDIR - Encontra o ponto médio do vetor
    # Usa // para divisão inteira (ex: 5//2 = 2)
    meio = len(vetor) // 2
    
    # Divide o vetor em duas metades
    # vetor[:meio] - do início até o meio (excluindo o meio)
    # vetor[meio:] - do meio até o final
    esquerda = vetor[:meio]
    direita = vetor[meio:]
    
    # PASSO 2: CONQUISTAR - Chama recursivamente o merge_sort para cada metade
    # Isso vai continuar dividindo até chegar em subvetores de tamanho 1
    esquerda_ordenada = merge_sort(esquerda)
    direita_ordenada = merge_sort(direita)
    
    # PASSO 3: COMBINAR - Mescla as duas metades já ordenadas
    return mesclar(esquerda_ordenada, direita_ordenada)


def mesclar(esquerda, direita):
    """
    Função que mescla duas listas já ordenadas em uma única lista ordenada
    
    Parâmetros:
    esquerda - primeira lista (já ordenada)
    direita - segunda lista (já ordenada)
    
    Retorno:
    lista mesclada e ordenada
    """
    
    resultado = []  # Lista que vai armazenar o resultado da mesclagem
    i = 0  # Índice/ponteiro para percorrer a lista esquerda
    j = 0  # Índice/ponteiro para percorrer a lista direita
    
    # Enquanto ambas as listas ainda tiverem elementos para comparar
    # O loop continua enquanto i e j não chegaram ao final de suas listas
    while i < len(esquerda) and j < len(direita):
        
        # Compara o elemento atual da esquerda com o da direita
        if esquerda[i] <= direita[j]:
            # Se o da esquerda é menor ou igual, coloca ele no resultado
            resultado.append(esquerda[i])
            i += 1  # Avança o ponteiro da esquerda
        else:
            # Se o da direita é menor, coloca ele no resultado
            resultado.append(direita[j])
            j += 1  # Avança o ponteiro da direita
    
    # Após sair do loop, pode sobrar elementos em UMA das listas
    
    # Adiciona os elementos restantes da lista esquerda (se houver)
    # Estes elementos já são maiores que todos os que foram adicionados
    while i < len(esquerda):
        resultado.append(esquerda[i])
        i += 1
    
    # Adiciona os elementos restantes da lista direita (se houver)
    while j < len(direita):
        resultado.append(direita[j])
        j += 1
    
    # Retorna a lista completamente mesclada e ordenada
    return resultado


def gerar_vetor_aleatorio(tamanho):
    """
    Gera um vetor com números aleatórios entre 1 e 1000
    
    Parâmetro:
    tamanho - quantidade de elementos que o vetor terá
    
    Retorno:
    lista com números aleatórios
    """
    
    vetor = []  # Cria uma lista vazia
    
    # Loop para gerar cada elemento
    for i in range(tamanho):
        # random.randint(1, 1000) gera um número aleatório entre 1 e 1000
        numero_aleatorio = random.randint(1, 1000)
        vetor.append(numero_aleatorio)  # Adiciona o número à lista
    
    return vetor


def exibir_vetor(vetor, titulo):
    """
    Exibe um vetor formatado com um título
    
    Parâmetros:
    vetor - lista a ser exibida
    titulo - texto que aparece antes da lista
    """
    
    print(f"\n{titulo}")   
    print("-" * 50)  # Linha separadora de 50 traços
    
    # Exibe os elementos em linhas de 10 números para facilitar a visualização
    for i in range(0, len(vetor), 10):
        # Pega uma fatia de 10 elementos
        fatia = vetor[i:i+10]
        # Converte cada número para string e junta com espaços
        print(" ".join(str(num) for num in fatia))
    
    print("-" * 50)
    print(f"Total de elementos: {len(vetor)}")


# PROGRAMA PRINCIPAL
def main():  
    """
    Função principal que controla o fluxo do programa
    """
    
    print("=" * 50)
    print("     MERGE SORT - ORDENADOR DE VETORES")
    print("=" * 50)
    
    # Solicita ao usuário o tamanho do vetor
    # O int() converte o texto digitado para número inteiro
    while True:
        try:
            n = int(input("\nQuantos elementos deseja no vetor? "))
            if n <= 0:
                print("Por favor, digite um número positivo!")
                continue
            break
        except ValueError:
            print("Por favor, digite um número válido!")
    
    # Gera o vetor com números aleatórios
    print(f"\nGerando {n} números aleatórios...")
    vetor_original = gerar_vetor_aleatorio(n)
    
    # Exibe o vetor original (desordenado)
    exibir_vetor(vetor_original, "VETOR ORIGINAL (DESORDENADO):")
    
    # Faz uma cópia do vetor para ordenar
    # Isso preserva o original caso queira comparar depois
    vetor_para_ordenar = vetor_original.copy()
    
    # Executa o Merge Sort
    print("\nOrdenando o vetor... Isso pode levar alguns instantes...")
    
    # Marca o tempo inicial
    import time
    inicio = time.time()
    
    # CHAMA O MERGE SORT - Aqui é onde a mágica acontece!
    vetor_ordenado = merge_sort(vetor_para_ordenar)
    
    # Marca o tempo final
    fim = time.time()
    tempo_gasto = fim - inicio
    
    # Exibe o vetor ordenado
    exibir_vetor(vetor_ordenado, "VETOR ORDENADO:")
    
    # Exibe estatísticas
    print("\n" + "=" * 50)
    print("ESTATÍSTICAS:")
    print("=" * 50)
    print(f"Quantidade de elementos: {n}")
    print(f"Tempo de ordenação: {tempo_gasto:.4f} segundos")
    print(f"Menor valor: {vetor_ordenado[0]}")
    print(f"Maior valor: {vetor_ordenado[-1]}")
    
    # Verifica se a ordenação está correta (opcional)
    if vetor_ordenado == sorted(vetor_original):
        print("\n✅ VERIFICAÇÃO: O vetor foi ordenado corretamente!")
    else:
        print("\n❌ VERIFICAÇÃO: Algo deu errado na ordenação!")
    
    print("\n" + "=" * 50)


# Ponto de entrada do programa
# Esta condição garante que o código só executa se for rodado diretamente
# (e não importado como módulo em outro programa)
if __name__ == "__main__":
    main()