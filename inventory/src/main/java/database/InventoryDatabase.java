package database;

import products.Electronics;
import products.Furniture;

import java.util.Arrays;
import java.util.List;

public class InventoryDatabase {

    private List<Electronics> electronicsDatabase = Arrays.asList(
            new Electronics("TV", "100", 100, 1, "LCD"),
            new Electronics("LAPTOP", "101", 200, 1, "MAC"),
            new Electronics("PC", "102", 300, 1, "PC"));

    private List<Furniture> furnitureDatabase = Arrays.asList(
            new Furniture("Bed", "100", 300, 1, "red"),
            new Furniture("Desk", "101", 100, 1, "gray"),
            new Furniture("Drawer", "102", 200, 1, "black"));

    public List<Electronics> getElectronicsDatabase() {
        return electronicsDatabase;
    }

    public List<Furniture> getFurnitureDatabase() {
        return furnitureDatabase;
    }
}
