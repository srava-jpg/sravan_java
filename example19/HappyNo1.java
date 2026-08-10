package example19;

import java.util.Scanner;

public class HappyNo1 {
	
	boolean isHappy(int num) {
		boolean example = false;
		
		
		int temp= num;
		int rem;
		
		
		while(temp != 1 && temp != 4) {
		int sum = 0;
	
		while(temp > 0) {
			
			rem = temp%10;
			sum = sum + (int)Math.pow(rem, 2); 
			temp = temp /10;
		}
		temp = sum;
		
		if(temp == 1) {
			return true;
		}
		else {
			return false;
		}
		
		}
		
		return example;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HappyNo1 a = new HappyNo1();
		
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		String s1 = Integer.toString(num);
		int count = s1.length();
		
		boolean result = a.isHappy(num);
		
		if(result) {
			System.out.println("happy number: ");
		}
		
		else {
			System.out.println("not a happy number: ");
		}
		
	}

}
