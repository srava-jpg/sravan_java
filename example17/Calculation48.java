package example17;

import java.util.Scanner;

public class Calculation48 {

	public static void main(String[] args) {
		
		double originalPin = 1234;
		double dailyLimit = 40000;
		double balance = 50000;
		String yn = "";
		int count = 0;
		
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("enter the pin: ");
		double pin = sc.nextDouble();
		
		if(originalPin == pin) {
			System.out.println("valid pin: ");
				
		System.out.println("withdraw amount: ");
		
		double withdraw = sc.nextDouble();
		
		
		if(dailyLimit > withdraw) {
			
			
			System.out.println("withdraw successfully: ");
			count++;
			System.out.println("withdraw count: " + count);
			if(count<2) {
				System.out.println("continue: ");
			
		
		System.out.println("enter balance: ");
		

		if(balance > withdraw) {
			balance = balance - withdraw;
			
			System.out.println("balance: " + balance);
			
			
		
		}else {
			System.out.println("insufficient balance: ");
		}
		
			}else {
				break;
			}
		}else {
			System.out.println("limit is exceeded: ");
			
		}
		
		}	else {
		System.out.println("not a valid pin: ");
		System.out.println("to continue Click y or n to exit");
		}
		System.out.println("to continue Click y or n to exit");
		yn = sc.next();
		System.out.println("--------------");
		
		}
		while(yn.equalsIgnoreCase("y")) ;
		System.out.println("exit");
		
					
	}
}
