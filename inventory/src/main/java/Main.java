import config.InventoryConfig;
import database.InventoryDatabase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import products.Electronics;
import products.Furniture;
import products.MultipleProducts;
import products.Sellable;
import service.FurnitureService;
import service.Service;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext(InventoryConfig.class);

        InventoryDatabase database = (InventoryDatabase) context.getBean("my-inventory");

        Sellable product = database.getElectronicsDatabase().get(0);
        System.out.println(product);
        Sellable productF = database.getFurnitureDatabase().get(0);
        System.out.println(productF);

//        context.getAutowireCapableBeanFactory().destroyBean(database);

        Service furnitureService = (FurnitureService) context.getBean("furnitureService");

        try{
            System.out.println(furnitureService.get(102));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        MultipleProducts multipleProducts = (MultipleProducts) context.getBean("multipleProducts");

        System.out.println(multipleProducts);


        Electronics electronics = new Electronics("Laptop", "1", 100, 1, "MAC");
        electronics.setQuantity(10);
        electronics.setPrice(100);
        electronics.sell(5);


        Furniture furniture = new Furniture("Drawer", "1", 100, 1, "Gray");
        furniture.setQuantity(10);
        furniture.setPrice(100);
        furniture.sell(5);

        System.out.println("Quantity of electronics: "+ electronics.getPrice());
        System.out.println("Quantity of furniture: "+ furniture.getPrice());
    }
}
