import java.util.HashMap;

public class FlyweightFactory {
    public static final HashMap<String, Roupa> tamanhoMap = new HashMap<>();

    public static Roupa obterRoupa(String tamanho){
        Roupa roupa = tamanhoMap.get(tamanho);

        if(roupa == null){
            roupa = new Roupa(tamanho);
            tamanhoMap.put(tamanho,roupa);

        }
        return roupa;
    }
}
