public abstract class Conta {
    private double saldo;
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract void sacar(double valor);

    public double informarSaldo() {
        return saldo;
    }

    public void setSaldo(){
        this.
    }
}
