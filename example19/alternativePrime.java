package example19;

import java.util.Scanner;

public class alternativePrime {
	
	
	static int num;
	static int count =0;
	static void alternative(int range) {
						
		for(num=0; num<range; num++) {
			boolean isPrime =true;
			if(num <= 1) {
				isPrime = false;
			}
			
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
				
				if(count%2 == 0) {
				System.out.println(num);
				}
			}
		}
	}
		
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range: ");
		int range = sc.nextInt();
		
		alternative(range);
		
		
	}

}
