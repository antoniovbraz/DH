import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main{
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Usuariio; CREATE TABLE Usuario"
            +"("
            +"id INT PRIMARY KEY,"
            +"PrimeiroNome VARCHAR(250) NOT NULL,"
            +"Sobrenome VARCHAR(250) NOT NULL,"
            +"Idade INT NOT NULL"
            +");";

    private static final String sqlInsert1 = "INSERT INTO Usuario(id,PrimeiroNome,Sobrenome,Idade)" +
            "VALUES (1,'Antonio','Henrique', 38)";

    private static final String sqlInsert2 = "INSERT INTO Usuario(id,PrimeiroNome,Sobrenome,Idade)" +
            "VALUES (2,'Arthur','Ichihei', 9)";

    private static final String sqlInsert3 = "INSERT INTO Usuario(id,PrimeiroNome,Sobrenome,Idade)" +
            "VALUES (3,'Bruna','Heimbeck', 31)";

    private static final String sqlDelete = "DELETE FROM Usuario WHERE id = 3";

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        Connection connection = null;

        try{
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);

            statement.execute(sqlDelete);

            logger.info("Excluído o usuário com o ID 3");
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            if (connection == null){
                return;
            }
            connection.close();
        }
    }
}
