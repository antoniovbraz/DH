import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDB {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement statement = connection.createStatement();

        String sqlCreateTable = "DROP TABLE IF EXISTS Test; CREATE TABLE Test(Id INT PRIMARY KEY, Nome VARCHAR(255))";
        statement.execute(sqlCreateTable);

        String sqlInsert1 = "INSERT INTO Test(ID, Nome) VALUES (1, 'Oi')";
        String sqlInsert2 = "INSERT INTO Test(ID, Nome) VALUES (2, 'Olá')";
        statement.execute(sqlInsert1);
        statement.execute(sqlInsert2);

        String sqlRead = "SELECT * FROM Test";
        ResultSet resultSet = statement.executeQuery(sqlRead);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
        }
    }
}
