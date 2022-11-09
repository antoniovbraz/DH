public abstract class Vendedor {
    private String nome;
    private String sobrenome;
    private  int pontuacao;
    private String categoria;

    private Integer vendas;

    public Vendedor(String nome, String sobrenome, String categoria) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.categoria = categoria;
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", pontuacao=" + pontuacao +
                ", categoria='" + categoria + '\'' +
                ", vendas=" + vendas +
                '}';
    }

    public abstract void vender();

    public  abstract void  mostrasCategoria();
}
