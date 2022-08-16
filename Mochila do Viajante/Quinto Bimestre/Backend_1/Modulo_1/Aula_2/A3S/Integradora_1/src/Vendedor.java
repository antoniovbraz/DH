public abstract class Vendedor {
    // Design Pattern -- Template method

    protected String nome;
    protected  int vendas = 0;
    protected int pontos_por_venda;


    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome + " realizou " + qtdVendas + " vendas.");
    }

    // Calcular os pontos do vendedor de conforme a regra de negocio para cada tipo de vendedor.
    public abstract int calcularPontos();

    // Template Method - Que a partir dos pontos que o vendedor tem mostra em qual patamar(categoria) ele pertence(o vendedor).
    public String mostrarCategoria(){
        int pontosVendedor = calcularPontos();
        return this.nome + " tem um total de " + pontosVendedor + " pontos e por esse motivo seu nível é: "
                + getNomeCategoria(pontosVendedor);
    }

    // Categorizo conforme os pontos recebidos
    private String getNomeCategoria (int pontosVendedor){
        if (pontosVendedor < 20){
            return "Vendedor Novato";
        } else if (pontosVendedor < 31) {
            return "Vendedor Aprendiz";
        } else if (pontosVendedor < 41) {
            return "Vendedor Bom";
        } else {
            return "Vendedor Mestre";
        }
    }
}
