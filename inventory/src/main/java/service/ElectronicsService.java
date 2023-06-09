package service;

import products.Electronics;

public class ElectronicsService implements Service<Electronics> {

    @Override
    public Electronics create(Electronics electronics) {
        electronics.setPrice(200);

        return null;
    }

    @Override
    public Electronics get(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
