package example19;

import java.util.Scanner;

public class PetersonNumber {
	
	boolean isPeterson(int num) {
		boolean status = false;
		
		int temp = num;
		int r;
		int sum = 0;
		while(temp>0) {
			r = temp%10;
			
			int fact =1;
			for(int i=1; i<=r; i++) {
				fact = fact*i;
			}
			temp = temp/10;
			sum = sum + fact;
			
			if(num == sum) {
				return true;
			}
		}
		
		return status;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PetersonNumber a = new PetersonNumber();
		
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		boolean result = a.isPeterson(num);
		
		if(result) {
			System.out.println("peterson number: ");
		}
		else {
			System.out.println("not a peterson number: ");
		}
		
	}

}
