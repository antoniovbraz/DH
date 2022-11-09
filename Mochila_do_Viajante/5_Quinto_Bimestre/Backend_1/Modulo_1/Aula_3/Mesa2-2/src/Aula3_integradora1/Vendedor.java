package Aula3_integradora1;

public abstract class Vendedor {
    protected String nome;
    protected  int vendas = 0;
    protected int pontos_por_venda;

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome + " realizou " +qtdVendas+ " vendas...");
    }

    public abstract int calcularPontos();

    public String mostrarCategoria(){
        int pontosVendedor = calcularPontos();
        return this.nome+ " tem um total de " +pontosVendedor+" pontos e categoriza como " + getNomeCategoria(pontosVendedor);
    }

    private String getNomeCategoria(int pontosVendedor) {
        if(pontosVendedor < 20){
            return "Rookie";
        } else if(pontosVendedor < 31) {
            return "Apprentice";
        } else if (pontosVendedor < 41)
        {
            return "Vendedor Mestre";
        } else {
            return "Vendedor Mestre";
        }
    }
}
