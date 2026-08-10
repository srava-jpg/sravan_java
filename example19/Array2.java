package example19;

import java.util.Scanner;

public class Array2 {
	
	int positive = 0;
	int negative = 0;
	int zero =0;
	
	static Scanner sc = new Scanner(System.in);
	
	public void findingNumber() {
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			
			if(num[i] <100 && num[i]>-20) {
				
			
			if(num[i] >0) {
				
				positive++;
				
			}
				
			else if(num[i] <0) {
					
					negative++;
					
				
			}
			
			else if(num[i] == 0) {
				
				zero++;
				
			}
			
			else {
				System.out.println("not a valid number: ");
			}
			}	
		}
		System.out.println("positive: " + positive);
		System.out.println("negative: " + negative);
		System.out.println("zero: " + zero);
	}

	public static void main(String[] args) {
		
		
		
		Array2 a = new Array2();
		
		System.out.println("enter 10 numbers: ");
		  a.findingNumber();
		
		
	}

}
