package example7;

public class Calculation23 {

	String brand;
	String model;
	double price;
		
	Calculation23(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	Calculation23(Calculation23 h){
		this.brand = h.brand;
		this.model = h.model;
		this.price = h.price;
	}
	void main() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
	}
	
	
	public static void main(String[] args) {
		
		Calculation23 C = new Calculation23("tata", "tojor", 2000000);
		C.main();
		
		Calculation23 D = new Calculation23(C);
		D.main();
				
	}

}
