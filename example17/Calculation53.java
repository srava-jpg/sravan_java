package example17;

import java.util.Scanner;

public class Calculation53 {
	
	static Scanner sc = new Scanner(System.in);
	boolean prime(int number) {
		if(number <= 1) {
			return false;
		}
		
		for(int i =2; i<number; i++) {
			if(i % number == 0) {
				return false;
			}
		}
		
		return true;
		}
	
	public static void main(String[] args) {
		Calculation53 a = new Calculation53();
		
		System.out.println("enter a number: ");
		int number = sc.nextInt();
		
		if(a.prime(number)) {
			System.out.println("prime number: ");
		}
		
		else {
			System.out.println("is not a prime number");
		}
		}
		
		

	}


