package example22;

public class Negativeprice {

	private int productId;
	private String productName;
	private double price; 
	private int quantity;
	public int amount = 0;
	
	public void setProductid(int productId) {
		this.productId = productId;
	}
	
	public int getProductid() {
		return productId;
	}
	
	public void setProductname(String productName) {
		this.productName = productName;
	}
	
	public String getProductname() {
		return productName;
	}

	public double getPrice() {
		return price;
		
	}

	public void setPrice(double price) {
		
		if(price>=0) {
			this.price = price;		
			System.out.println("it is a valid price: " + price);
		}
		else {
			System.out.println("it is not a valid price: " + price);
		}
	}
	
	public void addItem(double amount) {
		this.price = this.price + amount;
	}
	
	public void removeItem(double amount) {
		this.price = this.price- amount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
