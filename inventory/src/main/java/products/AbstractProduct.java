package products;

public abstract class AbstractProduct {

    protected String name;

    protected String id;

    protected double price;

    protected int quantity;

    public AbstractProduct(String name, String id, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract void display();

    public void inventoryStatus() {
        if(this.quantity > 0) {
            System.out.println(this.name + " is in stock");
        }else {
            System.out.println(this.name + " is not in stock");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
