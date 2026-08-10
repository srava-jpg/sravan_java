package example19;

import java.util.Scanner;

public class mergeArrays {

	static Scanner sc = new Scanner(System.in);
	void merge() {
		
		int[] a = new int[3];
		int N = a.length;
		
		for(int i=0; i<N; i++) {			
			a[i] = sc.nextInt();
		}
			
		System.out.println("enter another 3 numbers: ");
		
		int[] b = new int[3];
		int N1 = b.length;
		
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();					
		}
		
		
		
		int[] c= new int[N + N1];
		
		
		for(int i=0; i<N; i++) {
			c[i]= a[i];
			
		}
		
		for(int i=0; i<N1; i++) {
			c[i + b.length] = b[i];
			
		}
		
		for(int i=0; i<c.length; i++) { 
			System.out.println(c[i]);
		}
	}
	
	public static void main(String[] args) {
		
		mergeArrays a = new mergeArrays();
		
		System.out.println("enter 3 numbers: ");
		a.merge();
		
	}

}
