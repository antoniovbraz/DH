public class Cartao implements StrategyTaxa {
    private int qtdMaximaParcelas;

    public Cartao(int qtdMaximaParcelas) {
        this.qtdMaximaParcelas = qtdMaximaParcelas;
    }

    @Override
    public double calculaTaxa(Pedido pedido) {
        return pedido.getQtdDeParcelas() > qtdMaximaParcelas ?
                pedido.getValor() * 0.88 : 0;
    }
}
