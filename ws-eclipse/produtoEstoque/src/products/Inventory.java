package products;

public class Inventory {
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock(int quantity) {
		return price*quantity;
	}

	public int addProducts(int quantity) {
		quantity += this.quantity;
		return quantity;
	}

	public int removeProducts(int quantity) {
		this.quantity = this.quantity - quantity;
		return this.quantity;
	}

}
