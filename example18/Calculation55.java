package example18;

public class Calculation55{
	
	private double balance = 1000;
	
	void deposit() {
		double depositBalance = 500; 
		System.out.println(balance);
	}
	
	class B extends Calculation55{
		B b = new B();
		
		void hello() {
			deposit();
		}
	}
	
	public static void main(String[] args) {
		Calculation55 a = new Calculation55();
		
		a.deposit();
	}
}
