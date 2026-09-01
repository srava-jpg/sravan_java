package example24;

public class Overriding2 {

	public static void main(String[] args) {

		Upi a = new Upi();
		a.pay();
	}

}

class payment{
	
	public void pay() {
		System.out.println("enter payment: ");
	}
}

class Creditcard extends payment{
	
	@Override
	public void pay() {
		System.out.println("payment done using creditcard: ");
	}
}

class Upi extends Creditcard{
	
	@Override
	public void pay() {
		System.out.println("Payment done using Api: ");
	}
}
