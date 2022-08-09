public class Main {
    public static void main(String[] args) {
        FacadeDesconto facadeDesconto = new FacadeDesconto();

        Cartao cartao = new Cartao("5416879613254672","Star Bank");
        Produto produto = new Produto("Ervilhas","Lata");

        System.out.println("\nDesconto: " + facadeDesconto.desconto(cartao,produto,1));
    }
}
