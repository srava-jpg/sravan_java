package example17;

import java.util.Scanner;

public class Calculation49 {

	public static void main(String[] args) {
		
		double wallet = 500;
		double originalplan = 200;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("recharge plan: ");
		double plan = sc.nextDouble();
		
		if(originalplan == plan) {
			
		
			System.out.println("valid plan: ");
		if(wallet > originalplan) {
			wallet = wallet - originalplan;
			System.out.println("wallet: " + wallet);			
		}
		
		else {
			System.out.println("mobile cannot rechargable : ");
		}
	}
	else {
		System.out.println("not valid: ");
	}

		sc.close();
	}
}
