package Aula3_integradora1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
    Funcionario func1, func2;
    Afiliado afi1, afi2, afi3;

    @BeforeEach
    public void doBefore(){
        func1 = new Funcionario("Antonio", 5);
        func1.vender(10);

        func2 = new Funcionario("Pedro",2);
        func2.vender(2);

        afi1 = new Afiliado("Ramon");
        afi1.vender(4);

        afi2 = new Afiliado("Paulo");
        afi2.vender(1);

        afi3 = new Afiliado("Jose");

        func1.addAfiliado(afi1);
    }

    @Test
    public void mostrarVendedores(){
        System.out.println(func1.mostrarCategoria());
        System.out.println(func2.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(afi2.mostrarCategoria());
        System.out.println(afi3.mostrarCategoria());
    }
}
