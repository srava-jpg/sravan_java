package recharge;

public class arguments1 {
	
void main() {
	System.out.println("plan Name : unlimited 299");
	}
	
	void main1(double recharge) {
		System.out.println("recharge successfully");
		System.out.println("Recharge amount: " + recharge);
	
	}
	
	void addition(double a, double b) {
		double sum = a+b;
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
		arguments1 A = new arguments1();
		A.main();
		A.main1(299);
		A.addition(299, 20);
	}

}
