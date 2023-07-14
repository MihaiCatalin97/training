package service;

import database.InventoryDatabase;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import products.Electronics;

@Component
@DependsOn("my-inventory")
public class ElectronicsService implements Service<Electronics> {

    private InventoryDatabase inventoryDatabase;

    public ElectronicsService(InventoryDatabase inventoryDatabase) {
        this.inventoryDatabase = inventoryDatabase;
    }

    @Override
    public Electronics create(Electronics electronics) {
        electronics.setPrice(200);
        inventoryDatabase.getElectronicsDatabase().add(electronics);
        return electronics;
    }

    @Override
    public Electronics get(int id) throws Exception {
        return inventoryDatabase.getElectronicsDatabase().stream().filter( x -> x.getId()
                .equals(Integer.toString(id)))
                .findFirst().orElseThrow(() -> new Exception("Electronic product not found"));
    }

    @Override
    public boolean delete(int id) {
        return inventoryDatabase.getElectronicsDatabase().removeIf( x -> x.getId().equals(Integer.toString(id)));
    }
}
