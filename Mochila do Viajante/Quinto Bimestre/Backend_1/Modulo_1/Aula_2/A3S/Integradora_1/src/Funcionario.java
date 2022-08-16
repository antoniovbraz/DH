import java.util.ArrayList;

public class Funcionario extends Vendedor {
    private int anosExperiencia;

    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Funcionario(String nome, int anosExperiencia) {
        super.nome = nome;
        super.pontos_por_venda = 5;
        this.anosExperiencia = anosExperiencia;
    }

    // Metodo para vincular afiliado ao Funcionario e efetuar a soma dos pontos
    public void addAfiliado(Vendedor afiliado){
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nome + " agora é afiliado de " + super.nome);
    }

    // Aqui implemento o metodo abstrato dessa classe de acordo com a regra de negocio para Funcionario.
    @Override
    public int calcularPontos(){
        return (this.afiliados.size()*10)+(this.anosExperiencia*5);
    }
}
