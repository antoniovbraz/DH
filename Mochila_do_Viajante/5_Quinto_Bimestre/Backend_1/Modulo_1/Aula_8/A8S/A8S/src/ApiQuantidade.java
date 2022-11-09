public class ApiQuantidade {
    public int desconto(int quantidadeCompradas){
        if (quantidadeCompradas>11){
            return 15;
        } else {
            return 0;
        }
    }
}
