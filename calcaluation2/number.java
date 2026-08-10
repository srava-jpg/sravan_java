package calcaluation2;

import java.util.Scanner;
public class number {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int A = sc.nextInt();
		
		System.out.println("enter second number: ");
		int B = sc.nextInt();
		
		System.out.println("enter third number: ");
		int C = sc.nextInt();
		
		if(A>=B && A>=C) {
			System.out.println("largest number A: " + A);
		}
		
		else if(B>=A && B>=C) {
			System.out.println("largest number B: " + B);
		}
		
		else {
			System.out.println("largest number C: " + C);
		}
	}

}
