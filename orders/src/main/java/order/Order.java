package order;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private String productId;
    private int quantity;
    private double total;
    private LocalDateTime orderTime;

    public Order(int id, String productId, int quantity, double total, LocalDateTime orderTime) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.total = total;
        this.orderTime = orderTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
}
