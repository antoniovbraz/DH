import org.apache.log4j.Logger;

public class TestLog {
    private static final Logger logger = Logger.getLogger(TestLog.class);
    public static void main(String[] args) {
        logger.info("Começamos nosso método MAIN");
        try {
            logger.debug("Try da divisão");
            String variable = "Olá";
            int division = 1 / 0;
        } catch (Exception e) {
            logger.error("Erro ao dividir por zero ", e);
        }
        logger.warn("Aviso, o método MAIN está prestes a terminar");
        logger.debug("Isso será mostrado apenas se o infoLogger estiver em DEBUG");
        logger.info("Finalizamos a thread MAIN");
    }
}
