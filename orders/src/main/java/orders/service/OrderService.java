package orders.service;

import orders.database.OrderDatabase;
import orders.domain.Order;
import org.springframework.stereotype.Component;

import java.util.List;


public class OrderService {

    private OrderDatabase orderDatabase;

    public OrderService(OrderDatabase orderDatabase){
        this.orderDatabase = orderDatabase;
    }

    public List<Order> getAll() {
        return orderDatabase.getOrders();
    }

    public Order getById(String id) throws Exception{
        return orderDatabase.getOrders().stream()
                .filter(order -> order.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new Exception("Order not found!"));
    }

    public Order create(Order order){
        System.out.println("---------------------------");
        System.out.println("NEW ORDER for: " + order.getClientName() + " in " + order.getAddress());
        System.out.println("TOTAL: " + order.getTotalPrice());
        System.out.println("---------------------------");

        orderDatabase.addOrder(order);
        return order;
    }
}
