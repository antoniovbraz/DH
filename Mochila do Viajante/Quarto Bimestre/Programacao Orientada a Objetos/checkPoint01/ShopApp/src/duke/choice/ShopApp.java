package duke.choice;

/**
 * @author Antonio Henrique S Vanucci Braz
 */

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer();

        c1.name = "Pink";
        c1.size = "S";

        System.out.println("The customer is " + c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        items[2].description = "Green Scarf";
        items[2].price = 5.0;
        items[2].size = "S";

        items[3].description = "Blue T-Shirt";
        items[3].price = 10.5;
        items[3].size = "S";

     //   System.out.println("Item 1 is a " + item1.description + " price " + item1.price + " size " + item1.size);
     //   System.out.println("Item 2 is an " + item2.description + " price " + item2.price + " size " + item2.size);

        /** total = (item1.price + item2.price * 2) * (1 + tax); **/


        int measurement = 3;

        switch (measurement) {
            case 1, 2, 3 -> c1.size = "S";
            case 4, 5, 6 -> c1.size = "M";
            case 7, 8, 9 -> c1.size = "L";
            default -> c1.size = "X";
        }

        for (Clothing item : items
        ) {
            if (c1.size.equals(item.size)) {
                total += item.price;
                System.out.println("Item is an " + item.description + " price " + item.price + " size " + item.size);
                if (total > 15) {
                    break;
                }
            }
        }
        double totalWithTax = total + (total * (1 * tax));
        System.out.println("The total to pay after taxes are: " + totalWithTax);
    }
}
