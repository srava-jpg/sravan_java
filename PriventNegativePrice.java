package example22;

public class PriventNegativePrice {

	public static void main(String[] args) {
		
		Negativeprice a = new Negativeprice();
		a.setProductid(111);
		a.setProductname("floar");
		a.setPrice(100);
		a.setQuantity(500);
		
		a.addItem(30);
		a.removeItem(50);
		
		System.out.println(a.getProductid());
		System.out.println(a.getProductname());
		System.out.println(a.getPrice());
		System.out.println(a.getQuantity());
		
		
	}

}
