package duke.choice;

/**
 * @author Antonio Henrique S Vanucci Braz
 */

public class ShopApp {
    public static void main(String[] args) {
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer("Pink",4);

        System.out.println("Min price is : " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket",20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf",5.0, "S"), new Clothing("Blue T-Shirt", 10.5,"S")};

        c1.addItems(items);

        System.out.println("The customer is " + c1.getName() + " size is " + c1.getSize() + ", Total cost:" + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems()) {
            //System.out.println("Item is an " + item.getDescription() + " price " + item.getPrice() + " size " + item.getSize());
            System.out.println("Item: " + item);
        }
        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("S")) {
                count++;
                average += item.getPrice();
            }
        }
        try{
            average = (count == 0) ? 0 : average/count;
            average = average /count;
            System.out.println("Average price " + average + ", Count " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by 0");
        }
    }
}
