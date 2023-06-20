package service;

import database.InventoryDatabase;
import products.Furniture;

public class FurnitureService implements Service<Furniture> {

    private InventoryDatabase inventoryDatabase;

    public FurnitureService(InventoryDatabase inventoryDatabase) {
        this.inventoryDatabase = inventoryDatabase;
    }


    @Override
    public Furniture create(Furniture furniture) {
        furniture.setQuantity(100);
        inventoryDatabase.getFurnitureDatabase().add(furniture);
        return furniture;
    }

    @Override
    public Furniture get(int id) throws Exception {
        return inventoryDatabase.getFurnitureDatabase().stream().filter( x -> x.getId()
                        .equals(Integer.toString(id)))
                .findFirst().orElseThrow(() -> new Exception("Furniture product not found"));
    }

    @Override
    public boolean delete(int id) {
        return inventoryDatabase.getFurnitureDatabase().removeIf( x -> x.getId().equals(Integer.toString(id)));

    }
}
