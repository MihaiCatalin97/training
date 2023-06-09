package product;

public class DiscountedProduct extends Product {
    private double discountRate;

    public DiscountedProduct(String id, String name, double price, double discountRate) {
        super(id, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * (1 - discountRate);
    }
}
