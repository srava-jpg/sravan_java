package example3;

public class ShoppingCart {

	public static void main(String[] args) {
		
		Cartitems1 a = new Cartitems1();
		a.setCartItems("bat");
		a.setAmount(1500);
		
		System.out.println(a.getCartItems());
		System.out.println(a.getAmount());
		
		Cartitems1 b  = new Cartitems1();
		b.additem(123, 500);
		
		
	}

}
