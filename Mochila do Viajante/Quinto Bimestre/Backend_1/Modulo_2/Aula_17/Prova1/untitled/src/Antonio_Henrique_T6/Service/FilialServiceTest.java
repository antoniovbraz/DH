package Antonio_Henrique_T6.Service;

import Antonio_Henrique_T6.DAO.ConfiguracaoJDBC;
import Antonio_Henrique_T6.DAO.impl.FilialDaoH2;
import Antonio_Henrique_T6.Model.Filial;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialServiceTest {
    private static final Logger logger = Logger.getLogger(FilialServiceTest.class);
    FilialService filialService;

    @BeforeEach
    void doBefore(){
        filialService = new FilialService(new FilialDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void salvarFilial(){
        Filial f1 = new Filial(1,"Dunder Mifflin", "Slough Road", 1728, "Scranton", "Pennsylvania", true);
        filialService.salvar(f1);
        assertTrue(f1.getId()!=null);

        Filial f2 = new Filial(2,"Filial 2", "Guarana", 178, "Antartica", "RJ", true);
        filialService.salvar(f2);
        assertTrue(f2.getId()!=null);

        Filial f3 = new Filial(3,"Filial 3", "Coca", 17, "Cola", "SP", true);
        filialService.salvar(f3);
        assertTrue(f3.getId()!=null);

        Filial f4 = new Filial(4,"Filial 4", "Dolly", 28, "Guarana", "MG", false);
        filialService.salvar(f4);
        assertTrue(f4.getId()!=null);

        Filial f5 = new Filial(5,"Filial 5", "Calendario", 72, "Cadeira", "RJ", false);
        filialService.salvar(f5);
        assertTrue(f5.getId()!=null);
    }
}