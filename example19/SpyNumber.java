package example19;

import java.util.Scanner;

public class SpyNumber {
	
	boolean IsSpyNumber(int num) {
		boolean status = false;
		
		int sum = 0;
		int product = 1;
		int temp = num;	
		int r;
		
		while(temp> 0) {
			r = temp%10;
			sum = sum + r;
			product = product * r;
			temp = temp/10;			
		}
		
		if(sum == product) {
			return true;
		}
		
		return status;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SpyNumber a = new SpyNumber();
		
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		boolean result = a.IsSpyNumber(num);
		
		if(result) {
			System.out.println("it is a spy number: ");
		}
		else {
			System.out.println("not a spy number: ");
		}
		
	}

}
