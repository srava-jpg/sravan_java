package example19;

import java.util.Scanner;

public class NeonNumber {

	boolean isNeon(int num) {
		boolean status = false;
		
		int square = num * num;
		int temp = square;
		int r;
		int sum = 0;
				
		while(temp > 0) {
			
			r = temp%10;
			sum =sum + r;
			temp = temp/10;
			
			if(sum == num) {
				return true;
			}
		}
		return status;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NeonNumber a = new NeonNumber();
		
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		boolean result = a.isNeon(num);

		if(result) {
			System.out.println("neon number: ");
		}
		
		else {
			System.out.println("not neon: ");
		}
		
	}

}
