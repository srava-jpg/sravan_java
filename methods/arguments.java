package methods;

public class arguments {
	double amount = 10000;
	
	void balance() {
		System.out.println(amount);
	}
	
	void deposit(double deposit) {
		
		amount = amount + deposit;
	
	}

	public static void main(String[] args) {
		
		arguments A = new arguments();
		A.balance();
	
		A.deposit(5000);
		A.balance();
	}

}
