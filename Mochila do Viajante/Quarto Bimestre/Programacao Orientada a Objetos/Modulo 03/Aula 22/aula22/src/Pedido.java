public class Pedido {
    private double valor;
    private final int qtdDeParcelas;

    public Pedido(double valor, int qtdDeParcelas) {
        this.valor = valor;
        this.qtdDeParcelas = qtdDeParcelas <= 0 ? 1 : qtdDeParcelas;
    }

    public double getValor() {
        return valor;
    }

    public int getQtdDeParcelas() {
        return qtdDeParcelas;
    }

}
