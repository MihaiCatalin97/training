package orders.domain;

import products.AbstractProduct;
import java.util.List;


public class Order {

    private String id;

    private String clientName;

    private String address;

    private String phone;
    private List<AbstractProduct> products;

    private Double totalPrice;

    public Order(String id, String clientName, String address, String phone, List<AbstractProduct> products, Double totalPrice) {
        this.id = id;
        this.clientName = clientName;
        this.address = address;
        this.phone = phone;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public List<AbstractProduct> getProducts() {
        return products;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public String getClientName() {
        return clientName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setProducts(List<AbstractProduct> products) {
        this.products = products;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", clientName='" + clientName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", products=" + products +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
