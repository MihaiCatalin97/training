package products;

public class Electronics extends AbstractProduct implements Sellable{
	private String type;

	public Electronics(String name, String id, double price, int quantity, String type) {
		super(name, id, price, quantity);
		this.type = type;
	}

	@Override
	public void display() {
		System.out.println(type);
	}

	@Override
	public void sell(int quantity) {
		if(this.quantity >= quantity) {
			this.quantity -= quantity;
		}
	}
}
