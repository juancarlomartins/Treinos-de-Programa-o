#Criando uma calculadora simples usando python.
##Autor:Juan Carlo Teles Martins
nome = input("Digite o seu nome: ")

print(f"\nOlá, {nome}! Seja bem-vindo ao meu programa de calculadora.\n")


#Criando o loop principal do programa:

while True:
    print("Escolha uma opção:")
    print("1- Soma")
    print("2- Subtração")
    print("3- Multiplicação")
    print("4- Divisão")
    print("0- Encerrar.")

    #Recebendo a escolha do usuário.
    opcao = input("Digite a opção desejada: ")

    if opcao == "0":
        print(f"\nAté logo, {nome}! Obrigado por usa o meu programa.")
        break


    # Caso a opção seja válida, o programa pede os números
    elif opcao in ["1", "2", "3", "4"]:
        num1 = float(input("Digite o primeiro número: "))
        num2 = float(input("Digite o segundo número: "))

        if (opcao == "1"):
            resultado = num1 + num2
            print(f"Certo {nome}, o resultado da operação foi: {resultado}\n")
        elif (opcao == "2"):
            resultado = num1 - num2
            print(f"Certo {nome}, o resultado da operação foi: {resultado}\n")
        elif (opcao == "3"):
            resultado = num1 * num2
            print(f"Certo {nome}, o resultado da operação foi: {resultado}\n")
        elif (opcao == "4"):
            if num2 != 0:
                resultado = num1 / num2
                print(f"Certo {nome}, o resultado da operação foi: {resultado}\n")
            else:
                print("Erro: não é possível fazer divisão por zero.\n")

    # Caso o usuario digite uma opção inválida.
    else:
        print("Opção inválida! Tente novamente.\n")

###Fim do código.