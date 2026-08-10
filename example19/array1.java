package example19;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("enter 5 numbers: ");
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int largest = a[0];
		int second = a[0];
		for(int i=0; i<a.length; i++) {
			
			if(a[i] > largest) {
				largest = a[i];
			}
			
			
		}
		
		for(int i=0; i<a.length; i++) {
			
		if(a[i] > largest && a[i] != largest) {
			second = a[i];
			
		}
		}
		System.out.println(second);
		
}
}