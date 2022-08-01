public class UsuarioJogo {
    private String nome;
    private  String nickName;
    private String pontuacao;
    private int nivel;

    public UsuarioJogo (String nome, String nickName, String pontuacao, int nivel) {
        this.nome = nome;
        this.nickName = nickName;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setPontuacao() {
        this.pontuacao += 1;
    }

    public void setNivel(int nivel) {
        this.nivel += 1;
    }

    public void bonus(String valor){
        this.pontuacao += valor;
    }

}
