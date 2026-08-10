package example19;

import java.util.Scanner;

public class DuckNumber {
	
	boolean isDuck(int num) {
		boolean status = false;
		
		int temp = num;
		int r;
		
		while(temp > 0) {
			r = temp%10;
			temp = temp/10;
			
			if(r ==0) {
				return true;			
			}			
		}
		
		return status;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DuckNumber a = new DuckNumber();
		
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		boolean result = a.isDuck(num);
		if(result) {
			System.out.println("duck: ");
		}
		
		else {
			System.out.println("not a duck: ");
		}
	}

}
