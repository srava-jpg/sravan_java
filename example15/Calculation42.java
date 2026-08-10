package example15;

import java.util.Scanner;

public class Calculation42 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ascending order: ");
		int[] a = new int[5];
		
		int c = 0;
		
		for(int i=0; i<5; i++) {
			a[i] = sc.nextInt();
			
			}
			
			for(int i=0; i<5; i++) {
				
				if(a[i]< c) {
					c= a[i];
				}
		}

		System.out.println(c);
		}
}