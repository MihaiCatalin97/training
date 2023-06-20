import products.Electronics;
import products.Furniture;

public class Main {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("Laptop", "1", 100, 1, "MAC");
        electronics.setQuantity(10);
        electronics.setPrice(100);
        electronics.sell(5);


        Furniture furniture = new Furniture("Drawer", "1", 100, 1, "Gray");
        furniture.setQuantity(10);
        furniture.setPrice(100);
        furniture.sell(5);

        System.out.println("Quantity of electronics: "+ electronics.getPrice());
        System.out.println("Quantity of furniture: "+ furniture.getPrice());
    }
}