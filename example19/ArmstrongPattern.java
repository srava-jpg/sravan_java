package example19;

import java.util.Scanner;

public class ArmstrongPattern {
	
	static int r = 0;
	static int sum = 0;
	
	static int temp = num;
	static boolean isArm(int d) {
		
		for(int temp=1; temp<=d; temp++) {
		
			String con = Integer.toString(temp);
			int count = con.length();
			
			while(temp > 0) {
				r = temp%10;
				sum = sum + (int)Math.pow(r, count);
				temp = temp/10;
				
			}
			if(sum == num) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArmstrongPattern a = new ArmstrongPattern();
			
		System.out.println("enter rows: ");
		int rows = sc.nextInt();
		
		int ex = 1;
		for(int p=1; p<=rows; p++) {
			int[] array = new int[p]; 
			
			if(isArm(ex)) {			
				int ind = 0;
				
				while(p>ind) {
					array[p] = ex;
					System.out.println(ex);
					ind++;
				}
				ex++;
			}
			
		}
		
	}

}
