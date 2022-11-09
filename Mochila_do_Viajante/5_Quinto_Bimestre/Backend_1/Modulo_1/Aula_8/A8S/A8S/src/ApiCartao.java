public class ApiCartao {
    public int desconto(Cartao cartaoCliente){
        if (cartaoCliente.getBanco().compareTo("Star Bank")==0){
            return 20;
        } else {
            return 0;
        }
    }
}
