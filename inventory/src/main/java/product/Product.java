package product;

public class Product extends AbstractProduct implements Sellable {

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
    }

    @Override
    public void sell(int quantity) {
        if(this.quantity >= quantity) {
            this.quantity -= quantity;
        }
    }
}