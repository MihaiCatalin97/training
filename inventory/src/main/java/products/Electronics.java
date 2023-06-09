package products;

public class Electronics extends AbstractProduct implements Sellable{
    private String type;

    @Override
    public void display() {
        System.out.println(type);
    }

    @Override
    public void sell(int quantity) {
        if(this.quantity >= quantity) {
            this.quantity -= quantity;
        }
    }
}
