package example17;

import java.util.Scanner;

public class Calculation54 {
	static Scanner sc = new Scanner(System.in);
	
	static int count = 0;
	
	
	 void oddIndex(int num) {
		for(int i=1; i<=50; i++) {			
			if(i%2 == 1) {
				if(count < num) {
				System.out.println(i);
			}
				count++;
		}
		}
	}

	public static void main(String[] args) {
		
		Calculation54 a = new Calculation54();
		System.out.println("enter a number: ");
		
		 int num =sc.nextInt();
		a.oddIndex(num);
		
	}

}
