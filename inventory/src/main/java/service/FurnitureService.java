package service;

import products.Furniture;

public class FurnitureService implements Service<Furniture> {
    @Override
    public Furniture create(Furniture furniture) {
        furniture.setQuantity(100);
        return null;
    }

    @Override
    public Furniture get(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
