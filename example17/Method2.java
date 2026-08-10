package example17;

import java.util.Scanner;

public class Method2 {
	
	static Scanner sc = new Scanner(System.in);
	boolean palindrome(int b) {
		int original = b;
		int reverse = 0;
		
		while(b >0){
			int digit = b%10;
			reverse = reverse * 10 + digit;
			b = b /10;
		}
		
		return original == reverse;
	}

	public static void main(String[] args) {
		
		Method2 a = new Method2();
		System.out.println("enter a number: ");
		int b = sc.nextInt();

		if(a.palindrome(b)) {
			System.out.println("it is palindrome: ");
		}
		else {
			System.out.println("not a palindrome : ");
		}
	}

}
