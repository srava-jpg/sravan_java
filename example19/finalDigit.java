package example19;

import java.util.Scanner;


public class finalDigit {
	static int sum = 0;
	
	static boolean digit(int num) {
		
		while(num >= 10) {
			int sum = 0;
			
			while(num > 0) {
				int a = num%10;
				sum = sum + a;
				num = num/10;
			}
			num = sum;
		}
		
		if(num != 1) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter a number: ");
		int num = sc.nextInt();		
		digit(num);
		
		if(num == 1) {
			System.out.println("true: " + num);
	}
		else {
			System.out.println("exit");
		}

}
}