import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeDescontoTest {
    private FacadeDesconto facadeDesconto = new FacadeDesconto();
    private Cartao cartao;
    private Produto produto;

    @BeforeEach
    void doBefore(){
        cartao = new Cartao("5416879613254672", "Star Bank");
        produto = new Produto("Ervilhas", "Lata");
    }

    @Test
    void validarDescontoDoBancoTest(){
        produto.setTipo("Enlatados");
        int desconto = facadeDesconto.desconto(cartao,produto,1);
        assertEquals(20,desconto);
    }

    @Test
    void validarDescontoDoProdutoTest(){
        cartao.setBanco("Oto Banco");
        int desconto = facadeDesconto.desconto(cartao,produto,1);
        assertEquals(10,desconto);
    }

    @Test
    void validarDescontoPorQuantidade(){
        produto.setTipo("Enlatados");
        cartao.setBanco("Oto Banco");

        int desconto = facadeDesconto.desconto(cartao,produto,12);
        assertEquals(15, desconto);
    }

    @Test
    void validarDescontoTotalTest(){

        int desconto = facadeDesconto.desconto(cartao, produto,12);
        assertEquals(45, desconto);
    }
}