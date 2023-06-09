package order;

import java.util.*;

public class OrderService {

    private Map<Integer, Order> ordersById;

    public OrderService() {
        this.ordersById = new HashMap<>();
    }

    public Order createOrder(Order order) {
        this.ordersById.put(order.getId(), order);
        notifyGateway(order);
        return order;
    }

    public Order getOrder(int id) {
        return this.ordersById.get(id);
    }

    public boolean updateOrder(Order order) {
        if (ordersById.containsKey(order.getId())) {
            ordersById.put(order.getId(), order);
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteOrder(int id) {
        if (ordersById.containsKey(id)) {
            ordersById.remove(id);
            return true;
        } else {
            return false;
        }
    }

    private void notifyGateway(Order order) {
        // rabbitmq
        System.out.println("New order placed: " + order.getId());
    }
}
