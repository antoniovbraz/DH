package duke.choice;

/**
 * @author Antonio Henrique S Vanucci Braz
 */

public class Clothing implements Comparable<Clothing>{
    private String description;
    private double price;
    private String size = "M";
    public static final double MIN_PRICE = 10;
    private static final double TAX_RATE = 0.2;

    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + price * TAX_RATE;
    }

    public void setPrice(double price) {
        this.price = Math.max(price, MIN_PRICE);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getMinimumPrice() {
        return getMIN_PRICE();
    }

    public double getTax() {
        return getTAX();
    }

    public double getMIN_PRICE() {
        return MIN_PRICE;
    }

    public double getTAX() {
        return TAX_RATE;
    }

    @Override
    public String toString() {
        return getDescription() + "," + getSize() + "," + getPrice();
    }

    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }
}
