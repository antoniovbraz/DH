package mesa1;

public class Circulo extends  Figura {

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    double calcularPerimetro() {
        return this.raio*Math.PI*2;
    }
}
