nome = input("Qual o seu nome? ")
idade = int(input(f"Seja bem-vindo {nome}, qual a sua idade? "))

if (idade >= 18):
    print(f"Parabéns {nome}! Você já pode tirar carteira de motorista.\n")
else:
    print(f"Você ainda é menor de idade {nome}, mas futuramente poderá tirar sua carteira de motorista.")
    
print(f"\nFim do programa. Volte sempre {nome}!")
print("\n\n")