package orders.database;

import static java.util.Collections.singletonList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import orders.domain.Order;
import org.springframework.stereotype.Component;
import products.Electronics;
import products.Furniture;

@Component
public class OrderDatabase {

	private List<Order> orders;

	public OrderDatabase() {
		orders = new ArrayList<>(Arrays.asList(new Order("1",
						"George Popescu",
						"Iasi, Tudor Vladimirescu, nr12",
						"0711111111",
						singletonList(new Furniture("Bed", "100", 300, 1, "red")),
						300.),
				new Order("2",
						"Sebastian Ionescu",
						"Bucuresti, Florilor, nr1, blE1, ap5",
						"0722222222",
						Arrays.asList(
								new Furniture("Desk", "101", 100, 1, "gray"),
								new Furniture("Bed", "100", 300, 1, "red")
						),
						400.),
				new Order("3",
						"Andrei Andreescu",
						"Tulcea, Principala, nr88",
						"0733333333",
						singletonList(new Electronics("TV", "100", 100, 1, "LCD")),
						100.),
				new Order("4",
						"Mihaela Mihailescu",
						"Timisoara, Traian, nr5",
						"0744444444",
						Arrays.asList(
								new Electronics("PC", "102", 300, 1, "PC"),
								new Furniture("Desk", "101", 100, 1, "gray")),
						400.
				)));
	}

	public List<Order> getOrders(){
		return orders;
	}

	public Order addOrder(Order order){
		orders.add(order);
		return order;
	}
}
