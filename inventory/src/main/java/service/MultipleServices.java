package service;

import org.springframework.stereotype.Service;
import products.Electronics;
import products.Furniture;

@Service
public class MultipleServices {

    private service.Service<Furniture> myFurnitureService;
    private service.Service<Electronics> myElectronicsServce;

    public MultipleServices(service.Service<Furniture> myFurnitureService, service.Service<Electronics> myElectronicsServce) {
        this.myFurnitureService = myFurnitureService;
        this.myElectronicsServce = myElectronicsServce;
    }
}
