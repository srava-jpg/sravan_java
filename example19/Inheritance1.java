package example19;

import java.util.Scanner;

public class Inheritance1 {
	
	void pattern() {
		
		int num = 5;
		for(int i =1; i<=num; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i =1; i<=num; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("");
			}
			
			System.out.print("*");
		}

		
	}
	
	public static void main(String[] args) {
			
		Inheritance1 a = new Inheritance1();
		a.pattern();
}
}

