#encoding:UTF-8
# Importado as bibliotecas random e sys para o programa
import random
import sys

# Implementação de ppontuação
userScore = 0
pcScore = 0
totalScore = 0

# Metodo para calcular a porcentagem de vitorias
def percent():
    if totalScore > 0:
            x = ((totalScore - pcScore) * 100)
            return x
    elif totalScore == 0:
            x = 0
            return x


# Criado o metodo para pegar o input do usuario 
def get_int():
    userdata = input("Digite um número, ou 's' para sair do programa ")
    # Fazemos o uso do IF para que Se o usuario digitar a letra 's' o programa é encerrado
    if userdata == 's':
        print ("Nos vemos!")
        sys.exit() # metodo importado da biblioteca sys que encerra o programa
    try:
        user_num = int(userdata) # Captura o numero do usuario
        return user_num 
    except ValueError: # validar que o input é realmente um numero
        print("Precisa de um número para continuar: ")
        return(get_int())
# Criado o while para que o bloco continue executando caso o usuario digite um numero fora do range
while True: 
    aleatorio = random.randrange(0, 5)
    escolhaPc = ""
    again = ""
    print("1)Pedra")
    print("2)Papel")
    print("3)Tesoura")
    print("4)Lagarto")
    print("5)Spock")
    print("6)Show Scores")
    opcao = get_int()
    # associamos o input numerico do usuario a uma string
    if opcao == 1:
        escolhaUsuario = "pedra"
    elif opcao == 2:
        escolhaUsuario = "papel"
    elif opcao == 3:
        escolhaUsuario = "tesoura"
    elif opcao == 4:
        escolhaUsuario = "lagarto"
    elif opcao == 5:
        escolhaUsuario = "spock"
    elif opcao == 6:
        escolhaUsuario = "Pontuação"
        print ("Pontuações: ")
        print ("Usuário: ", userScore)
        print("PC: ", pcScore)
        print ("Porncentagem de vitórias: ", percent(), "% ")
    else:
        print("Opção Invalida")
        continue
    print("Você escolheu: ", escolhaUsuario)    
    # associamos o random numerico do pc a uma string
    if aleatorio == 0:
        escolhaPc = "pedra"
    elif aleatorio == 1:
        escolhaPc = "papel"
    elif aleatorio == 2:
        escolhaPc = "tesoura"
    elif aleatorio == 3:
        escolhaPc = "lagarto"
    elif aleatorio == 4:
        escolhaPc = "spock"
    print("PC escolheu: ", escolhaPc)
    print("...")
    # Comparamos as escolhas do usuario e do pc para definir o ganhador da rodada
    if escolhaPc == "pedra" and escolhaUsuario == "papel":
        print("Ganhou, papel cobre pedra")
        pcScore += 1
    elif escolhaPc == "papel" and escolhaUsuario == "tesoura":
        print("Ganhou, tesoura corta papel")
        pcScore += 1
    elif escolhaPc == "tesoura" and escolhaUsuario == "pedra":
        print("Ganhou, pedra amassa tesoura")
        pcScore += 1
    elif escolhaPc == "lagarto" and escolhaUsuario == "pedra":
        print("Ganhou, pedra esmaga a lagarto")
        pcScore += 1
    elif escolhaPc == "lagarto" and escolhaUsuario == "tesoura":
        print("Ganhou, tesoura decapita a Lagarto")
        pcScore += 1
    elif escolhaPc == "tesoura" and escolhaUsuario == "spock":
        print("Ganhou, Spock quebra tesoura")
        pcScore += 1
    elif escolhaPc == "spock" and escolhaUsuario == "lagarto":
        print("Ganhou, lagarto envenena a Spock")
    elif escolhaPc == "papel" and escolhaUsuario == "lagarto":
        print ("Ganhou, lagarto come papel")
        pcScore += 1
    elif escolhaPc == "spock" and escolhaUsuario == "papel":
        print ("Ganhou, papel refuta a Spock")
        pcScore += 1
    elif escolhaPc == "pedra" and escolhaUsuario == "spock":
        print ("Ganhou, Spock vaporiza pedra")
        pcScore += 1
        
    if escolhaUsuario == "pedra" and escolhaPc == "papel":
        print("Perdeu, papel cobre pedra")
        userScore += 1
    elif escolhaUsuario == "papel" and escolhaPc == "tesoura":
        print("Perdeu, tesoura corta papel")
        userScore += 1
    elif escolhaUsuario == "tesoura" and escolhaPc == "pedra":
        print("Perdeu, pedra amassa tesoura")
        userScore += 1
    elif escolhaUsuario == "lagarto" and escolhaPc == "pedra":
        print("Perdeu, pedra esmaga a lagarto")
        userScore += 1
    elif escolhaUsuario == "lagarto" and escolhaPc == "tesoura":
        print("Perdeu, tesoura decapita a Lagarto")
        userScore += 1
    elif escolhaUsuario == "tesoura" and escolhaPc == "spock":
        print("Perdeu, Spock quebra tesoura")
        userScore += 1
    elif escolhaUsuario == "spock" and escolhaPc == "lagarto":
        print("Perdeu, lagarto envenena a Spock")
        userScore += 1
    elif escolhaUsuario == "papel" and escolhaPc == "lagarto":
        print ("Perdeu, lagarto come papel")
        userScore += 1
    elif escolhaUsuario == "spock" and escolhaPc == "papel":
        print ("Perdeu, papel refuta a Spock")
        userScore += 1
    elif escolhaUsuario == "pedra" and escolhaPc == "spock":
        print ("Perdeu, Spock vaporiza pedra")
        userScore += 1
    elif escolhaPc == escolhaUsuario:
        print("Empate")
    # Criado o While para continuar executando o bloco até que o usuario queira sair do jogo,
    # e filtramos o input do usuario
    while again == "":
        again = input("Vamos jogar de novo? s/n: ")
        if 's' in again:
            break
        elif 'n' in again:
            print("Nos vemos!")
            sys.exit()
        else:
            print("Valor Invalido")
            again = ""
            continue 