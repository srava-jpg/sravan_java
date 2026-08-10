package example18;

import java.util.Scanner;

public class Calculation57 {

	public static void main(String[] args) {
		
		Calculation57 b = new Calculation57();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		boolean palindrome = b.isPalindrome(num);
		
		if(palindrome) {
			System.out.println("it is palindrome: ");
		}
		
		else {
			System.out.println("not a palindrome: ");
		}

	}
	
	int d;
	int reverse = 0;
	
	boolean isPalindrome(int num) {
		int original;
		
		while(num > 0) {
			d = num % 10;
			num = num/10;
			reverse = reverse * 10 + d;
		}
		return original = num;
	}

}
