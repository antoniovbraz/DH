import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    private static Map<String, Arvore> arvoreFlyweight = new HashMap<>();

    public Arvore getArvore(int altura, int largura, String cor){
        String id = "";
        if (altura == 200 && largura == 400 && cor == "verde" ){
            id = "Ornamentais";
        }
        if (altura == 500 && largura == 300 && cor == "vermelho"){
            id = "Frutíferas";
        }
        if (altura == 100 && largura == 200 && cor == "azul"){
            id = "Florífera";
        }

        if(!arvoreFlyweight)
    }
}
