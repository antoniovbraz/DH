package Antonio_Henrique_T6.DAO.impl;

import Antonio_Henrique_T6.DAO.ConfiguracaoJDBC;
import Antonio_Henrique_T6.DAO.IDao;
import Antonio_Henrique_T6.Model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FilialDaoH2 implements IDao <Filial>{
    private static final Logger logger = Logger.getLogger(FilialDaoH2.class);

    private ConfiguracaoJDBC configuracaoJDBC;

    public FilialDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Filial salvar(Filial filiais) {
        logger.info("Iniciando a conexão com o banco de dados " + filiais.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO FILIAIS VALUES('%d','%s','%s','%s','%s','%s','%s')",
                filiais.getId(),
                filiais.getNomeFilial(),
                filiais.getRua(),
                filiais.getNumero(),
                filiais.getCidade(),
                filiais.getEstado(),
                filiais.iseCincoEstrelas());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()){
                filiais.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
            }catch (SQLException e){
            e.printStackTrace();
            logger.error("A conexão com o banco de dados falhou");
        }
        return filiais;
    }
}
