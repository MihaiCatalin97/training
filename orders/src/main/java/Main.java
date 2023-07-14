import orders.database.OrderDatabase;
import orders.domain.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import products.Electronics;
import products.Furniture;
import orders.service.OrderService;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("orders-beans.xml");

		OrderService orderService = (OrderService) context.getBean("my-service");

		orderService.create(new Order("5",
				"Ionel Popovici",
				"Bucuresti, Grivitei, nr88",
				"0744444444",
				Arrays.asList(
						new Electronics("PC", "102", 300, 1, "PC"),
						new Furniture("Desk", "101", 100, 1, "gray")),
				400.
		));

		try{
			System.out.println(orderService.getById("5"));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}

		System.out.println("ALL ORDERS:");
		orderService.getAll().forEach(System.out::println);
	}
}
