package example19;

import java.util.Scanner;

public class PracticeArmstrong {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PracticeArmstrong a = new PracticeArmstrong();
		
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		
		System.out.println("enter index1: ");
		int c = sc.nextInt();
		
		System.out.println("enter index2: ");
		int d = sc.nextInt();
		
		String no = Integer.toString(n);
		 char[] digit = no.toCharArray();
		
		 char temp= digit[c];
		digit[c] = digit[d];
		digit[d] = temp;
			
		String result = new String(digit);	
		System.out.println(result);
		
	}

}
