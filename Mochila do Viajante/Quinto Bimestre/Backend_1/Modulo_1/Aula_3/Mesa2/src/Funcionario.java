import java.time.LocalDate;

public class Funcionario extends Vendedor{

    public LocalDate dataInicio;

    public  int numeroAfiliados;

    public Funcionario(String nome, String sobrenome, String categoria) {
        super(nome, sobrenome, categoria);
        this.numeroAfiliados = numeroAfiliados;
    }

    @Override
    public void vender() {

    }

    @Override
    public void mostrasCategoria() {

    }
}
