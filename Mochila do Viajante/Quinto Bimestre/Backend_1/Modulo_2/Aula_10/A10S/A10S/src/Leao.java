public class Leao {
    private String nome;
    private  int idade;
    private boolean eAlfa;

    public Leao(String nome, int idade, boolean eAlfa) {
        this.nome = nome;
        this.idade = idade;
        this.eAlfa = eAlfa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean iseAlfa() {
        return eAlfa;
    }

    public void seteAlfa(boolean eAlfa) {
        this.eAlfa = eAlfa;
    }
}
