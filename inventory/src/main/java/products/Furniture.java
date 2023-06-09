package products;

public class Furniture extends AbstractProduct implements Sellable{
    private String color;

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
