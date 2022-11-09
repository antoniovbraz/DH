package A7A;

public class Main {

    private static final  String cores[] = {"roxo", "azul", "verde", "preto"};

    public static void main(String[] args) {
        for (int i = 0; 0 < 100; i++) {
            Circulo circulo = FlyweightFactory.obterCirculo(corAleatoria());
            circulo.setRaio(i + 5);
            circulo.setTamanho("Tamanho: " + i + 2);
            circulo.desenhar();
        }
    }
    private static String corAleatoria(){
        return cores[(int) (Math.random()* cores.length)];
    }
}
