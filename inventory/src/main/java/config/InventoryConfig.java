package config;

import database.InventoryDatabase;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import products.Electronics;
import products.Furniture;
import products.Sellable;
import service.ElectronicsService;
import service.FurnitureService;
import service.Service;

@Configuration
@ComponentScan(basePackages = "service, products")
public class InventoryConfig {

    @Bean(name = "my-inventory")
    public InventoryDatabase inventoryDatabase(){
        return new InventoryDatabase();
    }

    @Bean
    public Sellable electronicsProduct(){
        return  new Electronics("TV2", "999", 106, 1, "LCD");
    }

    @Bean
    public Sellable furnitureProduct(){
        return new Furniture("Bed2", "888", 300, 1, "red");
    }

}
