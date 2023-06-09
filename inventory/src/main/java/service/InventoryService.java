package service;

import product.Product;

import java.util.*;

public class InventoryService implements Service<Product> {
    private Map<String, Product> productById;

    public InventoryService() {
        this.productById = new HashMap<>();
    }

    @Override
    public Product create(Product product) {
        this.productById.put(product.getId(), product);
        return product;
    }

    @Override
    public Product read(int id) {
        return this.productById.get(id);
    }

    @Override
    public boolean update(Product product) {
        if (productById.containsKey(product.getId())) {
            productById.put(product.getId(), product);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        if (productById.containsKey(id)) {
            productById.remove(id);
            return true;
        } else {
            return false;
        }
    }
}


