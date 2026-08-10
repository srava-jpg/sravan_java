package constructor5;

public class Calculation16 {
	String brand;
	String model;
	double price;

	Calculation16(String brand, String model, int price){
		this.brand = brand;
		this.model  = model;
		this.price = price;
	}
	
	void displayDetails() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
	}
	public static void main(String[] args) {
		
		Calculation16 A = new Calculation16("tata", "alterz", 20000);
		A.displayDetails();
	}

}
