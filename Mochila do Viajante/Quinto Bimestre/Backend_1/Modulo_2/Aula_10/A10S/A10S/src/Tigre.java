import org.apache.log4j.Logger;

public class Tigre {
    private static final Logger logger = Logger.getLogger(Tigre.class);
    private String nome;
    private int idade;

    public Tigre(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    public void correr(){
        logger.info("O tigre " + nome + " está correndo.");
    }


    public void eMaiorQue10() throws Exception {
        if(idade>10){
            logger.info("O tigre " + nome + " tem mais de 10 anos.");
        } else
        {
            logger.info("A idade e/ou boolean do " + nome + " é falso");
        }

        if (idade < 0){
            logger.error("A idade precisa ser superior a zero");
            throw new Exception();
        }
    }
}
