package example19;

import java.util.Scanner;

public class Automorphic {
	
	int a;
	boolean isAutomorphic(int num) {
		boolean status = true;
		
		int temp = num;
		int square = num * num;
		
		System.out.println(square);
		
		while(temp > 0) {
			
			if(temp%10 != square%10) {
				return false;
			}
			temp = temp/10;
			square = square/10; 
		}
		return status;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		Automorphic a = new Automorphic();
		boolean result = a.isAutomorphic(num);
		
		if(result) {
			System.out.println(num + " " + "it is a automorphic number: ");
		}
		
		else {
			System.out.println(num + " " + "not automorphic number: ");
		}
		
	}

}
