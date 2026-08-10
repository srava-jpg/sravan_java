package example17;

import java.util.Scanner;

public class Calculation55 {
	static Scanner sc = new Scanner(System.in);
	
	
	boolean Palindrome(int num) {
		int originalNumber = num;
		int reverse = 0;
		
		while(num>0) {
			int digit = num%10;
			reverse = reverse * 10 + digit;
			num = num/10;
			
		}
		return originalNumber == reverse;
	}
		
	

	public static void main(String[] args) {
		
		Calculation55 a = new Calculation55();
		
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		
		if(a.Palindrome(num)) {
			System.out.println("palindrome ");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
