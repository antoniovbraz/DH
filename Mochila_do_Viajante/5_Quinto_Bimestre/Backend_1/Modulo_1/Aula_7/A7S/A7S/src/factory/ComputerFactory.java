package factory;

import model.Computer;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {
    public static Map<String, Computer> macFlyweight = new HashMap<>();

    public Computer getComputer(int ram, int disco){
        String id = "id " + ram + " : " + disco;
        System.out.println(id);

        if (!macFlyweight.containsKey(id)){
            macFlyweight.put(id, new Computer(ram,disco));
            System.out.println("\nPC criado com sucesso.");
            return macFlyweight.get(id);
        }
        System.out.println("\nPC obtido");
        return macFlyweight.get(id);
    }
}
