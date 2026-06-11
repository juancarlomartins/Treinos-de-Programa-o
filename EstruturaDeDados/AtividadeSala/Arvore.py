class No:
    def __init__(self, valor):
        self.valor = valor
        self.esquerdo = None
        self.direito = None

# Função para criar nós
def criar_no(valor):
    return No(valor)

# 1. Criando todos os nós usando a função
raiz = criar_no(50)
no30 = criar_no(30)
no70 = criar_no(70)
no20 = criar_no(20)
no40 = criar_no(40)
no60 = criar_no(60)
no80 = criar_no(80)

# 2. Montando a árvore    
raiz.esquerdo = no30
raiz.direito = no70

no30.esquerdo = no20
no30.direito = no40

no70.esquerdo = no60
no70.direito = no80

# 3. Imprimindo os valores
print("=== VALORES DA ÁRVORE ===")
print(f"Raiz: {raiz.valor}")
print(f"Filho esquerdo da raiz: {raiz.esquerdo.valor}")
print(f"Filho direito da raiz: {raiz.direito.valor}")
print(f"Filho esquerdo de 30: {no30.esquerdo.valor}")
print(f"Filho direito de 30: {no30.direito.valor}")
print(f"Filho esquerdo de 70: {no70.esquerdo.valor}")
print(f"Filho direito de 70: {no70.direito.valor}")