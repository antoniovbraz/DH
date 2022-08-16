import org.junit.jupiter.api.Test;

import java.util.Date;

public class PessoaTest {
    Date data = new Date();

    @Test
    public void vacinar1(){
        Pessoa p1 = new Pessoa("Antonio", "Henrique","952174127", data, "Pfizer");
        IVacinar vacinar = new VacinarProxy();

        vacinar.vacinarPessoa(p1.getRG(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1.toString());
    }
}
