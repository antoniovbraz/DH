package model;

public class Computer {

    private int ram;
    private int HD;

    private static int contador;
    // Initializing the superclass
    public Computer(int ram, int HD) {
        super();
        this.ram = ram;
        this.HD = HD;
        contador++;
        System.out.println("\nContador" + contador);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHD() {
        return HD;
    }

    public void setHD(int HD) {
        this.HD = HD;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", HD=" + HD +
                '}';
    }
}
