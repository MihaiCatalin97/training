package service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import database.InventoryDatabase;
import org.junit.jupiter.api.Test;
import products.Furniture;

public class FurnitureServiceTest {


	FurnitureService furnitureService = new FurnitureService(new InventoryDatabase());

	@Test
	void testGet() throws Exception {
		Furniture furniture = furnitureService.get(100);
		assertNotNull(furniture);
	}


}
