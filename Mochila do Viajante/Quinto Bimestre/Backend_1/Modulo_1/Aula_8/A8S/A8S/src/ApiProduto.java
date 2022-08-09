public class ApiProduto {
    public int desconto(Produto produtoLoja){
        if (produtoLoja.getTipo().compareTo("Lata")==0){
            return 10;
        }else{
            return 0;
        }
    }
}
