package calculation4;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter account holder name: ");
		String name = sc.nextLine();
		
		System.out.println("enter current balance: ");
		double balance = sc.nextDouble();
		
		System.out.println("enter withdrawal amount: ");
		double amount = sc.nextDouble();
		
		if(balance>amount) {
			balance = balance-amount;
			System.out.println("withdrawal successful");
			System.out.println(name);
			System.out.println(balance);
		}
		
	}

}
