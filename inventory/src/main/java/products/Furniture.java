package products;

public class Furniture extends AbstractProduct implements Sellable{

    private String color;

    public Furniture(String name, String id, double price, int quantity, String color) {
        super(name, id, price, quantity);
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("Color: " + color);
    }

    @Override
    public void sell(int quantity) {
        if(this.quantity >= quantity) {
            this.quantity -= quantity;
        }

        price += 10;
    }
}
