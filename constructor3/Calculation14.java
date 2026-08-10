package constructor3;
import java.util.*;

public class Calculation14 {
	int accountNumber;
	String accountHolder;
	 double balance;

	Calculation14(int accountNumber, String accountHolder, double balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		System.out.println(accountNumber);
		System.out.println(accountHolder);
		System.out.println(balance);
	}
	
	
	
	public static void main(String[] args) {
		
		Calculation14 A = new Calculation14(1234, "sravan", 10000);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter deposite amount:");
		double B = sc.nextDouble();
		
		double totalAmount = B + A.balance;
		System.out.println(totalAmount);
		
		
		System.out.println("enter withdraw amount:");
		double C = sc.nextDouble();
		
		double remainingAmount = totalAmount - C;
		System.out.println(remainingAmount);
		
		
	}

}
