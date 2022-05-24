import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        // Iniciar o metodo Scanner e introduzir ao jogo
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo Pedra, Papel e Tesoura! ");

        System.out.println("Qual o nome do primeiro jogador?");
        String player1 = sc.nextLine();
        System.out.println("Bem Vindo " + player1);
        System.out.println("Qual o nome do segundo jogador?");
        String player2 = sc.nextLine();
        System.out.println("Bem Vindo " + player2);
        // Iniciar um loop do while para manter jogo e criar a saída do jogo
        while (true) {

            System.out.println("Qual a escolha do primeiro jogador? Digite: Pedra, Papel ou Tesoura. Para Sair do jogo pressione *");
            String escolha1 = sc.nextLine();

            // verificar se quer sair do jogo
            if (escolha1.equals("*")) {
                break;
            }

            // Verifica se foi inserido palavras não permitidas
            if (!escolha1.equals("pedra") && !escolha1.equals("papel") && !escolha1.equals("tesoura")) {
                System.out.println("Palavra não permitida");
            } else {
                System.out.println("Qual a escolha do segundo jogador? Digite: Pedra, Papel ou Tesoura. Para Sair do jogo pressione *");
                String escolha2 = sc.nextLine();

                // verificar se quer sair do jogo
                if (escolha2.equals("*")) {
                    break;
                }

                // Verifica se foi inserido palavras não permitidas
                if (!escolha2.equals("pedra") && !escolha2.equals("papel") && !escolha2.equals("tesoura")) {
                    System.out.println("Palavra não permitida");
                }

                if(escolha1.equals(escolha2)){
                    System.out.println("Empatou");
                } else if((escolha1.equals("pedra") && escolha2.equals("tesoura")) ||
                        (escolha1.equals("tesoura") && escolha2.equals("papel")) ||
                        (escolha1.equals("papel") && escolha2.equals("pedra")))
                {
                    System.out.println("Jogador 1 ganhou essa partida");
                }   else {
                    System.out.println("Jogador 2 ganhou essa partida");
                }
            }
        }
        System.out.println("Obrigado por jogar, Pedra, Papel, Tesoura. Até em breve. ;)");
    }
}
