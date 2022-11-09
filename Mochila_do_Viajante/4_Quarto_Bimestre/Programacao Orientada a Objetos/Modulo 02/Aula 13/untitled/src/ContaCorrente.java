public class ContaCorrente extends Conta implements GravarImposto {
    private double valorPermitido;

    public ContaCorrente(double valorPermitido) {
        this.valorPermitido = valorPermitido;
    }

    @Override
    public void sacar(double valor) {
        if (valor == 0 || valor > valorPermitido)
            throw new IllegalStateException("Valor inválido");

        if(valor > getSaldo()) {
            setSaldo(0);
        } else {
            setSaldo(getSaldo() - valor);
        }
    }

    @Override
    public void imposto(double porc){

    }

}
