package duke.choice;

/**
 * @author Antonio Henrique S Vanucci Braz
 */

public class Customer {
    private String name;
    private String size;
    private Clothing[] items;


    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public void addItems(Clothing[] someItems) {
        setItems(someItems);
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost(){
        double total = 0.0;

        for (Clothing item : getItems()) {
            total = total + item.getPrice();
        }
        return total;
    }

    /* public boolean fit (Customer customer){
        return getSize().equals(customer.getSize());
    } */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String newSize) {
        this.size = newSize;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3 -> setSize("S");
            case 4, 5, 6 -> setSize("M");
            case 7, 8, 9 -> setSize("L");
            default -> setSize("XL");
        }
    }

    public void setItems(Clothing[] items) {
        this.items = items;
    }
}
