import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) throws Exception{

        Leao leao = new Leao("Simba", 3, true);
        leao.correr();
        leao.eMaiorQue10();

        try{
            leao.eMaiorQue10();
        }
        catch (Exception e){
            logger.error("A idade do leão " + leao.getNome() + " " + leao.getIdade() + " é inferior a 10.", e);
        }

    }
}
