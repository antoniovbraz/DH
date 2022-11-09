// Jogo pedra, papel e tesoura
/* Devemos criar o jogo pedra, papel tesoura em JS simples.
O jogor é entre o úsuario e a máquina.
Observações do jogo:
1. Só é declarado um vencedor quem vecer 2 partidas
2. Empate ninguem ganha pontos
*/

// 1. Criar as variáveis para armazenar os pontos(score)
let humanScore = 0;
let botScore = 0;

// 2. Bloco de código para que enquanto(while) não tiver um ganhador o jogo continue
while (botScore < 2 && humanScore < 2) {
  let humanPick = parseInt(prompt("Comece a sua jogada: \n1 - Pedra \n2 - Papel \n3 - Tesoura "));
  alert(`Você escolheu ${humanPick}. \nBoa escolha?`);

  // O bot escolhe o número
  let bot = Math.floor(Math.random() * 3) + 1;
  alert(`O Robô escolheu ${bot}`);

  // Usamos o laço do tipo switch para comparar as escolhas(human vs bot) e
  // adicionamos ao contador(score) o ponto de quem vencer.
  switch (humanPick) {
    case 1:
      if (bot == 2) botScore++;
      else if (bot == 3) botScore++;
      break;
    case 2:
      if (bot == 3) botScore++;
      else if (bot == 1) humanScore++;
      break;
    case 3:
      if (bot == 1) humanScore++;
      else if (bot == 2) humanScore++;
      break;
  }

  alert(`Seus pontos: ${humanScore}\nPontos do Robô: ${botScore}`);
}


alert(botScore > humanScore ? "Robô ganhou" : "Você ganhou!");
