import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    Funcionario func1, func2;
    Afiliado afil1, afil2, afil3;

    @BeforeEach
    public void doBefore(){
        func1 = new Funcionario("Antonio Henrique", 13);
        func1.vender(5);

        func2 = new Funcionario("Bruna Heimbeck", 13);
        func2.vender(6);

        afil1 = new Afiliado("Ramom");
        afil1.vender(4);

        afil2 = new Afiliado("Paulo");
        afil2.vender(1);


        afil3 = new Afiliado("José");

        func1.addAfiliado(afil1);
    }

    @Test
    public void mostrarVendedores(){
        System.out.println(func1.mostrarCategoria());
        System.out.println(func2.mostrarCategoria());

        System.out.println(afil1.mostrarCategoria());
        System.out.println(afil2.mostrarCategoria());
        System.out.println(afil3.mostrarCategoria());
    }
}
