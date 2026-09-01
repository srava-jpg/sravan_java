package example3;

public class Cartitems1 {
	
		private String cartItems;
		private double amount;
		private int id;
		private int  quantity;
		
		public String getCartItems() {
			return cartItems;
		}
		
		public void setCartItems(String cartItems) {
			this.cartItems = cartItems;
		}
		
		public double getAmount() {
			return amount;
		}
		
		public void setAmount(double amount) {
			this.amount = amount;
		} 
	

		public void additem(int id, int quantity) {
			this.id = id;
			this.quantity= quantity;
		}
		
}
