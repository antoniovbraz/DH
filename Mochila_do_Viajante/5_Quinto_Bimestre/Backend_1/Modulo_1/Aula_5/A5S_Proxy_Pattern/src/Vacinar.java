import java.util.Date;

public class Vacinar implements IVacinar{

    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String tipoVacina){
        System.out.println("Usuário(a) " + rg + " vacinado em " + dataVacina + " com sucesso.");
    }
}
