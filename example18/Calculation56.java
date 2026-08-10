package example18;

import java.util.Scanner;

public class Calculation56 {

	public static void main(String[] args) {
		
		Calculation56 b = new Calculation56();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		boolean number = b.isStrong(num);
		
		if(number) {
			System.out.println("it is a strong number: ");
		}
		else {
			System.out.println("not a strong number: ");
			
		}
	}
	
	int sum = 0;
	int fact = 1;
	int rem = 0;
	
	
	boolean isStrong(int num) {
		
		int original = num;
		while(num >0) {
			rem = num % 10;
			num = num / 10;
			
			for(int i= 1; i<=rem; i--) {
				fact = fact * i;
			}
			
			
			
			
				sum = sum + fact;
			
			}
		return sum == original;
		}
	
		
		
	}


