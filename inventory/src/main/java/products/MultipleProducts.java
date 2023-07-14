package products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MultipleProducts {

    private Sellable electronic;
    private Sellable furniture;


    public MultipleProducts(Sellable electronicsProduct,
                            Sellable furnitureProduct){
        this.electronic = electronicsProduct;
        this.furniture = furnitureProduct;
    }

    @Override
    public String toString() {
        return "MultipleProducts{" +
                "electronic=" + electronic +
                ", furniture=" + furniture +
                '}';
    }
}
