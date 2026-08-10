package example19;

import java.util.Scanner;

public class HappyNo {
	
	static boolean isHappy(int a) {
		boolean status = false;
		
		
		
		int r;
		int temp=a;
		
		String str = Integer.toString(a);
		int count = str.length();
		
		int sum = 0;
		while(a!=1 && a!=4) {
			

		while(a>0) {
			r = a%10;
			
			sum = sum + (int)Math.pow(r, count);
			a = a/10;			
		}
		a = sum;
		}
		return a == 1;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int a = sc.nextInt();
		
		boolean result = isHappy(a);
		if(result) {
			System.out.println("it is a happy number: ");
		}
		
		else {
			System.out.println("it is not a happy number: ");
		}
	}

}
