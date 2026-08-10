package addingItems;

public class arguments2 {
	
	void main(String itemName1, int quantity1) {
		System.out.println(itemName1);
		System.out.println(quantity1);
		
	}

	public static void main(String[] args) {
		String itemName = "sravan";
		System.out.println(itemName);
		
		int quantity = 500;
		System.out.println(quantity);
		
		arguments2 A = new arguments2();
		A.main("milkpacket", 600);

	}

}
