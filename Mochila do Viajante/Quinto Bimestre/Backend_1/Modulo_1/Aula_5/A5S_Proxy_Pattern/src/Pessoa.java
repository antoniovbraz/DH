import java.util.Date;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String RG;
    private Date dataVacina;
    private String nomeVacina;

    public Pessoa(String nome, String sobrenome, String RG, Date dataVacina, String nomeVacina) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.dataVacina = dataVacina;
        this.nomeVacina = nomeVacina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getDataVacina() {
        return dataVacina;
    }

    public void setDataVacina(Date dataVacina) {
        this.dataVacina = dataVacina;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", RG='" + RG + '\'' +
                ", dataVacina=" + dataVacina +
                ", nomeVacina='" + nomeVacina + '\'' +
                '}';
    }
}
